package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차의 일련번호 : ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차의 이름 : ");
        String carName = scan.nextLine();

        System.out.print("자동차의 각격 : ");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차의 소유자 : ");
        String carOwner = scan.nextLine();

        System.out.print("자동차의 연식 : ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차의 타입 : ");
        String carType = scan.nextLine();

        // System.out.println(carSn + "\t" + carName  + "\t" + carPrice + "\t" + carOwner + "\t" + carYear + "\t" + carType);
        // carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarUtility A = new CarUtility() ;
        A.carInfoPrint(car);

    }

//    public static void carInfoPrint(CarDTO car){
//        System.out.println(car.carSn + "\t" + car.carName  + "\t" + car.carPrice + "\t" + car.carOwner + "\t" + car.carYear + "\t" + car.carType);
//    }

}
