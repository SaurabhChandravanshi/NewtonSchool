package dp;

import java.util.Scanner;

/*
Sample Input
2
10
4
2 5 3 6
5
3
3 6 3

 */

public class MinNumberOfCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] test = new int[t];

        for(int i = 0; i < t; i++) {
            int amount = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            test[i] = minNumberOfCoins(arr,n,amount);
        }

        for (int a: test) {
            if(a == -1) System.out.println("Not Possible");
            else System.out.println(a);
        }
    }

    public static int minNumberOfCoins(int[] arr, int n,int amount) {
        int[][] dp = new int[n+1][amount+1];

        for(int j = 0; j < amount + 1; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1;
        }
        for(int j = 1; j < amount + 1; j++) {
            if(j % arr[0] == 0) {
                dp[1][j] = j / arr[0];
            } else {
                dp[1][j] = Integer.MAX_VALUE - 1;
            }
        }

        for(int i = 2;i < n + 1; i++) {
            for(int j = 1; j < amount + 1; j++) {
                if(arr[i-1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j-arr[i-1]] , dp[i-1][j]);
                } else if(arr[i - 1] > j) {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        if(dp[n][amount] == Integer.MAX_VALUE - 1) {
            return -1;
        }
        return dp[n][amount];
    }
}
