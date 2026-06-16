package pattern;

public class Pattern1
{
    public static void main(String[] args)
    {
        //  *****
        //  *****
          //*****
// rows, columns, ......if not symmetric  stars in 1st line , space in left

        int row =3; // outer row
        int col=5;// inner col
        // outer for rows
        for(int i=1;i<=row;i++)
        {
            for(int j =1;j<=col;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
