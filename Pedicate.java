package com.company;
import java.util.function.*;
import java.util.*;
public class Pedicate {
    public static void main(String[] args) {
        Predicate<Integer> p= I-> I>10;
        Predicate<Integer> p2=I-> I%2==0;
        System.out.println(p.test(100));
        System.out.println(p.negate().test(100));
        System.out.println(p.and(p2).test(100));


        String[] arr={"hello", null,"Ravi", "", "Shiva", null};
        // predicate method to remove null and empty strings froma list of strings
        Predicate<String>p1=s->s!=null && s.length()!=0;
        ArrayList<String>al= new ArrayList<>();
        for(String x: arr){
            if(p1.test(x))
                al.add(x);
        }
        System.out.println(al);
    }
}
