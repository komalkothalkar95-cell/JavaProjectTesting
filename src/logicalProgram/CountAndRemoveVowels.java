package logicalProgram;

import java.util.Locale;
import java.util.Scanner;

public class CountAndRemoveVowels
{
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner scanner = new Scanner(System.in);
        String givenString1 = scanner.next();
        String givenString= givenString1.toLowerCase();
        String output= "";
        int count=0;
        for (int i=1;i<=givenString.length()-1;i++)
        {
            char t=givenString.charAt(i);
            if ( t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
            {
                count++;
                System.out.println("vowel found are "+t);
                continue;
            }
            output=output+t;
        }
        System.out.println("String without vowel are "+output);
        System.out.println("count of vowels are "+count);

    }
}
