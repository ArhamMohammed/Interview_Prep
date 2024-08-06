package com.company;

//class Base {
//    int x;
//
//    public int getX() {
//        System.out.println("I am getting x now from the base class");
//        return x;
//    }
//
//    public void setX(int x) {
//        System.out.println("I am setting x now from the base class");
//        this.x = x;
//    }
//
//    Base() {
//        System.out.println("I am a constrcutor");
//    }
//
//    public void printMe() {
//        System.out.println("I am printMe function");
//    }
//}
//
//    class Derived extends Base{
//        int y;
//
//        public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            this.y = y;
//        }
//    }

    class Animal{
        public String getFourLegs() {
            return fourLegs;
        }

        public void setFourLegs(String fourLegs) {
            this.fourLegs = fourLegs;
        }

        public String fourLegs;
    }

    class Dog extends Animal{
        public String getBark() {
            return bark;
        }

        public void setBark(String bark) {
            this.bark = bark;
        }

        String bark;
    }


public class cwh_45_Inheritance {
    public static void main(String[] args) {
        /*
        Base b = new Base();
        b.setX(4);
        System.out.println("The value of X is = "+b.getX());

        Derived d = new Derived();
        d.setX(43);
        d.setY(20);
        System.out.println("The value of X is = "+d.getX());
        System.out.println("The value of Y is ="+d.getY());
         */

        Animal a = new Animal();
        Dog d = new Dog();

        a.setFourLegs("Cow");
        System.out.println("The animal with four legs is "+a.getFourLegs());

        d.setFourLegs("Dog");
        d.setBark("Bow Bow");
        System.out.println("The animal "+d.getFourLegs()+" barks like "+d.getBark());

    }
}
