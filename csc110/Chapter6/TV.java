package Chapter6;

//class TV.java
//CSC110AA
//written by : Jeff Ciferno
//description : TV class.  Creates 2 objects and tests behavior

public class TV {
	
    private int channel;
    private int volume;
    private boolean on;
    private int maxChannel;
    private int maxVolume;

    public TV() 
    { 
        channel = 1;
        volume = 1;
        on = false;
        maxChannel = 1;
        maxVolume = 1;
    }
    public int getChannel() 
    {
        return channel;
    }

    public int getVolume() 
    {
        return volume;
    }

    public boolean isOn() 
    {
        return on;
    }

    public int getMaxChannel() 
    {
        return maxChannel;
    }

    public int getMaxVolume() 
    {
        return maxVolume;
    }


    public void setChannel(int Channel1) {
        if (on && Channel1 >= 1 && Channel1 <= maxChannel) {
       channel = Channel1;
        }}

    public void setVolume(int Volume1) 
    {
        if (on && Volume1 >= 1 && Volume1 <= maxVolume) 
        {
       volume = Volume1;
        }}

    public void setMaxChannel(int maxChan) 
    {
        maxChannel = maxChan;
    }

    public void setMaxVolume(int maxVol) 
    {
        maxVolume = maxVol;
    }

   

    public void turnOn() 
    {
        on = true;
    }

    public void turnOff() 
    {
        on = false;
    }

    public void channelUp() {
        if (on) {
            channel++;
        if (channel > maxChannel) {
               channel = 1;
            }}}

    public void channelDown() {
        if (on) {
            channel--;
        if (channel < 1) {
                channel = maxChannel;
        }}}

    public void volumeUp() {
        if (on && volume < maxVolume) {
            volume++;}}

    public void volumeDown() {
        if (on && volume > 0) {
            volume--;
        }}

    public String toString() {
        return ("Channel: " + channel +
                "\nVolume: " + volume +
                "\nIs the TV on?: " + on +
                "\nMax Channel: " + maxChannel +
                "\nMax Volume: " + maxVolume);
    }}

