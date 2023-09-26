package fc.java.course1.model;

public class CarUtility {
    public void carInfoPrint(CarDTO car){
        System.out.println(car.carSn + "\t" + car.carName  + "\t" + car.carPrice + "\t" + car.carOwner + "\t" + car.carYear + "\t" + car.carType);
    }
}
