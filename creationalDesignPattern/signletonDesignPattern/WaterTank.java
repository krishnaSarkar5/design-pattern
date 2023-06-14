package creationalDesignPattern.signletonDesignPattern;

import java.util.Objects;

public class WaterTank {
    

    private static WaterTank waterTank;

    private WaterTank(){}


    public static WaterTank getInstance(){

        if(Objects.isNull(waterTank)){
            waterTank = new WaterTank();
            return waterTank;
        }else{
            return waterTank;
        }
    }
}
