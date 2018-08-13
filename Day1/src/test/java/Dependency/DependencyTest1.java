package Dependency;

import org.testng.annotations.Test;

public class DependencyTest1 {

    @Test
    public void login(){
        System.out.println("login");
    }

    @Test (dependsOnMethods = {"login"})
    public void create(){
        System.out.println("Create");
    }

    @Test (dependsOnMethods = {"create"})
    public void edit(){
        System.out.println("Edit");
    }

    @Test (dependsOnMethods = {"edit"})
    public void delete(){
        System.out.println("Delete");
    }

    @Test (dependsOnMethods = {"delete"})
    public void logout(){
        System.out.println("Log Out");
    }
}
