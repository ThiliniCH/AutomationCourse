package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scenario3 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @Test
    public void login(){
        System.out.println("login");
    }

    @Test
    public void create(){
        System.out.println("Create");
    }

    @Test
    public void edit(){
        System.out.println("Edit");
    }

    @Test
    public void delete(){
        System.out.println("Delete");
    }

    @Test
    public void logout(){
        System.out.println("Log Out");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
}
