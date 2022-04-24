package racingcar.service;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import camp.nextstep.edu.missionutils.Console;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RaceServiceTest extends NsTest {

    RaceService raceService;

    @BeforeEach
    void setUp() {
        this.raceService = new RaceService();
    }

    @Test
    void 입력값받기(){
        String input = "Sonata,K5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String inputString = raceService.inputCarName();
        assertThat(inputString).isNotEmpty();
    }
    @Test
    void 에러메세지확인(){
        raceService.throwErrorMessage("길이 초과");
    }
    @Test
    void 차이름길이확인(){
        assertThatThrownBy(()-> {
            raceService.lengthValidation("sonata");
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    void 차구분확인(){
        assertThatThrownBy(()-> {
            raceService.splitValidation("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Override
    protected void runMain() {

    }
}
