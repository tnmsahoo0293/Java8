package com.company;

public class anonymous {
    public static void main(String[] args) {
        Thread t= new Thread(()->{  // The abstract method run of runnable interface is replaced with lambda expressions
            for (int i = 0; i < 10; i++) {                                 // Job of child thread
                System.out.println(" child Thread running " + i);
            }
        });

        t.start();
        System.out.print("main thread");
    }
}
