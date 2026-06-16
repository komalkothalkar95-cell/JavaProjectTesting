package pattern;

public class Pattern10 {
    public static void main(String[] args){
//      *
//        **
//        ****
//        *****
//        ****
//        ***
//        **
//        *
    int row=9; int n=1;
    int star=1;
    for(int i=1;i<=row;i++)
    {
        for (int j=1;j<=star;j++)
        {
            System.out.print(n);
        }
        System.out.println();
        if(i<5)
        {
           star++;
           n++;
        }
        else
        {
         star--;
          n--;
        }


    }

    }

}
