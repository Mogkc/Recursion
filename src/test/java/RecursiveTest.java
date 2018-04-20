import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveTest {

    @Test
    public void printEveryOther() {
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
        //Treats capital and lowercase letters alike
        assertEquals("A*aron is smart.", Recursive.printStars("Aaron is smart."));
        //Doesn't skip any if there are multiple repetitions in a row
        assertEquals("Be quiet! Sh*h*h*h*h*h", Recursive.printStars("Be quiet! Shhhhhh"));
        assertEquals("E*e*ew*w", Recursive.printStars("Eeeww"));
    }
}