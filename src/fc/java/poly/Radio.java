package fc.java.poly;

public class Radio implements Remocom{
    private int thisCh = 12;
    private int thisVol = 30;
    @Override
    public void chUp() {
        thisCh ++;
        if (thisCh > Remocom.MaxCh){
            thisCh = 1;
        }
        System.out.println("Radio채널이 " + thisCh +"번으로 올라감");
    }

    @Override
    public void chDown() {
        thisCh--;
        if (thisCh < Remocom.MinCh){
            thisCh = 99;
        }
        System.out.println("Radio채널이 " + thisCh +"번으로 내려감");
    }

    @Override
    public void volUp() {
        thisVol ++;
        if (thisVol > Remocom.MaxCh){
            thisVol = 1;
        }
        System.out.println("Radio볼륨이 " + thisVol +"으로 올라감");
    }

    @Override
    public void volDown() {
        thisVol--;
        if (thisVol < Remocom.MinCh){
            thisVol = 99;
        }
        System.out.println("Radio볼륨이 " + thisVol +"으로 내려감");
    }

    @Override
    public void internet() {
        System.out.println("Radio에서는 인터넷이 지원되지 않음");
    }
}
