package arrayStudy;

import java.util.ArrayList;

public class ForEachLoop
{
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
       // arrayList.add(3);
     //   arrayList.add(4);
      //  arrayList.add(6);
       // arrayList.add(7);
        arrayList.add(00,5);
        arrayList.add(01,15);
        arrayList.add(10,50);
        arrayList.add(11,58);
        for ( Integer id:arrayList)
        {
            System.out.print(id + "  ");
        }
    }
}
