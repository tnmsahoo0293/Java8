package com.company;

public class Main {


    public static void main(String[] args) {
        // Lambda expressions
        Interf i = () -> System.out.print("lambda expression implementation\n");
        i.abs();
        i.m2();

        // thread creation
        Runnable r = new Myrun();
        Thread t = new Thread(r);
        t.start();
        for (int k = 0; k < 10; k++) {
            System.out.println(" \n Main Thread running " + k);
        }

    }
}
