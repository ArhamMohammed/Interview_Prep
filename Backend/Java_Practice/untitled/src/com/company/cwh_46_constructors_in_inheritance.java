package com.company;

class Base1 {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Base1(){
        System.out.println("I am a constructor of Base1 class");
    }
    Base1(int a){
        System.out.println("I am a constructor of Base1 class with a value of :"+a);
    }

}
    class Derived1 extends Base1{
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        Derived1(){
            super(0);
            System.out.println("I am a derived class constructor");
        }
        Derived1(int x,int y){
            super(x);
            System.out.println("I am a derived class constructor with value of y as ="+y);
        }
    }

    class ChildOfDerived extends Derived1{
            ChildOfDerived(){
                System.out.println("This a constructor of ChildOfDerived class and I am Child of Derived");
            }

            ChildOfDerived(int x,int y, int z){
                super(x,y);
                System.out.println("This a constructor of ChildOfDerived class and I am Child of Derived and the value of z = "+z);
            }
    }

public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1(14,9);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd1 = new ChildOfDerived(12,13,15);


    }
}
