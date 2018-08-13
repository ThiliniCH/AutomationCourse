package calculator.test;

import Calculator.CalculatorLogic;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorLogicTest {

    @Test
    public void testSum() {
        int actual = CalculatorLogic.sum(80, 120);
        Assert.assertEquals(actual, 200, "summation failed");
    }
}



