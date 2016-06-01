import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Usuario on 31/05/2016.
 */
public class EvenOddTest {

    @Test
    public void testEvenValue() {
        EvenOdd evenOdd = new EvenOdd();
        assertEquals("Even", evenOdd.checkEven(4));
    }

    @Test
    public void testWithPrimeValue() {
        EvenOdd evenOdd = new EvenOdd();
        assertTrue(evenOdd.checkPrime(17));
    }


}