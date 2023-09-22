package fc.java.course2.model2;

public class AverageCalculator <T extends Number>{
    private T[] arr;

    public AverageCalculator(T[] number){
        this.arr = number;
    }

    public double calculateAverage(){
        double sum = 0.0;
        for (T num: arr){
            sum += num.doubleValue();
        }
        return sum/ arr.length;
    }
}
