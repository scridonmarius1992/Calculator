import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double actualResult = getCalculator().compute(12.45, 2.44, "+");
        assertEquals(14.89, actualResult, 0.001);
    }

    @Test
    public void testMinus() {
        double actualResult = getCalculator().compute(1245, 24, "-");
        assertEquals(1221, actualResult, 0);
    }

    @Test
    public void testMultiply() {
        double actualResult = getCalculator().compute(25, 4, "*");
        assertEquals(100, actualResult, 0);
    }

    @Test
    public void testDivide() {
        double actualResult = getCalculator().compute(144, 12, "/");
        assertEquals(12, actualResult, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        getCalculator().compute(6, 0, "/");
    }

    @Test
    public void testSqrt() {
        double actualResult = getCalculator().compute(121, 0, "SQRT");
        assertEquals(11, actualResult, 0);
    }

    public Calculator getCalculator() {
        return calculator;
    }
}
