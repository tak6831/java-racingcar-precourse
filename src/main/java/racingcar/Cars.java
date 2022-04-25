package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cars {

    List<Car> carList;
    private int gameCount;

    public void addCar(String[] carArray, int gameCount) {
        List<Car> carList = new ArrayList<>();
        for(int i=0; i<carArray.length; i++){
            carList.add(new Car(carArray[i],gameCount));
        }
        this.carList = carList;
        this.gameCount = gameCount;
    }

    public String[] getWinner() {
        String[] winner = new String[]{};
        int winnerCount = 1;
        String winnerLength = "";
        for(int i=0;i<this.carList.size();i++){
            if(winnerLength.length()<this.carList.get(i).getResult().length()) winner[0] = this.

                    carList.get(i).getCarName();
            if(winnerLength.length()==this.carList.get(i).getResult().length()){
                winner[0+winnerCount] = this.carList.get(i).getCarName();
                winnerCount++;
            }
        }
        return winner;
    }
}
