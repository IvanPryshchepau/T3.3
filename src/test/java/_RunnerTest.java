import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {

    @Test
    public void testCalculatePerimeter() throws Exception {
        assertEquals(_Runner.calculatePerimeter("3", "4"), 12.0);
    }

    @Test
    public void testCalculateSquare() throws Exception {
        assertEquals(_Runner.calculateSquare("3", "4"), 6.0);
    }

}