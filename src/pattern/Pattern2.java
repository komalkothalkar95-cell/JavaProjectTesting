package pattern;

public class Pattern2 {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****  row, col,    stars in first line , spCE
// declare char c= A and replace star with char c do c++ with star++

        int row= 5; char c='A';
        int col=5;
        int star=1;
        for(int i=1;i<=row;i++)
        {
           for(int j=1;j<=star;j++)
           {
               System.out.print(c);
           }
            System.out.println();
           star++;
           c++;
        }
    }
}
