package pattern;

public class Pattern3
{
//            *****
//            ****
//            ***
//            **
//            *
    public static void main(String[] args) {
        int row=5;int n=5;
        int col=5;
        int star=5;
        // declare n value =star value
        // replace star with n
        for(int i=1;i<=row;i++)
        {
            for (int j=1;j<=star;j++)
            {
                System.out.print(n);
            }
            System.out.println();
            star--;
            n--;
        }
    }
}
