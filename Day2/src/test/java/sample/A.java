package sample;

public class A {
    public void a0(){
        System.out.println("a0");
    }
    public B a1(){
        System.out.println("a1-B");
        return new B();
    }
    public C a2(){
        System.out.println("a2-c");
        return new C();
    }

}
