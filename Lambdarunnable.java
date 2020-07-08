package com.company;

public class Lambdarunnable {
    public static void main(String[] args) {
        Runnable r= ()-> {
            for (int i = 0; i < 10; i++) {                                 // Job of child thread
                System.out.println(" child Thread running " + i);
            }
        };
        Thread t2= new Thread(r);
        t2.start();
        for (int k = 0; k < 10; k++) {
            System.out.println(" \n Main Thread running " + k);
        }
    }
}
