package stringStudy;

import java.util.Arrays;

public class AnagramString
{
    public static void main(String[] args)
    {
        String a = "exit";
        String b = "iext";
        char[] arr1 = a.toCharArray();// {'e','x','i','t'}
        char[] arr2 = b.toCharArray();//{'i','e','x','t'}
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Given String is anagram");
        }
        else {
            System.out.println("Given String is not anagram");
        }


    }
}
