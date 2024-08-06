import java.util.Queue;

class QueueUsingArrays{
    int front_Q, rear_Q, capacityOfQueue;
    static int[] q1;

       QueueUsingArrays(int size){
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }

    void enqueue(int value){
           if(rear_Q == capacityOfQueue)
               System.out.println("Queue is already full, you cannot insert the element");
           else{
               q1[rear_Q] = value;
               rear_Q++;
           }
    }

    void dequeue(){
        if(rear_Q == 0)
            System.out.println("There is nothing to delete.");
        else{
            for (int i =0; i<rear_Q-1;i++ ){
            q1[i] = q1[i+1];
        }
            rear_Q--;
      }
    }

    void display(){
        if(rear_Q == 0)
            System.out.println("Queue is empty");
        else{
            for(int i=0; i<rear_Q; i++){
                System.out.print(q1[i]+" ");
            }
        }
    }
}


public class QueueImplementation {
    public static void main(String[] args) {

        QueueUsingArrays q2 = new QueueUsingArrays(5);
        q2.enqueue(4);
        q2.enqueue(2);
        q2.enqueue(8);
        q2.dequeue();
        q2.display();



    }
}
