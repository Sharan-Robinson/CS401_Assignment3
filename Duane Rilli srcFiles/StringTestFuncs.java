/**
 * Assignment for CS401
 * Submitted by: Duane Rilli
 * Date: 2024-04-15
 */
package StringTest;

public class StringTestFuncs {

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
