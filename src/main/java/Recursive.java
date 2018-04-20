import java.util.Arrays;

public class Recursive {
    /*
     * recursive method to output every other element in the given array backwards,
     * ending with the element at index k.
     * An example input arrary {1,2,3,4,5,6,7,8,9,10}, called with k=2, should output 9753
     */
    public static void printEveryOther(final int[] ia, final int k) {
        if (ia==null)
            return;
        if (k < 0)
            printEveryOther(ia, k+2);
        if (k <= ia.length) {
            if (ia.length % 2 == k % 2) {
                int[] oneShorter = Arrays.copyOf(ia, ia.length-1);
                printEveryOther(oneShorter, k);
                return;
            }
            System.out.print(ia[ia.length-1]);
            if (ia.length - 1 != k) {
                int[] twoShorter = Arrays.copyOf(ia, ia.length-2);
                printEveryOther(twoShorter, k);
            }
        }
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