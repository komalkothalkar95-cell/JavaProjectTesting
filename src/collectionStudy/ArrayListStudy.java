package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy
{ //generic arraylist
public static void main(String[] args) {
    ArrayList<Object> arrayList= new ArrayList<>();
    arrayList.add("komal");
    arrayList.add(233);
    arrayList.add('a');
    arrayList.add(88.9f);
    arrayList.add(true);
    arrayList.add('a');
    arrayList.add(88.9f);
    arrayList.add(true);
    arrayList.add(null);
    arrayList.add(77.9d);
    arrayList.add(false);
    arrayList.add(4535);
    System.out.println(arrayList);

    System.out.println("=================");
    arrayList.add(3,"test");
    System.out.println(arrayList);
    System.out.println("=================");
}
}