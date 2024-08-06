package com.company;

import java.nio.charset.CoderMalfunctionError;
import java.util.Random;
import java.util.Scanner;


public class cwh_20_RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter (1) for Rock (2) for Scissors (3) for Paper");
        System.out.println("Enter (0) for Rock (1) for Scissors (2) for Paper");

        int userInput = sc.nextInt();
        Random random = new Random();

        int computerInput= random.nextInt(3);
        System.out.println("The input given by te computer is= "+computerInput);

        if (userInput == computerInput)
            System.out.println("It is a draw");
        else if
        (userInput == 0 && computerInput == 1 || userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 0)
            System.out.println("You Win!!");
        else
            System.out.println("Computer Wins");

//        int y = 1+random.nextInt(3);
//        System.out.println("The other player has selected = "+y);
//
//        if(x==y)
//            System.out.println("Its a tie between two players");
//        else {
//            switch (x) {
//                case 1:
//                    if (y == 3)
//                        System.out.println("Paper beats Rock. You Lost");
//                    else
//                        System.out.println("Rock beats scissors. You Won");
//                    break;
//                case 2:
//                    if (y == 1)
//                        System.out.println("Rock beats scissors. You lost");
//                    else System.out.println("Scissors beat paper. You Won");
//                    break;
//                case 3:
//                    if (y == 2)
//                        System.out.println("Scissors beat paper. You Lost");
//                    else System.out.println("Paper beats rock. You Won");
//                    break;
//                default:
//                        System.out.println("Player 1 has given an invalid input.Please give a valid input");
//            }
        }
    }

