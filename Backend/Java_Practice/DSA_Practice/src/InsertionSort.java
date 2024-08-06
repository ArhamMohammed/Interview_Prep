public class InsertionSort {

    public static void insertSort(int a1[]){

        for (int i =0; i<a1.length; i++){
            int j = i-1;
            int b = a1[i];

            while(j>=0 && b <= a1[j]){
                    a1[j+1] = a1[j];
                    j--;
            }
            a1[j+1] = b;
        }
        for (int i = 0; i<a1.length; i++){
            System.out.print(a1[i] + " ");
        }
    }

    public static void main(String[] args) {

        int [] a1 = {3,3,7,9,4,2,6};

        insertSort(a1);
    }
}
