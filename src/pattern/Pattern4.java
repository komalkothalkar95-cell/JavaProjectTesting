package pattern;


public class Pattern4
{
    public static void main(String[] args) {
//        *****
//         ****
//          ***
//           **
//            * left side space
        int row=5;
        int col=5;
        int space=0;
        int star= 5;
        for(int i=1;i<=row;i++)
        {
            //inner for loop1 for -->space
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //inner for loop2 for--->stars
            for (int k =1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star--;

        }

    }
}
