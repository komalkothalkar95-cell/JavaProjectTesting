package logicalProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicateAndSort
{
    public static void main(String[] args)
    {
        int marks[]={44,66,22,99,22,100,33};
        TreeSet<Integer> ts= new TreeSet<>();
        for(int m :marks)
        {
            System.out.println(m);
            ts.add(m);
        }
        System.out.println(ts);
        for(int a :ts)
        {
            System.out.println(a);
        }
        System.out.println("-------------------------");
        ArrayList<Integer> arrayList= new ArrayList<>(ts);
        System.out.println(arrayList);
        System.out.println("get highest marks "+ arrayList.get(arrayList.size()-1));
        System.out.println("get second highest marks "+ arrayList.get(arrayList.size()-2));
        System.out.println("get lowest marks "+ arrayList.get(0));



    }
}
