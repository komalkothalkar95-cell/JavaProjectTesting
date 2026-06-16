package logicalProgram;

public class SpaceCount
{
    public static void main(String[] args)
    {
        String b =" hard wor  k";
        int count=0;
        for(int i=0;i<=b.length()-1;i++)
        {
            char a = b.charAt(i);
            if(a == ' ')
            {
                count++;
            }

        }
        System.out.println("Number of white space "+count);
    }
}
