package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistUsingLoop
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(45);
        arrayList.add(55);
        System.out.println("======for loop=============");
         for (int i=0;i<=arrayList.size()-1;i++)
         {
             System.out.println(arrayList.get(i));
         }
        System.out.println("======for each loop=============");
        for (Integer al :arrayList)
        {
            System.out.println(al);
        }
        System.out.println("======using iterator=============");
        Iterator<Integer> it = arrayList.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(arrayList);
        System.out.println("======using list iterator=============");
        ListIterator<Integer> lit = arrayList.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println(arrayList);
        System.out.println("======using reverse iterator=============");

        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        System.out.println(arrayList);
    }
}
