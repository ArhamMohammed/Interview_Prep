import java.util.Scanner;

public class ArraysSolution {
    public static void main(String[] args) {
//        int [] a1 = new int[6];
//        int i,ele;
//
//        for( i=0;i <a1.length; i++){
//            System.out.println("Enter the element number "+(i+1));
//            Scanner sc = new Scanner(System.in);
//            ele = sc.nextInt();
//            a1[i] = ele;
//        }
//        System.out.println("The elements are");
//        for(int j=0; j<a1.length;j++){
//            if(j == a1.length -1){
//            System.out.print(a1[j]);
//            }
//            else
//                System.out.print(a1[j]+", ");
//        }

//        2D Array

        int [][] a1 = new int[3][4];
        int ele;
//        System.out.println(a1.length);

//        Storing the elements
        for(int i = 0; i< a1.length;i++ ){
            for(int j = 0; j<a1[i].length; j++){

            System.out.println("Enter the element of the row "+(i+1)+" and at position "+(j+1));
            Scanner sc = new Scanner(System.in);
            ele = sc.nextInt();
            a1[i][j]= ele;
            }
        }

//       Accessing the elements
        System.out.println("The elements of the array are: ");
        for(int i = 0; i< a1.length;i++ ){
            for(int j = 0; j<a1[i].length; j++){
                if(j == a1[i].length -1){
                    System.out.print(+a1[i][j]);
            }
            else
                System.out.print(+a1[i][j]+ ", ");
        }
            System.out.println();
            }
        }

    }
