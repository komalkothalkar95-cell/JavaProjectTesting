package collectionStudy;

import java.util.Iterator;

public class LinkedHashSet {
    public static void main(String[] args) {
        // allows only 1 null value/order is maintained/no duplicates are allowed
        java.util.LinkedHashSet <Integer>linkedHashSet= new java.util.LinkedHashSet<>();
        linkedHashSet.add(45);
        linkedHashSet.add(66);
        linkedHashSet.add(null);
        linkedHashSet.add(33);
        linkedHashSet.add(11);
        linkedHashSet.add(33);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
        linkedHashSet.addFirst(0);
        linkedHashSet.addLast(3);
        linkedHashSet.getLast();
        linkedHashSet.getFirst();
        linkedHashSet.removeFirst();
        linkedHashSet.removeLast();
        System.out.println(linkedHashSet);
        for (Integer lt :linkedHashSet)
        {
            System.out.println(lt);
        }
        Iterator<Integer> it = linkedHashSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(linkedHashSet);


    }

}
