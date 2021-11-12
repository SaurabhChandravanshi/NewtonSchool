package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a]+");

        Matcher matcher = pattern.matcher("aaaa");

        System.out.println(matcher.matches());
    }
}
