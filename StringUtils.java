package main;
import java.lang.String;

public class StringUtils {


    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static String reverse(String str) {
        StringBuilder se = new StringBuilder(str);
        return se.reverse().toString();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String trim(String str) {
        return str.trim();
    }

	

	
	
	
}
