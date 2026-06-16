package loopAssignment3;

public class DoWhile {
    public static void main(String[] args) {
        int num=1;//15
        do{
            System.out.println(num);
            num++;
        }
        while(num <=5);
        System.out.println("---------16------------");
        for (int i=5;i<=50;i=i+5)
        {
            System.out.println(i);
        }
        System.out.println("-----------17----------");
        int sum=0;int i=1;
        while (i<=10)
        {
            sum= sum+i;
            i++;
        }
        System.out.println(sum);
        System.out.println("-----------18----------");
        int a=4;
        int fact=1;
        for (int j=1;j<=a;j++)
        {
            fact=fact*j;
        }
        System.out.println(fact);
        System.out.println("-----------21----------");
        int count=0;
        for (int k=1;k<=50;k++)
        {
            if(k%3==0 && k%5==0)
            {
                count++;
            }
        }
        System.out.println("count of number divisible by 3 and 5 are "+count);
        System.out.println("-----------20----------");
        int y=54345;
        int rev=0;int remainder,original=y;
        while(y!=0)
        {
            remainder=y%10;
            rev=rev*10+remainder;
            y=y/10;
        }
        if (rev==original)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
        System.out.println("--------19 reverse using while---------");
        int n=5678;
        int reverse=0,remain;
        while(n!=0)
        {
            remain=n%10;
            reverse=reverse * 10+ remain;
            n=n/10;
        }
        System.out.println("reverse number is "+reverse);
        System.out.println("--------22-----divisible by 2 and 7-----");
        for (int m=1;m<=100;m++)
        {
            if (m%2==0 && m%7==0)
            {
                System.out.println(m);
            }
        }
        System.out.println("--------23-----number of digit in a number-----");
        int s=575888097;
        int c=String.valueOf(Math.abs(s)).length();
        System.out.println("count of digit is "+c);
        System.out.println("--------24 sum of even and odd-----");
        int evenadd=0;int oddadd=0;
        for (int o=1;o<=20;o++)
        {
            if (o%2==0)
            {  evenadd=evenadd+o;

            }
            else
            { oddadd=oddadd+o;

            }
        }System.out.println("addition of even "+evenadd);
        System.out.println("addition of odd "+oddadd);
        System.out.println("--------25 fibonaaci series upto 10----");

        int first=0;int second =1;
        System.out.println("Fibonacci series : "+ first+ ","+second+".......");
        for (int l=1;l<=10;l++)
        {
            int b= first+second;
            System.out.print(" " + b+" ,");
         first = second;
         second = b;
        }








    }
}
