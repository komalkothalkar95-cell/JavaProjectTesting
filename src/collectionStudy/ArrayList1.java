package collectionStudy;

import java.util.ArrayList;

public class ArrayList1
{
    public static void main(String[] args) {
        ArrayList<Integer> arraylist  = new ArrayList<>();
        arraylist.add(45);
        arraylist.add(45);
        arraylist.size();
        boolean a = arraylist.add(34);
        arraylist.add(2,67);
        System.out.println(arraylist);
        arraylist.addFirst(2);
        arraylist.addLast(99);
        System.out.println("========");
        int b = arraylist.indexOf(99);
        System.out.println("index"+b);
        boolean c = arraylist.contains(45);
        System.out.println(c);
        System.out.println(arraylist.contains(3));
        System.out.println(arraylist.get(4));
        System.out.println(arraylist);
        Object cloned = arraylist.clone();
        System.out.println("cloned arraylist "+cloned);
        System.out.println("========");
        System.out.println(arraylist.equals(cloned));



    }
}
