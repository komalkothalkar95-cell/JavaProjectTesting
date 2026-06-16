package June14Mock;

public class ReverseWordOfString
{
    public static void main(String[] args) {
        String a= "Java Selenium Testing";
        String name[]= a.split(" ");
        for (String word :name)
        {
            StringBuilder sb= new StringBuilder(word);
            String reversed =sb.reverse().toString();
            System.out.print(reversed + "  " );
        }
        System.out.println();
        String b= "my name is komal";
        String text[]=b.split(" ");
        for(String c:text)
        {
            StringBuilder sb = new StringBuilder(c);
            String rev=sb.reverse().toString();
            System.out.print(rev+ " ");
        }
    }
}
