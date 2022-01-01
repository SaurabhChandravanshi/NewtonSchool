package sorting;

public class SortZerosOnesTwos {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 0, 2, 1, 0};

        System.out.println("Before sorting");
        printArray(arr);

        sort(arr);

        System.out.println("After sorting");
        printArray(arr);
    }

    public static void sort(int[] arr) {

        int start = 0;
        for(int i=start;i<arr.length;i++) {
            if(arr[i] == 0) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }
        for(int i=start;i<arr.length;i++) {
            if(arr[i] == 1) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }
    }

    public static void printArray(int[] arr) {

        for (int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
