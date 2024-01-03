package Collections;/*
1. Implementation class of List
2. duplicates are allowed
3. Insertion order is preserved
4. differentiate duplicates in a List by using index
5. insertion order is preserved by using index
6. null insertion is possible
7. Recommended when operation is retrieve operation.
8. Worst case if operation is insertion in middle or removal from middle, as internally elements have to be shifted
 */

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class ArrayList_Demo {

    WebDriver driver;

    @Test(priority=1)
    public void collection(){

        //Constructors
        ArrayList hs1 = new ArrayList(); //creates an empty ArrayList Object with default initial capacity 10
        ArrayList<String> hs2 = new ArrayList<>();
        ArrayList<Integer> hs3 = new ArrayList<>();
        ArrayList<Objects> hs6 = new ArrayList<>();

        //with provided initial capacity
        ArrayList<Objects> al01 = new ArrayList<>(16);
        
        //adding values
        hs1.add("Amit");
        hs2.add("Aman");
        hs3.add(12345);

        //Create collection from existing collection
        HashSet hast = new HashSet();
        hast.add(1);
        hast.add(2);
        ArrayList hs4 = new ArrayList(hast);
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
        ArrayList<String> hs5 = new ArrayList<>();
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

        //duplicate is allowed,
        hs5.add("1");
        hs5.add("1");
        System.out.println(hs5);

        //Methods specific to ArrayList Class
        ArrayList<String> hs7 = new ArrayList<>();

        //add object to specific index
        hs7.add(0,"Add1");
        hs7.add(1,"Add2");
        System.out.println(hs7);

        //add group of objects or collection to specific index (from specified index onwards)
        hs7.addAll(1,hast);
        System.out.println(hs7);

        //remove of an object from specific index
        hs7.remove(0);
        System.out.println(hs7);

        //to check index of particular object -> it will return first occurrence of object
        System.out.println(hs7.indexOf(2));

        //to know the last time when the object came or appeared
        System.out.println(hs7.lastIndexOf(2));

        //to get object specified at particular index -> if no object then null will be returned
        System.out.println(hs7.get(2));
       // System.out.println(hs7.get(4)); // check this

        //to replace an element at specified index
        hs7.set(0,"AddNew");
        System.out.println(hs7);


    }
}
