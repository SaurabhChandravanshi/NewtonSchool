package array;

import java.util.Scanner;

public class MaxColumnSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] arr = new int[M][N];

        for(int i=0;i< arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        for(int i=0;i< N;i++) { // For columns
            int sum = 0;
            for (int j=0;j<M;j++) { // For rows
                sum += arr[j][i];
            }
            if(sum > maxSum) maxSum = sum;
        }

        System.out.println(maxSum);
    }
}
