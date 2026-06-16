package stringStudy;

import java.util.Arrays;

public class NumberOfChar
{
    public static void main(String[] args) {
        String l = "Java is easy";
      String result[] = l.split(" ");
        System.out.println(result.length);

        int num[]={44,66,32,55};
        System.out.println(num.length-1);
        Arrays.sort(num);
        System.out.println(num[num.length-1]);
        System.out.println(num[num.length-2]);



    }




}
