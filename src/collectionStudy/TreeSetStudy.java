package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(78);
        treeSet.add(43);
      //  treeSet.add("komal"); classCastexception
        treeSet.add(66);
        treeSet.add(2);
        System.out.println(treeSet);
        System.out.println("======ceiling=======");
        System.out.println(treeSet.ceiling(45));
        System.out.println("======floor=======");
        System.out.println(treeSet.floor(33));
        System.out.println( treeSet.pollFirst());
        System.out.println("=============");// returns first element
        for (Object ts:treeSet)
        {
            System.out.println(ts);
        }
        Iterator<Object> it = treeSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
