package com.company;

class CirclePracticeSet{
    public int radius;

    CirclePracticeSet(int a)
    {
        System.out.println("This is inside from a circle constructor");
        this.radius=a;
        System.out.println("the radius is now being assinged to = "+radius);
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class CylinderPracticeSet extends CirclePracticeSet{
    public int height;

    CylinderPracticeSet(int r,int h)
    {
        super(r);
        System.out.println("This is inside from a cylinder constructor");
        this.height = h;
    }
    public double volume(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}

class Rectangle1{
    public int length, breadth;

    Rectangle1(int l,int b){
        this.length = l;
        this.breadth = b;
    }
    double RecArea(){
        return length*breadth;
    }
    double RecPerimeter(){
        return 2*(length+breadth);
    }
}

class Cuboid extends Rectangle1{
    int height;
    Cuboid(int l,int b,int h){
    super(l,b);
    this.height = h;
    }
   double CuboidArea(){
        System.out.println("The length = "+length+" The breadth = "+breadth+" The height = "+this.height);
        return 2*(length * breadth + breadth * height + length * height);
    }
}

public class cwh_52_ch10ps {
    public static void main(String[] args) {

//         Problem1
//        CirclePracticeSet c = new CirclePracticeSet(12);
//        System.out.println(c.area());

        CylinderPracticeSet cps = new CylinderPracticeSet(10,20);
        System.out.println(cps.area());

//        Problem 2
        Cuboid cub = new Cuboid(10,30,50);
        System.out.println("The area of the cuboid is = "+cub.CuboidArea());

    }
}
