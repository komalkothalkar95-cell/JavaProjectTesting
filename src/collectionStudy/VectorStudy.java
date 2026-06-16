package collectionStudy;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy
{
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();

        vector.add(null);
        vector.add("komal");
        vector.add(123);
        vector.add(null);
        vector.add(4,'A');
        vector.add("sarika");
        
        vector.insertElementAt(33,1); // first element and then index
        vector.addElement(543); //add last
        System.out.println(vector);
        vector.addFirst(56);
        System.out.println(vector.lastElement()); // returns last
        System.out.println(vector.firstElement());
        System.out.println("--------------");
        for(int i=0; i <= vector.size()-1;i++)
        {
            System.out.println(vector.get(i));
        }
        System.out.println("------------for each loop -------");
        for(Object vt:vector)
        {
            System.out.println(vt);
        }
        System.out.println("------------iterator -------");
        Iterator<Object> it = vector.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(vector);
        System.out.println("-----------list iterator -------");
        ListIterator<Object> lit = vector.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println(vector);
        System.out.println("-----------list iterator -------");
        ListIterator <Object> lit1 = vector.listIterator();
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        System.out.println("---remove operation----");
        System.out.println(vector);
        // if i want to remove element 3
        lit.next();
        lit.next();
        lit.next();
        lit.next();
        lit.remove();
        System.out.println(vector);
        lit.previous();
        lit.set(43);
        System.out.println(vector);






    }
}
