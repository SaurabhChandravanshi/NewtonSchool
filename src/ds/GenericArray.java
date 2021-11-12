package ds;

public class GenericArray {

    public static void main(String[] args) {

        Integer[] iA = {1,2,3,4,5};
        String[] sA = {"Hello","Java"};

        printArray(iA);
        printArray(sA);
    }

    public static <T> void printArray(T[] arr) {

        for (T t : arr) {
            System.out.println(t);
        }
    }
}
