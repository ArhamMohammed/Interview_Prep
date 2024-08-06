public class QuickSort {

    static int partition(int arr[],int first,int last){
        int pivot = arr[last];
        int pivotIndex = first -1;

            for (int i =first; i < last; i++){
                if(arr[i] < pivot){
                    pivotIndex++;
                    int swap = arr[pivotIndex];
                    arr[pivotIndex] = arr[i];
                    arr[i] = swap;
                }
            }
            int swap = arr[pivotIndex+1];
            arr[pivotIndex+1] = arr[last];
            arr[last] = swap;
        return pivotIndex+1;
    }

    static void qs(int a1[], int first, int last){
        if(first<last){
        int pIdex = partition(a1, first,last);
        qs(a1, first, pIdex -1);
        qs(a1, pIdex+1,last);
        }
    }

    public static void main(String[] args) {

            int a1[] = {2,2,5,8,7,12,1};
            qs(a1,0,a1.length-1);

        System.out.print("The array is :");
        for (int i =0; i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }

    }
}
