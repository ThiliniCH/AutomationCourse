package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest1 {
    @Test
    public void test1(){
        int a = 10;
        int b = 5;
        int c = a+b;
        Assert.assertEquals(c,25,"calculation failed:");
    }
    @Test
    public void test2(){
        String actual = "ABC";
        Assert.assertEquals(actual,"ABC","Failed String Mismatched");
    }

    @Test
    public void test3(){
        String actual = "ABC";
        Assert.assertNotEquals(actual,"xyz","Failed String Mismatched");
    }

    @Test
    public void test4(){
        boolean b = false;

        Assert.assertTrue(false);
    }

    @Test
    public void test5(){
        boolean b = false;

        Assert.assertFalse(false);
    }
}
