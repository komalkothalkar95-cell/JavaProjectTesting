package logicalProgram;

import java.util.Arrays;

public class PracticeLogic {
    public static void main(String[] args) {
        String s1="teet";
        String s2= "estt";
        char ar1[]= s1.toCharArray();
        char ar2[]= s2.toCharArray();

        Arrays.sort(ar1);// estt
        Arrays.sort(ar2);//estt
        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("Given string is anagram");
        }
       else
        {
            System.out.println("Given string is  not a anagram");
        }

    }
}
