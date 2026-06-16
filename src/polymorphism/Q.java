package polymorphism;

public class Q extends P{
    public static void main(String[] args) {
        Q q= new Q();
        P p =new P();
        q.addition();
        q.addition(23);
        p.addition(45);
        q.addition("koka");
    }
    public static void addition(char q)//static methods are not override
    {
        System.out.println("the char is"+q);
    }
    public void addition()
    {
        int a=20;int b=50;

        System.out.println("Addition is "+a+b);

    }
    public void addition(float x)
    { float Add = 2.2f+x;
        System.out.println("Add of float is "+Add);
    }
    public void addition(int y)
    {
        int add = y+340;
        System.out.println("sum of float is "+add);
    }

}// acquiring super class method in subclass with extend keyword and changing the
 //implementation/ definition according to subclass specification is called method overriding.