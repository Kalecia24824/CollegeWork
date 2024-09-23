public class TestTV {  
    public static void main(String[] args) {
      
      //Creating a new object of type TV called tv1
      TV tv1 = new TV();
      
      
      tv1.turnOn(); //Turn on the TV (tv1)
      tv1.setChannel(30); //setting the channel to 30 for tv1
      tv1.setVolume(3);//setting the volumen to 3 for tv1
      
      //Creating a new object of type TV called tv2
      TV tv2 = new TV();
      
      tv2.turnOn();//Turn on the TV (tv1)
      tv2.channelUp();//moving the channel up by 1 for the tv2 object
      tv2.channelUp();//moving the channel up by 1 for the tv2 object
      tv2.volumeUp();//increasing the volume by 1 for the tv2 object 
      
      //printing tv1 current channel and volume 
      System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
      
       //printing tv1 current channel and volume
      System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }//end of main
  }//end of class 
  