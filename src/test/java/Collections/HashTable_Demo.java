package Collections;/*
1. child class of HashMap
2. Each key-value pair is called entry, hence map is a collection of entry objects.
3. duplicate keys are not allowed
4. duplicate values are allowed
5. underlying datastrurcture is HashTable and LinkedList
6. Insertion order is preserved
7. null value is allowed for key but only once as duplicate keys are not allowed
8. For values, null is allowed even for more than one.
9. Best if operation is search operation
 */

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable_Demo {

    @Test
    public void map_Collection_demo(){

        //Constructors
        //creates empty Hashtable with default initial capacity=11 and Fill Ratio=0.75
        Hashtable hm1 = new Hashtable();
        Hashtable<String, String> hm2 = new Hashtable<String, String>();


        Hashtable<String, String> hm3 = new Hashtable<String, String>(5);
        Hashtable<String, Integer> hm4 = new Hashtable<String, Integer>(5,0.75f);

        //Creating a Map from another Map
        Map<String, Integer> hmm = new HashMap<String, Integer>();

        hmm.put("Red",1);
        hmm.put("Blue",2);
        hmm.put("Green",3);
        hmm.put("Yellow",4);
        System.out.println(hmm);

        Hashtable<String, Integer> hmm1 = new Hashtable<String, Integer>(hmm);
        System.out.println(hmm1);

        //Methods
        //adding a key-value pair to the Map
        hm2.put("Name1", "Amit");
        hm2.put("Name2", "Akshay");
        hm2.put("Name3", "Kishor");
        /*if the key is already present, then the old value for that particular key
        will be replaced with the new value and returns old value */
        hm2.put("Name1", "Amit Jha");
        System.out.println(hm2);

        /*to add a group of key-value pair i.e Map, also adding Map will not replace existing value
        of a key with same name */
        hm2.put("Name3", "Kishor Ingle");
        hm3.putAll(hm2);
        System.out.println(hm3);

        //return value of specified key, null will be returned if no value is there
        System.out.println(hm3.get("Name3"));

        //removing a key-value pair
        hm3.remove("Name2");
        System.out.println(hm3);

        //to check if specified key is present in Map
        System.out.println(hm3.containsKey("Name2"));

        //to check if specified value is present in Map
        System.out.println(hm3.containsValue("Amit Jha"));

        //check siz of Map
        System.out.println(hm3.size());

        //removing all key-value pair
        hm3.clear();
        System.out.println(hm3);

        //to check if Map is empty
        System.out.println(hm3.isEmpty());

        //Other 3 methods which are collection view of Map, as these methods are not Map methods
        /*keySet() method is to get only keys from a Map, also Set is the return type as we dont want
        duplicate, and keys dont have duplicate values */
        Set s = hm2.keySet();
        System.out.println(s);

        // to get only the values, since value can be duplicate hence we are using Collection
        System.out.println(hm2.values());

        //to give key-value pairs
        System.out.println(hm2.entrySet());

    }
}
