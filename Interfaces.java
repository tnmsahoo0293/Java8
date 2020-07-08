package com.company;
import java.util.function.*;
import java.util.*;

class Stud{
    String name;
    int marks;

    Stud(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Interfaces {
    public static void main(String[] args) {

    Predicate<Stud> p= s-> s.marks>=60;
    Function<Stud,String> f= s-> {
        if (s.marks >= 80)
            return (" The student has passed the exam with grade A");
        else
            return "The student has passed the exam with grade B";
    };

    Consumer<Stud> c= s->{
        System.out.println(s.name+": "+f.apply(s));// for each student the grades are printed either A or B if they have scored above above 60 marks
    };

    List<Stud> list= new ArrayList<>();

        list.add(new Stud("Tanmay", 70));
        list.add(new Stud("vinay", 80));
        list.add(new Stud("Samay", 50));
        list.add(new Stud("Vijay", 60));
        list.add(new Stud("Pranay", 40));
        list.add(new Stud("Jay", 67));

        for (Stud k: list) {
            if(p.test(k)) {
                c.accept(k);
            }
            f.apply(k);
        }

    }
}
