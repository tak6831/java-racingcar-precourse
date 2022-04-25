package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Pattern;

public class RaceGame {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;
    private static final String ERROR_MESSAGE = "[ERROR]";

    public String inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputString = Console.readLine();
        return inputString;
    }
    public String[] inputArray(String inputString){
        return inputString.split(",");
    }
    public void throwErrorMessage(String message) throws IllegalArgumentException{
        throw new IllegalArgumentException(ERROR_MESSAGE+message);
    }

    public void lengthValidation(String inputString ) {
        if(lengthCondition(inputString)) throwErrorMessage("자동차 이름을 5자를 넘지않게 해주세요.");
    }

    private boolean lengthCondition(String inputString) {
        return inputString.length() > 5;
    }

    public void splitValidation(String inputString) {
        if(stringCondition(inputString)) throwErrorMessage("입력 형식이 맞지 않습니다.");
    }

    private boolean stringCondition(String inputString) {
        return !Pattern.matches("^[,a-zA-Z]*$", inputString)
                || inputString.startsWith(",")
                || inputString.endsWith(",");
    }
}
