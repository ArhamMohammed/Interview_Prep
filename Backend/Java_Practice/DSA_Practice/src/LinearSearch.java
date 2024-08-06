import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a1 [] = {6,4,5,8,2,1,9};
        int count = 0;

        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();

        for(int i=0; i<a1.length; i++){
            if(a1[i] == ele){
                System.out.println("The element "+ele+" is present at location "+i);
            count ++;
            }
        }
        if(count ==0)
            System.out.println("The element "+ele+" is not present in the array");


    }
}
