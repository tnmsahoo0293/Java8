package com.company;
import java.util.*;
import java.util.ArrayList;

 class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
       return(id+": "+name);
    }
}

public class Empsort {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<Employee>();
        list.add(new Employee(100,"tanmay"));
        list.add(new Employee(200,"Tarun"));
        list.add(new Employee(500,"varun"));
        list.add(new Employee(300,"Vijay"));

        Collections.sort(list,(e1,e2)->(e1.id>e2.id)?-1:(e1.id<e2.id)?1:0);
        System.out.print(list);
    }
}
