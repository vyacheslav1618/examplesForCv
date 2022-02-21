package com.asd;

import java.util.ArrayList;
import java.util.LinkedList;

public class NewMain {
//asdasdasdasd
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        long start = System.nanoTime(); // creating a time reference point

        for (int i = 0; i < 100; i++) {
            // int a = 0, b = 9999; // initialization borders of randomly generated values
            // int value = a + (int) (Math.random() * b);
            // al.add(i, value);
            al.add(i, i);
        }
        // calculating of the time spent to fill ArrayList array
        System.out.println("time of add elements to ArrayList, ns: "
                + (System.nanoTime() - start) + "\n");

        long start2 = System.nanoTime(); // creating a time reference point

        for (int i = 0; i < 100; i++) {
            // int a = 0, b = 9999; // initialization borders of randomly generated values
            // int value = a + (int) (Math.random() * b);
            // ll.add(value);
            ll.add(i);
        }
        // calculating of the time spent to fill LinkedList array
        System.out.println("time of add elements to LinkedList, ns: "
                + (System.nanoTime() - start2) + "\n");

        // System.out.println(al);
        // System.out.println("\n------------------------------");
        // System.out.println(ll);
        //adding an element to the end of arrays
        long start3 = System.nanoTime(); // creating a time reference point
        al.add(101010101);
        // calculating of the time spent to fill ArrayList array
        System.out.println("time of add element to the end of ArrayList, ns: "
                + (System.nanoTime() - start3) + "\n");
        System.out.println(al);

        long start4 = System.nanoTime(); // creating a time reference point
        ll.add(101010101);
        // calculating of the time spent to fill LinkedList array
        System.out.println("time of add element to the end of LinkedList, ns: "
                + (System.nanoTime() - start4) + "\n");
        System.out.println(ll);

        //adding an element to the middle of arrays
        long start5 = System.nanoTime(); // creating a time reference point
        al.add(50, 101010101);
        // calculating of the time spent to fill ArrayList array
        System.out.println("time of add element to the middle of ArrayList, ns: "
                + (System.nanoTime() - start5) + "\n");
        System.out.println(al);

        long start6 = System.nanoTime(); // creating a time reference point
        ll.add(50, 101010101);
        // calculating of the time spent to fill LinkedList array
        System.out.println("time of add element to the middle of LinkedList, ns: "
                + (System.nanoTime() - start6) + "\n");
        System.out.println(ll);
    }
}
