package sorting;

public class EvenOddSeparateSorting {

    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 3, 7, 2, 1};

        divideArrayInEvenAndOdd(arr);

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }

    private static void divideArrayInEvenAndOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if(arr[left] % 2 != 0) {
                left++;
            }
            else if(arr[right] % 2 == 0) {
                right--;
            }
            else  {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        mergeSort(arr, new int[arr.length], 0, left - 1,0);
        mergeSort(arr, new int[arr.length], right, arr.length - 1,1);
    }
    public static void mergeSort(int[] arr, int[] helper, int low, int high, int ORDER) {
        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr,helper,low, mid,ORDER);
            mergeSort(arr, helper, mid + 1, high,ORDER);
            merge(arr,helper,low, mid, high, ORDER);
        }
    }
    public static void merge(int[] arr, int[] helper, int low, int mid, int high, int ORDER) {

        for(int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        int left = low;
        int right = mid + 1;
        int index = low;

        while (left <= mid && right <= high) {
            if(ORDER == 1) {
                // Sort in ascending order
                if(helper[left] <= helper[right]) {
                    arr[index++] = helper[left];
                    left++;
                } else {
                    arr[index++] = helper[right];
                    right++;
                }
            } else {
                // Sort in descending order
                if(helper[left] >= helper[right]) {
                    arr[index++] = helper[left];
                    left++;
                } else {
                    arr[index++] = helper[right];
                    right++;
                }
            }
        }

        int remaining = mid - left;
        for(int i=0;i <= remaining; i++) {
            arr[index + i] = helper[left + i];
        }
    }
}
