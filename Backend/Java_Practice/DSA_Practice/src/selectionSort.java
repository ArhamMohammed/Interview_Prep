import com.sun.security.jgss.GSSUtil;

public class selectionSort {

    public static void SelectionSort(int a[]){
                for (int i = 0; i< a.length; i++){
                    int k = i;
                    for (int j = i+1; j<a.length; j++){
                        if(a[j] < a[k]){
                            int swap = a[k];
                            a[k] = a[j];
                            a[j] = swap;
//                            a[k] = a[k] + a[j];
//                            a[j] = a[k] - a[j];
//                            a[k] = a[k] - a[j];
                        }
                    }
                }
                for (int i = 0; i< a.length; i++)
                    System.out.print(a[i]+" ");
    }



    public static void main(String[] args) {

        int a[] = {6,3,2,7,9,4};
        SelectionSort(a);



    }
}
