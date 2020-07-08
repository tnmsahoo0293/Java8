package com.company;

@FunctionalInterface
interface Interf {
    public void abs();
    default void m2(){
        System.out.print("Hello");
    }

}
