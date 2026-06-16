package assignment2_methods;

public class Asg {
    //26,28
    public static void student(String name,int roll,
                        char div ,String address,boolean result)
    {
        System.out.println("name is "+name);
        System.out.println("name is "+roll);
        System.out.println("name is "+div);
        System.out.println("name is "+result);

    }
    public static void arithmatic()

    {//39
        int a=7;
        int b= 6;
        System.out.println("addition is "+a+b);
        System.out.println("substraction "+ (a-b));
        System.out.println("division is "+ a/b);
        System.out.println("multiplication "+ a*b);
        System.out.println("modulo is "+ a%b);

    }

    public static void main(String[] args) {
        MethodsAssignment methodsAssignment= new MethodsAssignment();
        methodsAssignment.rollno();
        student("isha",44,'A',"Pune",true);
    }
}
