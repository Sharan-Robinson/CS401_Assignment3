/* CS401 Assignment 3
 * Fatimah Sweilem
 */
package main;

public class StringUtils {

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String trim(String str) {
        return str.trim();
    }
}