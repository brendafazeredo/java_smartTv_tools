package java_smartTv_tools;

public class User {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();

        System.out.println("Current channel: " + smartTv.channel);

        smartTv.changeChannel(13);

        System.out.println("Current channel: " + smartTv.channel);
        System.out.println("Current volume: " + smartTv.volume);

        System.out.println("Is the TV powered on? " + smartTv.poweredOn);
        System.out.println("Current volume: " + smartTv.volume);

        smartTv.powerOn();
        System.out.println("New status -> Is the TV powered on? " + smartTv.poweredOn);

        smartTv.powerOff();
        System.out.println("New status -> Is the TV powered on? " + smartTv.poweredOn);
    }
}