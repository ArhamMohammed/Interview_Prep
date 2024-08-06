package com.company;

class Phone{
    public void name(){
        System.out.println("My name is Java in class one");
    }

     public void greet(){
         System.out.println("Good Morning");
     }

}

class SmartPhone extends Phone{
    @Override
    public void name(){
        System.out.println("My name is Java from class two");
    }

    public void swagat(){
        System.out.println("Aapka swagat hai");
    }

}


public class cwh_49_DynamicMethodDispatch {
    public static void main(String[] args) {

//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.name();

        Phone obj = new SmartPhone();
        obj.greet();
        obj.name();
//        obj.swagat();
    }
}
