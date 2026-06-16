package logicalProgram;

import java.util.Scanner;

public class ReverseStringUserInput
{
    public static void main(String[] args)
    {
        String rev="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        String givenString = scanner.next();
        for (int i=givenString.length()-1;i>=0;i--)
        {
           char temp= givenString.charAt(i);
           rev= rev+temp;
        }
        System.out.println("Given String is "+givenString);
        System.out.println("Reverse String is "+rev);
    }
}
