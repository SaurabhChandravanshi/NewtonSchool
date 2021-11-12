package recursion;

import java.util.Scanner;

public class PowMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i=0;i<testCases;i++) {
            double N = scanner.nextDouble();
            int X = scanner.nextInt();
            System.out.printf("%.2f%n",pow(N,X));
        }
    }

    public static double pow(double N, int X) {
        if(X == 1) {
            return N;
        } else if(X == 0) return 1;
        if(X < 0) {
            X = -(X);
            return 1/ (N * pow(N,X-1));
        }
        return N * pow(N,X-1);
    }
}
