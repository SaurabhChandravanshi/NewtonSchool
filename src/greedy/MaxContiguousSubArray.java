package greedy;

import java.util.Scanner;

/*
Given an array, A of length N, find the contiguous sub array within A which has the largest sum.

*******************
First line of each test case contain the number of test cases.
The first line of each test case contains an integer n, the length of the array A
and the next line contains n integers.
******************

Sample Input
1
5
1 2 3 4 -10

 */
public class MaxContiguousSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i =0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(maxSubArray(arr, n));
        }
    }

    public static int maxSubArray(int[] arr, int n) {
        int res = Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int temp = max + arr[i];
            if(temp >= max) {
                max = max + arr[i];
            } else {
                max = 0;
            }
            if(max > res) {
                res = max;
            }
        }

        return res;
    }
}
