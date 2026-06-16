package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistCursor
{
    public static <listIterator> void main(String[] args) {
        ArrayList<String> arraylist= new ArrayList<>();
        arraylist.add("komal");
        arraylist.add("madhuri");
        arraylist.add("pragati");
        arraylist.add("rahul");
        arraylist.add("sarika");
        System.out.println(arraylist);
        System.out.println("using for each loop----------");
        for(String st:arraylist)
        {
            System.out.println(st);
        }
        Iterator<String> it = arraylist.iterator();
        System.out.println("using iterator----------");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(arraylist);
        System.out.println("using list iterator----reverse------");

        ListIterator<String> lit = arraylist.listIterator();

        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println(arraylist);
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        System.out.println(arraylist);




    }
}
