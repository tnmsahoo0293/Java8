package com.company;
import java.util.*;
public class Treesetorderlmabda {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>((x, y) -> (x > y) ? -1 : (x < y) ? 1 : 0); // descending order sorting using comparator
        // (x, y) -> (x > y) ? -1 : (x < y) ? 1 : 0
        s.add(1);
        s.add(2);
        s.add(8);
        s.add(3);
        s.add(9);
        s.add(5);


       // This is illegal method for sets as collections.sort method works only on lists Collections.sort(s,Collections.reverseOrder());
        System.out.print(s);

    }
}
