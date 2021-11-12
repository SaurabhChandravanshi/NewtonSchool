package regex;

import java.util.regex.*;

public class P1 {



    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("['?._,]");

        String s = "isn't";
        Matcher matcher = pattern.matcher(s);

        if(matcher.find()) {
            int index = matcher.start();
            System.out.println(index);
            System.out.println(s.substring(0,index));
        }

    }

}
