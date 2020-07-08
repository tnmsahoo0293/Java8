package com.company;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;


public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Date> s= ()-> new Date();
        System.out.println(s.get());

        Supplier<String> s1= ()-> new String(Character.toChars((int)(128*Math.random())));
        System.out.println(s1.get());

        // generate random OTP
        Supplier<String> s2= ()->{
            String k="";
            int otp=0;
            for(int i=0;i<6;i++){
                k=k+(int)(Math.random()*10);
            }

            return k;
        };

        System.out.println(s2.get());
    }
}
