package string;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pangram {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        sc.nextLine();
        while(tests > 0) {
            String s = sc.nextLine();

            if(isPangram(s)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            tests--;
        }

    }

    public static boolean isPangram(String s) {
        if(s.length() < 26) return false;
        int[] arr = new int[26];

        s = s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            int ascii = (int)s.charAt(i) - 97;
            arr[ascii]++;
        }

        for (int i=0;i<arr.length;i++) {
            if(arr[i] == 0) return false;
        }

        return true;
    }
}