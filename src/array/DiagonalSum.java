package array;

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int pDiagonalSum = 0;
        for(int i=0;i<N;i++) {
            pDiagonalSum += arr[i][i];
        }

        int sDiagonalSum = 0;
        for(int i=0;i<N;i++) {
            int j = N - 1 - i;
            sDiagonalSum += arr[i][j];
        }

        System.out.println(pDiagonalSum+" "+sDiagonalSum);
    }
}
