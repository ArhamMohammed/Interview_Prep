package com.company;

class NewPhone extends Phone{

    @Override
    public void name(){
        System.out.println("This is override");
    }

}


public class cwh_108_Annotations {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.name();
    }
}
