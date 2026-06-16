package logicalProgram;

import java.util.Scanner;

public class ReverseOddPlaceString
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = scanner.next();
        String rev="";
        String s[]=s1.split(" ");
        for (int i=0;i<=s.length-1;i++)
        {
            if (i%2!=0)
            {
               String temp= s[i];
               for (int j=temp.length()-1;i>=0;i--)
               { char t = temp.charAt(j);
                   rev=rev+ t;
               }
               s[i]=rev;
               rev="";
            }
        }
        for (int i=0;i<=s.length-1;i++)
        {
            System.out.println(s[i]+ " ");
        }


    }
}
