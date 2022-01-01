package greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
First line of input contains a single integer N,
next line contains N space separated integers containing values of array A.

Sample Input :
5
2 9 0 4 5

 */

public class MinAbsoluteDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minAbsDifference(arr, n));
    }


    public static int minAbsDifference(int[] arr, int n) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            if(arr[i] - arr[i - 1] < min) {
                min = arr[i] - arr[i -1];
            }
        }

        return min;
    }
}
