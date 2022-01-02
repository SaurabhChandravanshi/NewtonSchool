package greedy;

import java.util.Scanner;

/*
A boy lost the password of his super locker.
He remembers the number of digits N as well as the sum S of all the digits of his password.
He know that his password is the largest number of N digits that can be possible with given sum S.
As he is busy doing his homework, help him retrieving his password.

Input
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. The first line of each test case contains two space separated integers N and S,
where N is the number of digits in password and S is the sum of all the digits of the password.

Input:
3
5 12
3 29
3 26

Output:
93000
-1
998
 */
public class LargestNumberWithSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] res = new int[t];
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            res[i] = largestNumber(n, s);
        }
        for (int a:res) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static int largestNumber(int n, int s) {
        if(s == 0 && n == 1) return -1;
        if(s == 0 && n > 1) return 0;
        if (s > 9 * n) return -1;

        int sum = 0;
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            if(s == 0) {
                sum = sum * 10;
            }
            else if(s >= 9) {
             sum += 9 * mul;
             mul = mul * 10;
             s = s - 9;
            } else {
                sum += 9* mul - (9 - s);
                mul = mul * 10;
                s = 0;
            }
        }
        if(s > 0) return  - 1;
        return sum;
    }
}
