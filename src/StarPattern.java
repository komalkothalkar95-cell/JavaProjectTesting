public class StarPattern {
    public static void main(String[] args)
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----using---12345");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----using---abcde");
        for(char i='A'; i<='F';i++)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(j);
            }
        }System.out.println();

    }
}
