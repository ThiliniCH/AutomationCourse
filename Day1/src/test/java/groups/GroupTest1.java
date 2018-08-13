package groups;

import org.testng.annotations.Test;

public class GroupTest1 {

    @Test (groups = {"smoke"})
    public void test1(){
        System.out.println("Group Test 1.1");
    }

    @Test (groups = {"smoke", "reg"})
    public void test2(){
        System.out.println("Group Test 1.2");
    }

    @Test (groups = {"reg"})
    public void test3(){
        System.out.println("Group Test 1.3");
    }

}
