package greedy;

import java.util.Scanner;

/*
The cost of stock on each day is given in an array A[] of size N.
You can either buy or sell a stock on a particular day.
You need to sell the previous stock before buying a new one.
Find all the days on which you buy and sell the stock,
so that in between those days your profit is maximum.

There are no two days with same price of the stock.

Input
First-line contains an integer value N denoting the number of days,
followed by an array of stock prices of N days.

Input:
7
100 180 260 310 40 535 695

Output:
0 3
4 6
 */
public class CostOfStock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        maxProfit(arr, n);
    }

    public static void maxProfit(int[] arr, int n) {
       int buy = 0;
       int sell = -1;
        for(int i = buy + 1; i < n; i++) {
            if(arr[i] < arr[i - 1] && arr[buy] < arr[i - 1]) {
                sell = i - 1;
                System.out.println(buy+" "+sell);
                buy = i;
            }
        }

        if(arr[buy] < arr[n - 1]) {
            sell = n-1;
        }

        if(sell == -1) System.out.println("null");
        else {
            System.out.println(buy+" "+sell);
        }
    }
}
