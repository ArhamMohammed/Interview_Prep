package com.company;

//class Cylinder{
//    private int radius;
//    private int height;
//
//    public Cylinder(int radius,int height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public int getHeight() {
//        return height;
//    }
//    public void setRadius(int radius){
//        this.radius= radius;
//    }
//    public int getRadius(){
//        return radius;
//    }
//    public double surfaceArea() {
//        return (2 * Math.PI* radius * radius + 2 * 3.14 * radius * height);
//    }
//    public double volume(){
//        return Math.PI*radius*radius*height;
//    }
//}
//
//class Rectangle{
//    private int length;
//    private int breadth;
//
// public Rectangle(){
//     this.length = 12;
//     this.breadth = 9;
// }
//
//    public Rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getBreadth() {
//        return breadth;
//    }
//}

import java.util.Scanner;

class Cylinder {

    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class cwh_44_ch9_ps9 {
    public static void main(String[] args) {
    /*  Problem 1
    Cylinder c = new Cylinder();
    c.setHeight(10);
    c.setRadius(20);
    System.out.println("The height is ="+c.getHeight());
    System.out.println("The radius is ="+c.getRadius());
     */
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();

        System.out.println("Enter the radius");
        int radius = sc.nextInt();

        System.out.println("Enter the height");
        int height = sc.nextInt();

        c.setRadius(radius);
        c.setHeight(height);
        System.out.println("The radius = "+c.getRadius());
        System.out.println("The height = "+c.getHeight());
//   Problem 2
/*   Cylinder c = new Cylinder();
    c.setHeight(12);
    c.setRadius(9);
        System.out.println("The height is ="+c.getHeight());
        System.out.println("The radius is ="+c.getRadius());
        System.out.println("The surface area is = "+c.surfaceArea());
        System.out.println("The volume is = "+c.volume());
 */
//        Problem 3
        /*
        Cylinder c = new Cylinder(9,12);
        System.out.println("The height is ="+c.getHeight());
        System.out.println("The radius is ="+c.getRadius());
        System.out.println("The surface area is = "+c.surfaceArea());
        System.out.println("The volume is = "+c.volume());
         */

//       Problem 4
//        Rectangle r = new Rectangle();
//        System.out.println("The length is = "+r.getLength());
//        System.out.println("The breadth is = "+r.getBreadth());

    }
}
