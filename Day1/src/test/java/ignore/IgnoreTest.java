package ignore;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void login(){
        System.out.println("login");
    }

    @Test (enabled = false)
    public void create(){
        System.out.println("Create");
    }

    @Test
    public void edit(){
        System.out.println("Edit");
    }

    @Test (enabled = false)
    public void delete(){
        System.out.println("Delete");
    }

    @Test
    public void logout(){
        System.out.println("Log Out");
    }
}

