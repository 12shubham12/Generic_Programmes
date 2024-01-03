package Collections;/*
1. underlying datastructure is Hashtable and LinkedList (hybrid datastructure)
2. duplicates are not allowed
3. Insertion order is preserved
4. child of hashset
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSet_Demo {

    @Test
    public void collection(){

        //Constructors
        LinkedHashSet hs1 = new LinkedHashSet();
        LinkedHashSet<String> hs2 = new LinkedHashSet<>();
        LinkedHashSet<Integer> hs3 = new LinkedHashSet<>();
        LinkedHashSet<Objects> hs6 = new LinkedHashSet<>();
        LinkedHashSet<String> hs7 = new LinkedHashSet<>(10);
        LinkedHashSet<String> hs8 = new LinkedHashSet<>(10,0.9f);
        
        //adding values
        hs1.add("Amit");
        hs2.add("Aman");
        hs3.add(12345);

        //Create collection from existing collection
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        HashSet hs4 = new HashSet(al);
        System.out.println(hs4.size());

        //adding group of objects, i.e to add collection
        hs1.addAll(al);
        System.out.println(hs1.size());

        //removing a particular object or group of objects or all the objects
        hs1.remove("Amit");
        hs1.removeAll(al);
        hs4.clear();

        System.out.println(hs1.size());
        System.out.println(hs2.size());
        System.out.println(hs3.size());
        System.out.println(hs4.size());

        //removing all the objects except the collection of objects
        LinkedHashSet<String> hs5 = new LinkedHashSet<>();
        hs5.add("Example1");
        hs5.add("Example2");
        hs5.add("Example3");
        hs5.addAll(al);
        System.out.println("Size of hs5 is: "+hs5.size());
        System.out.println(hs5);

        hs5.retainAll(al);
        System.out.println("Size of hs5 is: "+hs5.size());
        System.out.println(hs5);

        //Other methods
        System.out.println(hs5.isEmpty());
        System.out.println(hs5.contains(1));
        System.out.println(hs5.containsAll(al));

        //duplicate is not allowed, there will be no compile time or run time error, boolean return as false
        System.out.println(hs5.add("1"));
        System.out.println(hs5.add("1"));
    }
}
