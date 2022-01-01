package dp;

import java.util.Scanner;

public class SubsetWithEqualSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(hasSubsetWithEqualSum(arr, n));
    }

    private static boolean hasSubsetWithEqualSum(int[] arr, int n) {
        int sum = 0;
        for(int i = 0; i<n ;i++) {
            sum += arr[i];
        }
        if(sum % 2 != 0) {
            return false;
        } else {
            return isSubsetSum(arr, n, sum / 2);
        }
    }

    public static boolean isSubsetSum(int[] arr, int n, int s) {

        boolean[][] dp = new boolean[n + 1][s + 1];

        for(int i=0;i<n;i++) {
            dp[i][0] = true;
        }

        for(int i = 1 ;i < n + 1 ; i++) {
            for(int j = 1; j < s + 1; j++) {
                if(arr[i-1] <= j) {
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                }
                else if(arr[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][s];
    }
}
