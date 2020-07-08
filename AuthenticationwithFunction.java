package com.company;

import java.util.*;
import java.util.function.*;

public class AuthenticationwithFunction {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s= sc.next();
    System.out.println("Enter the pass word");
    String pass= sc.next();

    Function<String, String> f1= s1->s1.substring(0,5);
    Function<String, String> f2= String::toLowerCase;
    Predicate<String> p= s3-> s3.equals("durga");
    Predicate<String> p1= pas1->pas1.equals("Java");

    if(p.test(f1.andThen(f2).apply(s))){
        if(p1.test(pass))
            System.out.print("Welcome "+ s);
    }

    }
}
