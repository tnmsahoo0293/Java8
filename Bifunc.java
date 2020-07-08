package com.company;
import java.sql.Time;
import java.util.*;
import java.util.function.*;
class Emp{
    int eno;
    String name;
    double dailywage;

    Emp(int eno,String name,double dailywage){
        this.eno=eno;
        this.name=name;
        this.dailywage=dailywage;
    }

}
class Timesheet{
int eno;
int days;
Timesheet(int eno, int days){
    this.eno=eno;
    this.days=days;
}

}

public class Bifunc {
    public static void main(String[] args) {
    BiFunction<Emp,Timesheet,Double>f= (e,t)->e.dailywage*t.days;

    System.out.print("Monthly Salary "+f.apply(new Emp(0115,"tanmay",4000.50),new Timesheet(0115,30)));

    String s1= "Tanmay";
    String s2="Sahoo";
    String s3=s1+s2;
    System.out.print("\n"+s3);
    }
}
