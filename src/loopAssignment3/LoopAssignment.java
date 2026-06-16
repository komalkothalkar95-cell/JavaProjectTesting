package loopAssignment3;

public class LoopAssignment
{//Q1,2,3,4,5,8,9,10,11
    public static void main(String[] args) {
        int num=-4;
        if(num>0)
        {
            System.out.println("number is positive");
        } else if (num<0)
        {
            System.out.println("number is negative");
        } else
        {
            System.out.println("number is zero");
        }
        System.out.println("=================================");
        int digit=46;
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
        System.out.println("=================================");
        int a=3;int b=1;int c=8;
        if (a>b && a>c)
        {
            System.out.println("a is largest number");
        }
        else if (b>c && b>a)
        {
            System.out.println("b is largest number");
        }
        if (c>a && c>b)
        {
            System.out.println("c is largest number");
        }
        System.out.println("=================================");
        char ch='E';
        if (ch =='A' || ch =='E' ||ch =='I' ||ch =='O' ||ch =='U' )
        {
            System.out.println("character is a vowel");
        }
       else
        {
            System.out.println("character is not a vowel");
        }
        System.out.println("=================================");
       int age =34;
       if (age>=18)
       {
           System.out.println("Eligible for voting");
       }
       else
       {
           System.out.println("Not Eligible for voting");
       }
       int marks=88;
        if (marks>=90)
        {
            System.out.println("grade is A+");
        } else if (marks>=75) {
            System.out.println("grade is A");
        }
        else if (marks>=60) {
            System.out.println("grade is B");
        }
        else if (marks>=40) {
            System.out.println("grade is C");
        }
        int year= 2017;
        System.out.println("========leap year  ===========");
        if(year%400==0)
        {
            System.out.println("year is a leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
        System.out.println("========discount ===============");
        int amt= 8000;
        int disc=0;
        if(amt>5000)
        {
            disc=amt*20;
            disc=disc/100;
            System.out.println("discount is "+disc);
        } else if (amt>2000)
        {
            disc=amt*10;
            disc=disc/100;
            System.out.println("discount is "+disc);
        }
        else
        {
            System.out.println("no discount");
        }
        System.out.println("========loan eligibility ===============");
        String nationality="Indian";
        int Age=45;
        if (nationality=="Indian")
        {
            if (Age>=21)
            {
                System.out.println("Eligible");
            }
            else
            {
                System.out.println("not Eligible");
            }
        }
        else
        {
            System.out.println("nationality is other than indian");
        }
        System.out.println("================factorial=================");
        long factorial=1;
        int a1 =5;
        for (int i=1;i<=a1;i++)
        {
            factorial*=i;
        }
        System.out.println("factorial of num 5 is "+factorial);

        int z=65;
if (z%3 ==0)
{
    System.out.println("number is divisible by 3");
}
else {
    System.out.println("number is not divisible by 3");
}
int y=44;
if (y%2==0 && y%7==0)
{
    System.out.println("divisible by both 2 and  7");
}
else{
        System.out.println("not divisible by both 2 and  7");
    }


    }}

