package com.company;

interface bicycle{
    int price = 45000;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    public int x = 45;
    void blowhornK3G();
    void blowhornMHN();
}

class AvonCycle implements bicycle, HornBicycle{
    int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Paw Paw!!");
    }
   public  void applyBrake(int decrement){
        System.out.println("Applying brake with speed decrementing at "+decrement+" km/hr");
    }
    public void speedUp(int increment){
        System.out.println("Increasing Speed with speed incrementing at "+increment+" km/hr");
    }

    public void blowhornK3G(){
        System.out.println("Kabhi Khusi Kabhi Gum");
    }
    public void blowhornMHN(){
        System.out.println("Kiska hai yeh tumko intezaar main hoon na");
    }


}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(10);
//        You can create properties in Interfaces and call it
        System.out.println("The starting price of the bicycles would be INR "+ ac.price);
//        You cannot change the values/properties from an interface as the values/properties are final
//        It can be changed only in the classes.
//        ac.price = 60000;
//        Cannot modify the ac.price value.

        ac.blowhornMHN();
        ac.blowhornK3G();
    }
}
