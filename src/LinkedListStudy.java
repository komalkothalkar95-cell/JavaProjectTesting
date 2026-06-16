import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(34);
        linkedList.add(null);
        linkedList.add(44);
        linkedList.add(34);
        linkedList.add(15);
        linkedList.add(20);
        System.out.println(linkedList);
        linkedList.add(1,3);
        System.out.println(linkedList.offer(2));//last element
        System.out.println("-------------------");
        System.out.println(linkedList.peek()); //retrieve but not remove
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);
        System.out.println("----------------------");
        linkedList.poll();
        linkedList.pop();
        System.out.println(linkedList.pollFirst());
        linkedList.pollLast();
        linkedList.offer(3);
        System.out.println(linkedList);
        System.out.println("------------pop---------------");
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println("===================");
        for( Integer vc:linkedList)
        {
            System.out.println(vc);
        }
        System.out.println("===================");
        Iterator<Integer> it = linkedList.iterator();
        it.next();
        it.next();
        System.out.println(it.next());
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(linkedList);
        System.out.println("============list iterator =======");
        ListIterator<Integer> lit = linkedList.listIterator();
        System.out.println(linkedList);
       lit.next();
        lit.next();
        System.out.println(lit.next());
        //lit.previous();
        System.out.println(lit.previous());






    }
}
