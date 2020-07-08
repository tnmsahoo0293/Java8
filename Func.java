package com.company;
import java.util.function.*;
import java.util.*;
public class Func {
    public static void main(String[] args) {
        // return String with removing spaces
        Function<String,String> f= s->s.replaceAll(" ","");
        String t="Hello everyone, This is a funcrion interface implementation";
        System.out.print(f.apply(t));
    }
}
