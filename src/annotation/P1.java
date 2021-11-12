package annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class P1 {

    @Target(ElementType.ANNOTATION_TYPE)
    @interface MyAnnotation {
        String id();
        String synopsis();
        String engineer() default "unassigned";
        String date() default "unknown";
    }

    
    public static void testAnnotation() {

    }

}
