package pattern;

public class Pattern12
//         *
//        ***
//       *****
//      *******
//       *****
//        ***
//         *
{
    public static void main(String[] args) {
        int row=7;
        int star=1;
        int space=3;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i<4)
            {
                star=star+2;
                space--;
            }
            else {
                star=star-2;
                space++;
            }
        }
    }

}
