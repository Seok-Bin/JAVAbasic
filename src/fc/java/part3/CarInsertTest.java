package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 키보드를 이용하여 자동차 정보를 받아 DB에 저장
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

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
    }
}
