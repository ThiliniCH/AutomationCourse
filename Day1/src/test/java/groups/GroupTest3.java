package groups;

import org.testng.annotations.Test;

public class GroupTest3 {

    @Test (groups = {"smoke"})
    public void test1(){
        System.out.println("Group Test 3.1");
    }

    @Test (groups = {"smoke", "reg"})
    public void test2(){
        System.out.println("Group Test 3.2");
    }

    @Test (groups = {"reg"})
    public void test3(){
        System.out.println("Group Test 3.3");
    }
}
