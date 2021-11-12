package binarysearch;

public class MinimumInRotated {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        //int[] arr = new int[]{5,6,7,1,2,3};
        //int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        //int[] arr = new int[]{10, 20, 30, 45, 50, 60, 4, 6};
        //int[] arr = new int[]{5, 6, 1, 2, 3};
        System.out.println(findMinInRotated(arr));
    }

    public static int findMinInRotated(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int min = arr[0];

        while(left < right) {
            int mid = left + (right - left)/2;

            if(right > mid && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            else if(left < mid && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[left] >= arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return min;
    }
}
