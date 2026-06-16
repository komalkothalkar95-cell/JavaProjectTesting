package logicalProgram;

public class ReverseString
{
    public static void main(String[] args) {
        String s= "example"; // elpmaxe
         // maxindex = s.length()-1
        //int a =s.length()-1;
     String rev = "";
        for(int a= s.length()-1;a>=0;a--) // a=6
        {
            char t= s.charAt(a); // e
            rev = rev+t;
        }
        System.out.println(rev);

        String a= "Velocity";
        String rev1="";
        for (int j=a.length()-1;j>=0;j--)
        {
           char c= a.charAt(j);
           rev1=rev1+c;
        } System.out.println(rev1);

    }
}
