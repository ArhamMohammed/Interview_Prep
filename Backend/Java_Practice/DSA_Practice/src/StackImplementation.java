import java.util.Iterator;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();
//      Adding the element
        s1.push(30);
        s1.push(28);
        s1.push(43);
        s1.push(60);
        System.out.println(s1);

//      Deleting the element
//        s1.pop();
//        s1.pop();
//        s1.pop();
//        s1.pop();
//        System.out.println(s1);

//       Checking what the element at the top is
//        s1.peek();
//        System.out.println(s1.peek());

//       To check if the stack is empty or not.
//         boolean status = s1.empty();
//         System.out.println(status);

//        For searching the element at the index
//          int indexFound = s1.search(40);
//          System.out.println(indexFound);

//        How to iterate over the stack
//          Iterator<Integer> it = s1.iterator();
//          while(it.hasNext()){
//              Object s2 = it.next();
//              System.out.println(s2);
//          }
//        To check the size of the stack
//        System.out.println(s1.size());

//        To sort the stack;
        s1.sort(null);
        System.out.println(s1);
    }
}
