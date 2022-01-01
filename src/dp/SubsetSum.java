package dp;

import java.util.Scanner;

public class SubsetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i< N;i++) {
            arr[i] = sc.nextInt();
        }

        if(isSubsetSum(arr,N, S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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
