package racingcar.service;

import camp.nextstep.edu.missionutils.Console;

public class RaceService {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;
    private static final String ERROR_MESSAGE = "[ERROR]";

    public String inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputString = Console.readLine();
        return inputString;
    }
    public String[] inputArray(String inputString){
        String[] inputArray = inputString.split(",");
        return inputArray;
    }
    public void throwErrorMessage(String message){
        new IllegalArgumentException(ERROR_MESSAGE+message);
    }

    public void lengthValidation(String s ) {
        if(s.length()>5) throwErrorMessage("자동차 이름을 5자를 넘지않게 해주세요.");
    }

    public void splitValidation(String s) {
    }
}
