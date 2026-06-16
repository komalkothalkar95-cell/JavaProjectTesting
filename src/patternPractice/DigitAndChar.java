package patternPractice;

public class DigitAndChar {
    public static void main(String[] args) {
        int rows=5; char c='E';
        int col=5; int n=5;
        int star=5;
        for (int i=1;i<=rows;i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print(n);
            }
            System.out.println();
        star--;
            n--;
        }
        System.out.println("===========================");
        int r=5; int cl =5;
        int space=4; int n2=1;
        char ch= 'A';
        int star1=1;
        for (int i=1;i<=r;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star1;k++)
            {
                System.out.print(ch);
            }
            System.out.println();
            star1++;
            ch++;
            space--;
        }
//             *
//             **
//             ***
//             ****
        System.out.println("========01 may===================");
        int row=5; int x=1;
        int spc=4;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=spc;j++)
            {
                System.out.print(" ");
            }
            for (int k =1; k<=x;k++)
            {
                System.out.print(k);

            }
            System.out.println();
            spc--;
            x++;
        }
        System.out.println("========02 may==number=================");
//           *
//          ***
//         *****
//        *******
        int r1=4;
        int c1=7;
        int s1=3;
        int y=1;
        for (int i=1;i<=r1;i++)
        {
           for (int j =1;j<=s1;j++)
           {
               System.out.print(" ");
           }
           for (int k =1;k<=y;k++)
            {
                System.out.print(y);
            }
            System.out.println();
           s1--;
           y=y+2;
        }
        System.out.println("========02 may==character=================");
  int crow=5;
  char m='A';
  int st=1;
  for (int i=1;i<=crow;i++) {
      for (int j = 1; j <= st; j++) {
          System.out.print(m+" ");
      }
      System.out.println();
      m++;
      st++;
  }
  System.out.println("----------36  char----------------");
        int r2=5;
        int star2=1;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=star2;j++)
            {
                System.out.print( (char)(64+j)+" ");
            }
            System.out.println();
            star2++;
}

    } }
