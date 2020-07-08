package com.company;
import java.util.*;

public class Sortcollection {
    public static void main(String[] args) {

        Map<Integer, String> mymap = new TreeMap<Integer, String>((x,y)->(x>y)?-1:(x<y)?1:0); // lambda expression for
                                                                                             // descending order sorting
        mymap.put(100, "Tanmay");
        mymap.put(300, "Tarun");
        mymap.put(200, "varun");
        System.out.print(mymap);
    }
}
