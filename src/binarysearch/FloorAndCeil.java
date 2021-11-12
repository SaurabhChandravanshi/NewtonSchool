package binarysearch;

public class FloorAndCeil {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int k = 3;
        floorAndCeil(arr,6,k);
    }

    static void floorAndCeil(int a[], int N, int x){
        //Enter your code here
        int left = 0;
        int right = a.length - 1;

        int floor = -1;
        int ceil = -1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(a[mid] == x) {
                floor = a[mid];
                ceil = a[mid];
                break;
            } else if(a[mid] > x) {
                right = mid - 1;
                ceil = a[mid];
            } else if(a[mid] < x) {
                left = mid + 1;
                floor = a[mid];
            }
        }
        System.out.println(floor+" "+ceil);
    }
}
