package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        quickSort(arr, 0, arr.length - 1);

        for(int e:arr) {
            System.out.print(e+" ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        int index = partition(arr, start, end);

        if(start < index - 1) {
            quickSort(arr,start,index - 1);
        }
        else if(index < end) {
            quickSort(arr, index, end);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low)/2];

        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;

            if(low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++; high--;
            }
        }
        return low;
    }
}
