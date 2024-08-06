package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setID(int i){
        id = i;
//        return id;
    }

    public int getID(){
        return id;
    }
}

public class cwh_40_ch8_AccessModifiers {
    public static void main(String[] args) {

        MyEmployee harry = new MyEmployee();
//        harry.id = 45;
//        harry.name="Mir Mohammed Arham"; Shows an error due to private access modifier
//        System.out.println("Name is = "+harry.name);
//        System.out.println("ID is = "+harry.id);

        harry.setName("Mir Mohammed Arham");
        System.out.println("The name is = "+harry.getName());
        harry.setID(23);
        System.out.println("The id is = "+harry.getID());


    }
}
