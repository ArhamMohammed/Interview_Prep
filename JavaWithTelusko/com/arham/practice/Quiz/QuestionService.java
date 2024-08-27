package com.arham.practice.Quiz;

import java.util.Scanner;

public class QuestionService {

   Question[] questions = new Question[5];
   String[] answerArray = new String[5];

   public QuestionService(){
      questions[0] = new Question(1,"What is the size of int","2","4","6","8","8");
      questions[1] = new Question(2,"What is the size of double","2","4","6","8","8");
      questions[2] = new Question(3,"What is the size of float","2","4","6","8","8");
      questions[3] = new Question(4,"What is the size of long","2","4","6","8","8");
      questions[4] = new Question(5,"What is the size of boolean","2","4","6","8","8");
   }

      public void playQuiz(){
         System.out.println("Inside the display questions method");

         int i = 0;
         for(Question questionsList:questions){
            System.out.println("The question number : "+questionsList.getId());
            System.out.println(questionsList.getQuestion());
            System.out.println(questionsList.getOpt1());
            System.out.println(questionsList.getOpt2());
            System.out.println(questionsList.getOpt3());
            System.out.println(questionsList.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the correct option");
            answerArray[i] = sc.next();
            i++;
         }

         for(String s : answerArray){
            System.out.println(s);
         }

         System.out.println("Exiting the display questions method");
      }

      public void printScore(){
         int score = 0;

         for(int i =0; i< questions.length;i++){
            Question que = questions[i];
            String correctAnswer = que.getAnswer();;

            String userAnswer = answerArray[i];

            if(correctAnswer.equals(userAnswer)){
               score++;
            }
         }
         System.out.println("Your score is : "+score);
      }

}
