package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 1, 6, 5, 4, 3, 2, 1};
        sort(arr);
    }

    public static void sort(int[] arr) {

        for(int i=0;i< arr.length - 1;i++) { // For passes

            int index = i;
            for(int j = i + 1 ;j < arr.length - 1;j++) { // For finding lowest (comparison)
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            if(index > i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

        for (int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
