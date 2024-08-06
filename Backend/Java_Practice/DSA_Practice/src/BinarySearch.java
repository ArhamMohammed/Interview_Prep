import java.util.Scanner;

public class BinarySearch {

    public static int BinarySearch(int []a1, int ele, int first, int last){

        int mid = (first+last)/2;

        if(first<= last) {
            if (a1[mid] == ele)
                return mid;
            else if (a1[mid] > ele)
                return BinarySearch(a1, ele, first, mid-1);
            else
                return BinarySearch(a1, ele, mid+1, last);
        }
        return -1;
    }


    public static void main(String[] args) {

        int []a1 = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();

        int index = BinarySearch(a1, ele, 0, a1.length-1);

        if(index == -1)
            System.out.println("The element "+ele+" is not found in the array");
        else
            System.out.println("The element " + ele + " is found at index " + index);






    }
}
