package logicalProgramDemo;

public class ReverseOddPlaceString {
    public static void main(String[] args) {
        String s1="i love my India";
        String rev="";
        String s[]=s1.split(" ");
        for (int i=0;i<=s.length-1;i++)
        {
            if (i%2!=0) {
                String temp=s[i];
                for (int j = temp.length()-1;j>=0;j--)
                {
                   char t= s1.charAt(j);
                   rev= rev+t;
                }
               s[i]=rev;
            }
        }
        for (int i=0;i<=s.length-1;i++)
        {
            System.out.print(s[i]+" ");
        }

    }
}
