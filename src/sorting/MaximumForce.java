package sorting;

public class MaximumForce {

    public static void main(String[] args) {
        int[] arr = {-3,2,-1,0,1,0};

        mergeSort(arr,new int[arr.length],0, arr.length - 1);

        maxForce(arr,4);


        for(int e:arr) {
            System.out.println(e);
        }

    }

    public static void mergeSort(int[] arr, int[] helper, int start, int end) {
        if (start < end) {
            int mid = start + (end - start)/2;
            mergeSort(arr,helper,start,mid);
            mergeSort(arr,helper,mid+1,end);
            merge(arr,helper,start,mid,end);
        }
    }
    public static void merge(int[] arr, int[] helper, int left, int mid, int right) {

        for(int i=left;i<=right;i++) {
            helper[i] = (- 1) *arr[i];
        }
        int helperLeft = left;
        int helperRight = mid + 1;
        int index = left;

        while (helperLeft <= mid && helperRight <= right) {
            if(helper[helperLeft] * helper[helperLeft] <= helper[helperRight] * helper[helperRight]) {
                arr[index] = helper[helperLeft];
                index++;
                helperLeft++;
            } else {
                arr[index] = helper[helperRight];
                index++;
                helperRight++;
            }
        }

        int remaining = mid - helperLeft;
        for(int i=0;i <= remaining;i++) {
            arr[index + i] = helper[helperLeft + i];
        }
    }

    public static void maxForce(int[] arr,int k) {

        int maxForce = 0;
        for(int i = arr.length - 1;i >= arr.length - k ;i--) {
            maxForce += arr[i] * arr[i];
        }

        System.out.println("Max Force: " + maxForce);
    }
}
