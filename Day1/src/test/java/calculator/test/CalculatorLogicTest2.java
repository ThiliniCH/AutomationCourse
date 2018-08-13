package calculator.test;

import Calculator.CalculatorLogic;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorLogicTest2 {

    @Test (dataProvider = "getNumber")
    public void testSum(int num1,int num2, int output){

        int actual = CalculatorLogic.sum(num1, num2);
        Assert.assertEquals(actual,output,"summation failed");
               }

    @DataProvider
    public Object [] [] getNumber(){
        return new Object[][]{
                {100,50,150},
                {100,-50,50},
                {2147483646,1,2147483647},
                {-2147483647,-1,-2147483648}
        };
}
}
