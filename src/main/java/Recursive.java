import java.util.Arrays;

public class Recursive {
    /*
     * recursive method to output every other element in the given array backwards,
     * ending with the element at index k.
     * An example input arrary {1,2,3,4,5,6,7,8,9,10}, called with k=2, should output 9753
     */
    public static String printEveryOther(final int[] ia, final int k) {
        String s = "";
        if (ia==null)
            return null;
        if (k < 0) throw new IllegalArgumentException("index must be greater or equal 0");
        if (k < ia.length) {
            s = printEveryOther(ia, k+2) + ia[k];
        }
        return s;
    }

    /*
     * recursively take in a string and place a * between adjacent letters that are the same
     * An example input String "hello" should return hel*lo.
     */
    public static String printStars(final String s) {
        if (s == null)
            return null;
        if(s.length() <= 1) {
            return s;
        }
        String x = s.substring(0, 1);
        if (Character.isLetter(x.charAt(0)) && x.equalsIgnoreCase(s.substring(1, 2))  ) {
            return x + "*" + printStars(s.substring(1) );
        } else return x + printStars(s.substring(1) );
    }

    public static void main(String[] args) {
        printEveryOther(new int[]{1,2,3,4,5,6,7,8,9,10}, 2);
        //Don't squish them into each other
        System.out.println();
        System.out.println(printStars("Hello"));
    }
}