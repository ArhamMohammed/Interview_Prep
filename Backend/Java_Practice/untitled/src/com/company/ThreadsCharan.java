package com.company;
import java.util.concurrent.*;

public class ThreadsCharan {
    public static void main(String args[]) throws InterruptedException{
        ExecutorService es = Executors.newFixedThreadPool(3);

        Future f1 = es.submit(new Sum1(9));
        Future f2 = es.submit(new Square1(6));
        Future f3 = es.submit(new Cube1(3));
        try {
            System.out.println("Result : "+f1.get());
            System.out.println("Result : "+f2.get());
            System.out.println("Result : "+f3.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

class Sum1 implements Callable<Integer>{
    int data;

    Sum1(int data){
        this.data = data;
    }
    public Integer call(){
        int result = 0;

        for(int i =1;i<= data; ++i){
            result = result + i;
        }
        return result;
    }

}
class Square1 implements Callable<Integer>{
    int data;

    Square1(int data){
        this.data = data;
    }
    public Integer call(){
        int result = 0;

        for(int i =1;i<= data; ++i){
            result = result + i;
        }
        return result;
    }
}
class Cube1 implements Callable<Integer>{
    int data;

    Cube1(int data){
        this.data = data;
    }
    public Integer call(){
        int result = 0;

        for(int i =1;i<= data; ++i){
            result = result + i;
        }
        return result;
    }

}