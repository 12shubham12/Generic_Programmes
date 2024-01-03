package Collections;/*
1. underlying datastructure is Hashtable
2. duplicates are not allowed
3. Insertion order is based on Hashcode of the object
4. null insertion is possible
5. Best use when operation is search operation, as objects are inserted based on hascode
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSet_Demo {

    @Test
    public void collection(){

        //Constructors
        //create empty HashSet with default initial capacity=16 and Fill Ratio/Load Factor=0.75
        HashSet hs1 = new HashSet();
        HashSet<String> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();
        HashSet<Objects> hs6 = new HashSet<>();
        //with initial capacity defined and default Fill Ratio
        HashSet<String> hs7 = new HashSet<>(10);
        //with defined initial capacity and Fill Ratio
        HashSet<String> hs8 = new HashSet<>(10,0.80f);

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
        HashSet<String> hs5 = new HashSet<>();
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

        //duplicate is not allowed, there will be no no compile time or run time error, boolean retun as false
        System.out.println(hs5.add("1"));
        System.out.println(hs5.add("1"));
    }

}
