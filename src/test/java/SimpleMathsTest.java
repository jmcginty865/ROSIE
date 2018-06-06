import calculator.SimpleMaths;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleMathsTest {

    @Test
    public void addNumsTest(){
    SimpleMaths simpleMaths = new SimpleMaths();

    long result = 5;

    long actual = simpleMaths.addNums(1,4);

    assertEquals("The result should be 5",result,actual);
    }

    @Test
    public void subtractNumsTest(){
        SimpleMaths simpleMaths = new SimpleMaths();

        long results = 6;

        long actual = simpleMaths.subtractNums(9,3);

        assertEquals("The result should be 3", results,actual);
    }

    @Test
    public void multipleNumsTest(){
        SimpleMaths simpleMaths = new SimpleMaths();

        long results = 9;

        long actual = simpleMaths.multipyNums(3,3);

        assertEquals("The results ahould be 9", results, actual);
    }

    @Test
    public void divideNumsTest(){
        SimpleMaths simpleMaths = new SimpleMaths();

        long results = 2;

        long actual = simpleMaths.divideNums(9,4);

        assertEquals("The results should be 3", results, actual);
    }
}
