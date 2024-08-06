import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());

        Hashtable<String, Integer> student = new Hashtable<>();

        student.put("Puja",3);
        student.put("Priya",2);
        student.put("Rohit",7);
        Set<String> data = student.keySet();

        for(String i:data){
            System.out.println("The key is: "+student.get(i));
            System.out.println(i.hashCode());
        }

        Set<Map.Entry<String, Integer>> data1 = student.entrySet();

        for (Map.Entry<String, Integer> i :data1) {
            System.out.println(i.getKey()+" : "+ i.getValue());
            System.out.println(i.hashCode());
        }

    }
}
