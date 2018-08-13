package sample;

import org.testng.annotations.Test;

public class D {
    @Test
    public void testOut(){
        A x = new A();
        //return type is void. so cant put like this
        //x.a0().a1();
       x.a0();
       //a1 - return type B,b1-return type- B,B2- return type - c
        D d = x.a1().b1().b2().c0();
    }
}
