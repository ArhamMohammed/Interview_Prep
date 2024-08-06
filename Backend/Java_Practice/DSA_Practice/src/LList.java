import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class ListNode{
    int data;
    ListNode next;
    ListNode previous;

    public ListNode(int data){
        this.data = data;
    }
}

public class LList {
    Node tail,head = null;
    class Node{
        int data;
        Node next;


        Node(int data){
            this.data = data;
            next = null;
        }
    }

    void insertElement(int data){
        Node newNode = new Node(data);
        if(head == null){
        head = tail = newNode;
        tail.next = newNode;
    }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
  }

  void displayElements(){
        Node n1 = head;
        if(tail ==null){
            System.out.println("The list is empty");
        }
        else{
            do {
                System.out.println(n1.data);
                n1 = n1.next;
            }while(n1!=head);
        }
  }

  void deleteElement(){
        if(tail!=head){
            head = head.next;
            tail.next = head;
        }
        else
            head = tail = null;
    }

    public static void main(String[] args) {

//        LinkedList<Integer> l1 = new LinkedList<Integer>();
//
////        Adding the elements to the linked list
//        l1.add(3);
//        l1.add(7);
//        l1.add(10);
//        l1.add(2,30);
//        l1.add(4,40);
//        l1.add(5,50);
//        l1.add(6,60);
//
////        Remove the elements from the LinkedList
////        l1.removeFirst();
////        l1.remove(2);
//        l1.removeLast();
//
////        Iterating through the elements.
//        Iterator<Integer> it1 = l1.iterator();
//        while(it1.hasNext()){
//                System.out.print(it1.next()+" ,");
//        }
//        System.out.println();
////
////        System.out.println(l1.size());
////        System.out.println(l1.contains(7));
////        System.out.println(l1.contains(17));
//
////        Copy elements from stack to a LinkedList
//          Stack<String> s1 = new Stack<>();
//          LinkedList <String> l2 = new LinkedList<>();
//
//          s1.push("Dell");
//          s1.push("Inspiron");
//          s1.push("Model");
//
//          l2.addAll(s1);
//
//        Iterator<String> it2 = l2.iterator();
//        while(it2.hasNext()){
////            System.out.print(it2.next()+" ,");
//            System.out.print(it2.next()+" ");
//        }

        LList l1 =  new LList();
        l1.insertElement(10);
        l1.insertElement(8);
        l1.insertElement(12);
        l1.displayElements();
        l1.deleteElement();
        l1.displayElements();


    }
}
