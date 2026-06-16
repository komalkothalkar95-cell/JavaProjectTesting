package logicalProgram;

import java.util.Scanner;

public class EvenOddNumber
{
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner scanner=new Scanner(System.in);
      int num=scanner.nextInt();
      if (num==0)
      {
          System.out.println("given num is zero so cant define odd or even");
      }
        else if (num%2==0)
        {
            System.out.println("given num is  even");
        }
      else
      {
          System.out.println("given num is  odd");
      }
    }
}
