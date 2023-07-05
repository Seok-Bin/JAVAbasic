package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn = 1100;
        String carName = "BMW";
        int carPrice = 9000000;
        String carOwner = "KIM";
        int carYear = 2015;
        String carType = "G";

        // 데이터를 하나로 묶기 (이동 편리)
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarUtility util = new CarUtility();
        util.carInfoPrint(car);
    }
}
