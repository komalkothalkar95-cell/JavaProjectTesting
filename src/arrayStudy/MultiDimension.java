package arrayStudy;

public class MultiDimension {
    public static void main(String[] args) {
        int test[][] = new int[2][2];
        test[0][0] = 5;
        test[0][1] = 10;
        test[1][0] = 15;
        test[1][1] = 20;
for(int i=0;i<=test.length-1;i++)
{
  for (int j=0; j<=test.length-1;j++)
  {
      System.out.print(test[i][j]+"  ");
  }
    System.out.println();
}


    }
}