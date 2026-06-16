package assignment2_methods;

public class MethodsAssignment {

    //question 19,20,21,22,23,24
    public static void  name()
    {
        System.out.println("My name is Komal");
        add(3,5); // method inside method

    }
    public void rollno()
    {
        System.out.println("my roll number is 67");
    }
    public static void add(int x,int y)
    {  int sum=x+y;
        System.out.println("addition is "+sum);
    }
    int  average(int a,int b)
    {int sum=a+b;
        System.out.println(sum);
        int avg=sum/2;
        System.out.println(avg);
        return avg;
    }
    public static void main(String[] args)
    {
        MethodsAssignment methodsAssignment= new MethodsAssignment();
        name();
        methodsAssignment.rollno();
       //add(2,5);
        methodsAssignment.average(4,4);
    }

}
