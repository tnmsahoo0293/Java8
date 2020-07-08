package com.company;
import java.util.*;
import java.util.function.Function;

class Student{
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks= marks;
    }

}
public class Funct {
    public static void main(String[] args) {
    List<Student> list= new ArrayList<>();
    list.add(new Student("Tanmay", 100));
        list.add(new Student("Tanm", 90));
        list.add(new Student("Tan", 80));
        list.add(new Student("Vinay", 70));
        list.add(new Student("Jay", 99));
Function<Student, String> f= s->{
  int marks=s.marks;
  if(marks>=80)
      return "A";
  else if(marks>=60)
      return "B";
  else if(marks>=80)
      return "C";
  else if(marks>=35)
      return "D";
  else
      return"E";
};

        for (Student s:list) {
           System.out.println(f.apply(s));
        }

    }

}
