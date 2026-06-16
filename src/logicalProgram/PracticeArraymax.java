package logicalProgram;

import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class PracticeArraymax
{
    public static void main(String[] args) {
        int arr[]={3,2,5,7,8,9,6,32,21};
    ArrayList<Integer> arrayList= new ArrayList<>();
    arrayList.add(56);
        arrayList.add(23);
        arrayList.add(33);
        arrayList.add(78);
        arrayList.add(31);
        arrayList.add(9);

        System.out.println(arrayList);
        System.out.println("max is "+(Collections.max(arrayList)));
        System.out.println("min is "+(Collections.min(arrayList)));

        System.out.println("min is "+(arrayList.get(0)));
        System.out.println("max is "+ arr.length);
     //   System.out.println("min is "+);

        TreeSet<Integer> treeSet= new TreeSet<>();
        for(int a:arr)
        {
         treeSet.add(a);
        }
        System.out.println(treeSet);
        System.out.println("min is "+treeSet.first());
        System.out.println("max is "+ treeSet.last());



       // System.out.println("maximum array number is "+);
    }
}
