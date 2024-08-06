package com.company;

class MyMainEmployee{
    private int id;
    private String name;

//    public MyMainEmployee(){
//        id = 45;
//        name="Arham Mir Mohammed";
//    }
 public MyMainEmployee(String myName, int myId){
        id = myId;
        name=myName;
    }

    public void setName(String n){name = n;}
    public String getName(){
        return name;
    }
    public void setID(int i){id = i;}
    public int getID(){
        return id;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {

        MyMainEmployee harry = new MyMainEmployee("Coder Arham",81);
//        harry.setName("Mir Mohammed Arham");
        System.out.println("The name is = "+harry.getName());
//        harry.setID(23);
        System.out.println("The Id is = "+harry.getID());
    }
}
