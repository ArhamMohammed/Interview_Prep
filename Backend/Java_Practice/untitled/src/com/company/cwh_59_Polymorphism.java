package com.company;

interface Camera2{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K");
    }
}

interface Wifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{

    public void CallNumber(long Number){
        System.out.println("Calling the number "+Number);
    }


    public void PickNumber(long Number){
        System.out.println("Getting a call from number "+Number);
    }

}

class MySmartPhone2 extends MyCellPhone2 implements Wifi2,Camera2{
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
    public void sampleMeth(){
        System.out.println("Sample Meth");
    }
}


public class cwh_59_Polymorphism {
    public static void main(String[] args) {

        Camera2 cam1 = new MySmartPhone2(); // This is a smartphone please use it as a camera. Dont use it as a WIFI.
//        Not allowed for good
//        cam1.getNetworks();
//        cam1.sampleMeth();
        cam1.record4KVideo();

        MySmartPhone2 msp2 = new MySmartPhone2();
        msp2.getNetworks();
        msp2.record4KVideo();
        msp2.CallNumber(123456789);
        msp2.PickNumber(12345678);

}
}
