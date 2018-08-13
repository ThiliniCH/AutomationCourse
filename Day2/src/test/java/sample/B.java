package sample;

public class B {
    public void b0(){
        System.out.println("b0");
    }
    public B b1(){
        System.out.println("b1-B");
        return new B();
    }

    public C b2(){
        System.out.println("b2-c");
        return new C();
    }
}
