package priority;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityTest2 {

    @Test(priority = 0)
    public void login(){
        System.out.println("login");
    }

    @Test (priority = 2)
    public void create(){
        System.out.println("Create");
    }

    @Test (priority = 3)
    public void edit(){
        System.out.println("Edit");
    }

    @Test (priority = 4)
    public void delete(){
        System.out.println("Delete");
    }

    @Test
    public void logout(){
        System.out.println("Log Out");
    }
}
