import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveTest {

    @Test
    public void printEveryOther() {
        int[] still = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals("975", Recursive.printEveryOther(still, 5));
        assertNull(Recursive.printEveryOther(null, 2));
        assertEquals("86", Recursive.printEveryOther(still, 6));
        assertEquals("", Recursive.printEveryOther(still, 451));
        assertEquals("", Recursive.printEveryOther(new int[0], 0));
        assertEquals("86420", Recursive.printEveryOther(still, 0));
        try {
            Recursive.printEveryOther(still, -1);
        } catch (IllegalArgumentException a) {
            assertTrue("Negative index throws IllegalArgumentException", true);
        }
    }

    @Test
    public void printStars() {
        //Handles null or small inputs
        assertEquals(null, Recursive.printStars(null));
        assertEquals("", Recursive.printStars(""));
        assertEquals("z", Recursive.printStars("z"));
        //Doesn't star between consecutive characters that aren't letters
        assertEquals("What??  Now?", Recursive.printStars("What??  Now?") );
        //Does star between consecutive letters at the beginning
        assertEquals("a*aron is kind.", Recursive.printStars("aaron is kind."));
        //Does star at consecutive letters at the end
        assertEquals("Enter the glen*n", Recursive.printStars("Enter the glenn"));
        //Only splits letters with the same case
        assertEquals("Aaron is smart.", Recursive.printStars("Aaron is smart."));
        //Doesn't skip any if there are multiple repetitions in a row
        assertEquals("Be quiet! Sh*h*h*h*h*h", Recursive.printStars("Be quiet! Shhhhhh"));
        assertEquals("Ee*ew*w", Recursive.printStars("Eeeww"));
    }
}