package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorAssignment
{
    public static void main(String[] args) {
        Vector<Integer> vector= new Vector<>();
        vector.add(32);

        vector.add(11);
        vector.add(99);
        vector.addElement(45);
        vector.add(2,78);
        System.out.println(vector);
        System.out.println("=====using for loop=====");
        for(int i = 0; i<=vector.size()-1;i++)
        {
            System.out.println(vector.get(i));
        }
        System.out.println(vector);
        System.out.println("=====using for each loop=====");
        for(Integer vc : vector)
        {
            System.out.println(vc);
        }
        System.out.println(vector);
        System.out.println("=====using iterator cursor=====");
        Iterator<Integer> it = vector.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(vector);
        System.out.println("=====using list-iterator cursor=====");
        ListIterator<Integer> lit = vector.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());

        }
        System.out.println(vector);
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());

        }
        System.out.println(vector);
        System.out.println("=====using enumeration cursor=====");
        Enumeration<Integer> ele = vector.elements();
        while(ele.hasMoreElements())
        {
            System.out.println(ele.nextElement());
        }
        System.out.println(vector);



    }
}
