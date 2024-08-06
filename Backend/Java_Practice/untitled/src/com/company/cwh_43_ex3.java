package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputnumber=0;
    int noOfGuesses=0;

    public int getNoofGuesses() {
        return noOfGuesses;
    }

    public void setNoofGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        inputnumber = sc.nextInt();
    }

    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(inputnumber == number) {
            System.out.println("Congratulations you got the number " + inputnumber + " correct in " + noOfGuesses + " guesses");
            return true;
        }
        else if (inputnumber>number) {
            System.out.println("Too high");
        }
        else {
            System.out.println("Too Low!!");
        }
        return false;
    }
}

public class cwh_43_ex3 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            g.isCorrectNumber();
        }


    }
}
