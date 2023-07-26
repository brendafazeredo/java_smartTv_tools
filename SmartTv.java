// Let's create an example of a class to represent a SmartTV where:
// 1. It has the following characteristics: powered on (boolean), channel number (int), and volume level (int).
// 2. The SmartTV can be turned on and off, thus changing its powered on state.
// 3. The volume level can be increased or decreased by one unit at a time.
// 4. The SmartTV can change the channel either by incrementing or decrementing the channel number by 1, or by directly setting the channel number to a specific value.

package java_smartTv_tools;

public class SmartTv {
    boolean poweredOn = false;
    int channel = 1;
    int volume = 25;

    public void powerOn() {
        poweredOn = true;
    }

    public void powerOff() {
        poweredOn = false;
    }

    public void increaseVolume() {
        System.out.println("Increasing volume to: " + volume);
        volume++;
    }

    public void decreaseVolume() {
        System.out.println("Decreasing volume to: " + volume);
        volume--;
    }

    public void increaseChannelNumber() {
        channel++;
    }

    public void decreaseChannelNumber() {
        channel--;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
}