public class TV {
  
    //Defines Data field (Properties)
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // By default TV is off
    
    //This is the constructor method (used to create a new object)
    public TV() {
    }
    
    //These are the class methods (behaviors)
    
    //This methods turns on the tv
    public void turnOn() {
      on = true;
    }
    
    //This method turns off the TV
    public void turnOff() {
      on = false;
    }
    
    
    //This method sets the channel to the specified number/value
    public void setChannel(int newChannel) {
      if (on && newChannel >= 1 && newChannel <= 120)
        channel = newChannel;
    }
    
    //This method sets the volume to the specified number
    public void setVolume(int newVolumeLevel) {
      if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
        volumeLevel = newVolumeLevel;
    }
    
    //This method increments by one (adds)
    public void channelUp() {
      if (on && channel < 120)
        channel++;
    }
    
    //This method decrements by one (subtracts)
    public void channelDown() {
      if (on && channel > 1)
        channel--;
    }
    
    //This method increments the volume by one (adds)
    public void volumeUp() {
      if (on && volumeLevel < 7)
        volumeLevel++;
    }
    
    //This method decrements the volume by one (subtracts)
    public void volumeDown() {
      if (on && volumeLevel > 1)
        volumeLevel--;
    }
  }//end of class
  