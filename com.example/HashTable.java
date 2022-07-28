import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class HashTable {
    public static void main(String[] args) {

      /*  1.HashTable does not accept null key and null value
        2. Hashtable can be iterate through enumration or iterator

        */

        Hashtable<Integer,String> names=new Hashtable<Integer,String>();

        names.put(1,"priyanka");
        names.put(2,"Sourabh");
        names.put(3,"Ariana");
        names.put(4,"Angela");
        names.put(5,"Vihaan");


         //Method 1
        Enumeration<String> elements = names.elements();

        while(elements.hasMoreElements())
        {
            System.out.println(elements.nextElement());
        }

        //Method2
        Collection<String> values = names.values();

        Iterator<String> iterator = values.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());

            }

    }
}
