package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 3, 9, 7};
        sort(arr);
    }

    public static void sort(int[] arr) {
        for (int i=0;i<arr.length - 1;i++) {
            for (int j = i + 1;j > 0;j--) {
                if(arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
