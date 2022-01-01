package dp;

import java.util.Scanner;

/*

Input Format:
abcdgh
acdghr
 */

public class LongestCommonSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        String y = sc.nextLine();
        System.out.print(longestCommonSubstring(x, y, x.length(), y.length()));
    }

    public static int longestCommonSubstring(String x, String y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int result = 0;
        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(x.charAt(i-1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    result = Math.max(result, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }
}
