package soft.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
    @Test
    public void verificationTest(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        SoftAssert verify = new SoftAssert();
        verify.assertTrue(false);
        System.out.println("D");
        System.out.println("E");
    }

    @Test
    public void assertionTest(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        Assert.assertTrue(false);
        System.out.println("D");
        System.out.println("E");
    }
}
