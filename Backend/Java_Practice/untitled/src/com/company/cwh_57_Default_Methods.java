package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K");
    }
}

interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{

    public void CallNumber(long Number){
        System.out.println("Calling the number "+Number);
    }


    public void PickNumber(long Number){
        System.out.println("Getting a call from number "+Number);
    }

}

class MySmartPhone extends MyCellPhone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("Take a Snap on Camera");
    }
    public void recordVideo() {
        System.out.println("Record a video");
    }

    @Override
    public void record4KVideo(){
        System.out.println("Overridden recording in 4K");
    }

    public String [] getNetworks(){
        System.out.println("Getting the list of the networks");
        return new String[]{"Arham","5GHZNetwork","TalhaWIfi"};
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to Network "+network);
    }
}

public class cwh_57_Default_Methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String [] arr = ms.getNetworks();

        for(String item:arr){
            System.out.println(item);
        }

    }
}
