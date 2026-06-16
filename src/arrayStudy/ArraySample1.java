package arrayStudy;

import java.util.Arrays;

public class ArraySample1 {
    public static void main(String[] args) {
        String batters[] = {"shubman","virat","raina","rohit","dhoni"};

        for(int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }
        System.out.println("-----ascending-----");
        Arrays.sort(batters);
        for(int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }
        System.out.println("-----descending-----");
        for(int i=batters.length-1;i>=0;i--)
        {
            System.out.println(batters[i]);
        }


    }
}
