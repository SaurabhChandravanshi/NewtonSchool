package string;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] arr = new String[]{"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] arr) {

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < smallest) {
                smallest = arr[i].length();
            }
        }
        String longest = "";

        for (int i = smallest; i > 0; i--) {
            boolean isLongest = true;
            String ss1 = arr[0].substring(0, i);

            for (int j = 1; j < arr.length; j++) {
                String ss2 = arr[j].substring(0, i);

                if (!ss1.equals(ss2)) {
                    isLongest = false;
                    break;
                }
            }

            if ((isLongest)) {
                longest = ss1;
                break;
            }
        }
        return longest;
    }
}
