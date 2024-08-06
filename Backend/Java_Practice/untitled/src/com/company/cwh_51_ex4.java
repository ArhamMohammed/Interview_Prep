package com.company;

import java.util.Scanner;

class Library{
String[] books;
int noOfBooks;

    Library(){
        this.books= new String[100];
        this.noOfBooks=0;
    }
    public void addBook(String book){
        this.books[noOfBooks]= book;
        noOfBooks++;
        System.out.println("The book "+book+" has been added to the library");
    }
    public void issueBook(String book){
       for(int i=0;i<this.books.length;i++)
           if(this.books[i].equals(book))
           {
               System.out.println("The book has been issued");
               this.books[i]= null;
               return;
           }
    }
    public void returnBook(String book){
        addBook(book);
    }
    public void showAvailableBooks(){
        for(int i =0;i<this.books.length;i++){
            if(books[i] == null)
                continue;
            System.out.println("* "+books[i]);
        }
    }
}

public class cwh_51_ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean b = true;
        Library L = new Library();
        while (b) {
            System.out.println("Enter 1 for adding the book 2 for issuing the book 3 for returning the book " +
                    "4 for showing the available books and 0 to exit");

            int x = sc.nextInt();
            String book;

            switch (x) {
                case 0 -> {
                    b = false;
                    System.out.println("Thank you!!");
                }
                case 1 -> {
                    System.out.println("Enter the name of the book");
                    book = sc.next();
                    L.addBook(book);
                }
                case 2 -> {
                    System.out.println("Enter the name of the book to be issued");
                    book = sc.next();
                    L.issueBook(book);
                }
                case 3 -> {
                    System.out.println("Enter the name of the book to be returned");
                    book = sc.next();
                    L.returnBook(book);
                }
                case 4 -> {
                    System.out.println("The available books are");
                    L.showAvailableBooks();
                }
                default -> System.out.println("Incorrect Input");
            }
        }
    }
}
