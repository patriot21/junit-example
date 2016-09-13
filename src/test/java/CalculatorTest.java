import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

    @Test
    public void testDiv() {
        Calculator calc = new Calculator();
        int result = calc.div(10,2);
        System.out.println("10 / 2 = " + result);
        assertEquals("10 / 2 = 5", 5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivZero() {
        Calculator calc = new Calculator();
        int result = calc.div(2,0);
    }

    @Test
    public void testWhatThisDoes() {
        Calculator calc = new Calculator();
        int result = calc.plus(Integer.MAX_VALUE,1);
        System.out.println(Integer.MAX_VALUE + " + 1 = " + result);
    }

}