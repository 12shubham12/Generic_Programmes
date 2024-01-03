package Collections;/*
1. Implementation class of List
2. duplicates are allowed
3. Insertion order is preserved
7. Recommended when operation is insertion in middle or removal from middle, as elements are stored in nodes at
different memory location (not consecutive)
8. Worst case if our operation is retrieval operation, as we have to go node by node to reach
the required node's element
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedList_Demo {

    @Test
    public void collection(){

        //Constructors
        LinkedList hs1 = new LinkedList(); //creates an empty ArrayList Object with default initial capacity 10
        LinkedList<String> hs2 = new LinkedList<>();
        LinkedList<Integer> hs3 = new LinkedList<>();
        LinkedList<Objects> hs6 = new LinkedList<>();


        //adding values
        hs1.add("Amit");
        hs2.add("Aman");
        hs3.add(12345);

        //Create collection from existing collection
        ArrayList hast = new ArrayList();
        hast.add(1);
        hast.add(2);
        LinkedList hs4 = new LinkedList(hast);
        System.out.println(hs4.size());

        //adding group of objects, i.e to add collection
        hs1.addAll(hast);
        System.out.println(hs1.size());

        //removing a particular object or group of objects or all the objects
        hs1.remove("Amit");
        hs1.removeAll(hast);
        hs4.clear();

        System.out.println(hs1.size());
        System.out.println(hs2.size());
        System.out.println(hs3.size());
        System.out.println(hs4.size());

        //removing all the objects except the collection of objects
        LinkedList<String> hs5 = new LinkedList<>();
        hs5.add("Example1");
        hs5.add("Example2");
        hs5.add("Example3");
        hs5.addAll(hast);
        System.out.println("Size of hs5 is: "+hs5.size());
        System.out.println(hs5);

        hs5.retainAll(hast);
        System.out.println("Size of hs5 is: "+hs5.size());
        System.out.println(hs5);

        //Other methods
        System.out.println(hs5.isEmpty());
        System.out.println(hs5.contains(1));
        System.out.println(hs5.containsAll(hast));

        //duplicate is allowed
        hs5.add("1");
        hs5.add("1");
        System.out.println(hs5);

        //Methods specific to LinkedList class

        LinkedList<String> hs7 = new LinkedList<>();
        hs7.add("First");
        hs7.add("Second");

        //adding object at first place
        hs7.addFirst("AddFirst");
        System.out.println(hs7);

        //adding object at end place
        hs7.addLast("AddLast");
        System.out.println(hs7);

        //getting object from and at end place
        System.out.println(hs7.getFirst());
        System.out.println(hs7.getLast());

        //removing object from first at end place
        hs7.removeFirst();
        hs7.removeLast();
        System.out.println(hs7);





    }
}
