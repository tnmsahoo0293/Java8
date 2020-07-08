package com.company;
 //without lambda expression
public class Myrun implements Runnable { // defining of a thread
    public void run(){
        for( int i=0;i<10;i++){                                 // Job of child thread
            System.out.println(" child Thread running "+i);
        }
    };
}
