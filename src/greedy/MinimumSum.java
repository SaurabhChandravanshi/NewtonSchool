package greedy;

import java.util.Scanner;

/*

The first line of the input contains the number of test cases T.
Each test case contains a single input A(amount).

Sample Input :
5
90
110
131
1111
23
 */
public class MinimumSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int A = sc.nextInt();
            int[] deno = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
            System.out.println(minimumCoins(deno, 10,A));
        }
    }

    public static int minimumCoins(int[] deno, int n, int A) {
        if(A == 0) return 0;
        if(n == 0) return 0;

        if(deno[n-1] <= A) {
            return 1 + minimumCoins(deno, n, A - deno[n-1]);
        } else {
            return minimumCoins(deno, n-1, A);
        }
    }
}
