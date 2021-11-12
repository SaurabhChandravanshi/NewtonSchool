package sorting;

public class ReverseBubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 7, 9, 87};
        reverseSort(arr);
    }

    public static void reverseSort(int[] arr) {

        for(int i=0;i< arr.length;i++) { // For passes
            for (int j = 0;j< arr.length - 1 - i;j++) { // For possible swapping
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int e: arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
