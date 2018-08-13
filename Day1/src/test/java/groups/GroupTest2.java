package groups;

import org.testng.annotations.Test;

public class GroupTest2 {

    @Test (groups = {"reg"})
    public void test1(){
        System.out.println("Group Test 2.1");
    }

    @Test (groups = {"smoke"})
    public void test2(){
        System.out.println("Group Test 2.2");
    }

    @Test
    public void test3(){
        System.out.println("Group Test 2.3");
    }
}
