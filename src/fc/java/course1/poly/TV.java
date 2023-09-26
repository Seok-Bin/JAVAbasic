package fc.java.course1.poly;

public class TV implements Remocom{
    private int thisCh = 99;
    private int thisVol = 50;

    @Override
    public void chUp() {
        thisCh ++;
        if (thisCh > Remocom.MaxCh){
            thisCh = 1;
        }
        System.out.println("TV채널이 " + thisCh +"번으로 올라감");
    }

    @Override
    public void chDown() {
        thisCh--;
        if (thisCh < Remocom.MinCh){
            thisCh = 99;
        }
        System.out.println("TV채널이 " + thisCh +"번으로 내려감");
    }

    @Override
    public void volUp() {
        thisVol ++;
        if (thisVol > Remocom.MaxCh){
            thisVol = 1;
        }
        System.out.println("TV볼륨이 " + thisVol +"으로 올라감");
    }

    @Override
    public void volDown() {
        thisVol--;
        if (thisVol < Remocom.MinCh){
            thisVol = 99;
        }
        System.out.println("TV볼륨이 " + thisVol +"으로 내려감");
    }

    @Override
    public void internet() {
        System.out.println("TV에서 인터넷이 구동됨");
    }
}
