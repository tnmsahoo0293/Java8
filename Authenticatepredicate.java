package com.company;
import java.util.function.*;
import java.util.*;

class User{
String user;
String pass;

    User(String user, String pass){
    this.user=user;
    this.pass= pass;
    }
}
public class Authenticatepredicate {
    public static void main(String[] args) {
        Predicate<User>p= u->u.user.equals("Tanmay") && u.pass.equals("java");

        User u= new User("Tanmay", "java");
        if(p.test(u)){
            System.out.print("Welcome Tanmay");
        }
        else
            System.out.print("Invalid User ID");
        
    }
}
