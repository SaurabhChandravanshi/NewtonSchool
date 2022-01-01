package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);

        for(int e:arr) {
            System.out.print(e+" ");
        }
    }


    public static void mergeSort(int[] arr ,int[] helper, int low, int high) {

        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr,helper, low, mid);
            mergeSort(arr, helper,mid + 1, high);
            merge(arr, helper, low, mid, high);
        }
    }

    public static void merge(int[] arr, int[] helper, int low, int mid, int high) {

        for(int i=low;i<=high;i++) {
            helper[i] = arr[i];
        }

        int left = low;
        int right = mid + 1;
        int index = low;

        while (left <= mid && right <= high) {
            if(helper[left] <= helper[right]) {
                arr[index] = helper[left];
                left++;
            } else {
                arr[index] = helper[right];
                right++;
            }
            index++;
        }

        int remaining = mid - left;
        for(int i=0;i<=remaining;i++) {
            arr[index + i] = helper[left + i];
        }
    }
}
