package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy
{
    public static void main(String[] args) {
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("pihu");
        hashSet.add("chiu");
        hashSet.add("pihu");
        hashSet.add(null);
        hashSet.add("bihu");
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(null));
        System.out.println("============");
        for(String hs :hashSet)
        {
            System.out.println(hs);
        }
        System.out.println("============");
        System.out.println(hashSet);
        Iterator<String> it = hashSet.iterator();
        it.next();
        System.out.println(it.next());

    }
}
