package polymorphism;

public class P {
    public static void main(String[] args) {
        P p= new P();
        p.addition("komal");
        p.addition();
        p.addition(23);
    }
    public void addition()
    {
        int a=2;int b=5;
        int sum=a+b;
        System.out.println("Addition is "+sum);

    }
    public void addition(String x)
    {
        System.out.println(x);
    }

    public void addition(int y)
    {
        int add = y+34;
        System.out.println("add of float is "+add);
    }
}
// declaring multiple methods wit same method name but different parameres/arguments in same class
// called method overloading.