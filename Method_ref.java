package com.company;

public class Method_ref {
    void m1(){
        for (int i =0;i<10;i++){
            System.out.println("child thread "+i);
        }
    }
    public static void main(String[] args) {
        Method_ref m= new Method_ref();
        Runnable r=m::m1;             // instance method reference, using the code available to use again
        Thread t= new Thread(r);
        t.start();
        for (int i =0;i<10;i++){
            System.out.println("Main thread "+i);
        }
    }

}
