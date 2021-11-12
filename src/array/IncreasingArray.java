package array;

public class IncreasingArray {

    public static void main(String[] args) {
        //int[] arr = new int[]{100,64,40,60,35,80,66,16,42,46};
        //int[] arr = new int[]{1,2,16,16,16};
        int[] arr = new int[]{1,3,8,4};

        if (canArrayStrictlyIncrease(arr)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean canArrayStrictlyIncrease(int[] arr) {


        for (int i = 0;i<arr.length - 1;i++) {
            int start = 1;
            if(i > 0) {
                start = arr[i-1] + 1;
            }
            for(int k = start;k <= arr[i] / 2;k++) {
                if(arr[i] % k == 0) {
                    arr[i] = k;
                    break;
                }
            }
        }

        boolean isStrictlyInc = true;
        for (int i=0;i< arr.length-1;i++) {
            if (arr[i] >= arr[i + 1]) {
                isStrictlyInc = false;
                break;
            }
        }
        return isStrictlyInc;
    }
}
