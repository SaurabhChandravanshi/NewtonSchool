package array;

public class SimpleBS {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};

        int target = 5;

        int start = 0;
        int end = arr.length;


        boolean found = false;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                found = true;
                System.out.println(target + " found at index "+mid);
                break;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        if (!found) System.out.println(target+" not found in array");
    }
}
