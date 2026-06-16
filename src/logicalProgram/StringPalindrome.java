package logicalProgram;

public class StringPalindrome
{
    public static void main(String[] args)
    {
        String a1= "Mom";
        String rev = "";
        String a= a1.toLowerCase();
        for(int x= a.length()-1;x>=0;x--)
        {
           char temp = a.charAt(x);
           rev = rev+temp;
        }
        System.out.println(rev);
        System.out.println("Check Given string is palindrome or not");
        if(a.equals(rev))
        {
            System.out.println("Given string is a palindrome");
        }
        else
        {
            System.out.println("Given string is not a palindrome");
        }
    }
}
