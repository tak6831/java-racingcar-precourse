package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    Cars cars;
    @BeforeEach
    void setUp() {
        cars = new Cars();
        cars.addCar(new String[]{"K3","K5"},5);
    }

    @Test
    void Cars에_Car여러개담기(){
        assertThat(cars.carList).isInstanceOf(List.class);
    };
    @Test
    void 우승자가져오기(){
        assertThat(cars.getWinner())
                .isInstanceOf(String.class)
                .isEmpty();
    }

}