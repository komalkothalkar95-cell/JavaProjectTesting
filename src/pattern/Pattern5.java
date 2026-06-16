package pattern;

public class Pattern5
{
    public static void main(String[] args)
    {
//           *
//          **
//         ***
//        ****
//       *****
   int row=5;
   int col =5;
   int space=4;
   int star =1;
   for (int i=1;i<=row;i++)
   {  // inner for loop1 ---> space
       for(int j=1;j<=space;j++)
       {
           System.out.print(" ");
       }
       for (int k=1;k<=star;k++)
       { // inner for loop1 ---> star
           System.out.print("*");
       }
       System.out.println();
       space--;
       star++;


   }

    }
}
