package arraylist;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(4);
        integers.add(1);
        integers.add(6);
        integers.add(6);
        integers.add(5);

        System.out.println("Original ArrayList: "+integers.toString());

        for(int i=0;i<integers.size();i++) {

            for(int j=i+1;j<integers.size();j++) {
                if(integers.get(i).equals(integers.get(j))) {
                    integers.remove(j);
                }
            }
        }

        System.out.println("ArrayList After Removing Duplicates: "+integers.toString());
    }
}
