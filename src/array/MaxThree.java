package array;

import java.util.ArrayList;

public class MaxThree {

    public static void main(String[] args) {

        int[] arr = new int[] {2,2,3,1};
        printMaxThree(arr);


    }

    public static void printMaxThree(int[] arr) {
       long f = Long.MIN_VALUE;
       long s = Long.MIN_VALUE;
       long t = Long.MIN_VALUE;

       for (int element: arr) {
           if(element > f) {
               t = s;
               s = f;
               f = element;
           } else if (element > s) {
               t = s;
               s = element;
           } else if (element > t){
               t = element;
           }
       }

        System.out.println(f+" "+s+" "+t);
    }
}
