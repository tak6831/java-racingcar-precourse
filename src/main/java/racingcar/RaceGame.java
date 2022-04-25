package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Pattern;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RaceGame {
    private static final int MOVING_FORWARD = 4;
    private static final String ERROR_MESSAGE = "[ERROR]";
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;
    public static final int STOP = 3;

    public String inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }
    public String[] inputArray(String inputString){
        return inputString.split(",");
    }
    public static void throwErrorMessage(String message) throws IllegalArgumentException{
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

    public int inputRandomNumber() {
        return pickNumberInRange(MIN_NUM, MAX_NUM);
    }

    public int inputGameCount() {
        try{
            return Integer.parseInt(Console.readLine());
        }catch(Exception e){
            throwErrorMessage("숫자가 아닙니다.");
            return inputGameCount();
        }
    }
}
