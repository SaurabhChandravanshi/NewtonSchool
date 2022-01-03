package dp;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of N integers,
your task is to find the longest subsequence such that the
difference between adjacent numbers in the subsequence is equal to 1

Input
First line of input contains a single integer N.
Next line of input contains N space- separated integers depicting the elements of the array.

Sample Input:-
5
4 6 1 5 4

Sample Output:-
3

 */

public class LongestSubSequenceDifferByOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(arr, n));
    }

    public static int solve(int[] arr, int n) {
      int[] dp = new int[n + 1];

      Arrays.fill(dp, 1);

      for(int i = 1; i< n; i++) {
          for (int j = 0; j < i; j++) {
              if(absDifference(arr[i], arr[j]) == 1) {
                  dp[i] = Math.max(dp[i], 1 + dp[j]);
              }
          }
      }
      int max = Integer.MIN_VALUE;
      for(int a: dp) {
          if (a > max) max = a;
      }
      return max;
    }

    public static int absDifference(int a, int b) {
        if(a > b) return a - b;
        else return b - a;
    }
}
