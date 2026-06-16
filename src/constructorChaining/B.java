package constructorChaining;

public class B extends A{
    public static void main(String[] args)
        {
B b = new B(23);

        }
    public B()
    {
        System.out.println("Class A without parameter constructor ");
    }
    public   B(int x)
    { super();
        System.out.println("Class B with int parameter constructor ");
        System.out.println(x);
    }
    public B( String name,int a)
    {this(23);
        System.out.println("Class A with  string and int parameter constructor ");
        System.out.println(name+ "  " +a);
    }
    }




