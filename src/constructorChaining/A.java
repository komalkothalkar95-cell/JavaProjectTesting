package constructorChaining;

public class A {

    public A()
    {this("komal",22);
  System.out.println("Class A without parameter constructor ");
    }
    public   A(int x)
    {
        System.out.println("Class A with int parameter constructor ");
        System.out.println(x);
    }
    public A( String name,int a)
    {this(23);
        System.out.println("Class A with  string and int parameter constructor ");
        System.out.println(name+ "  " +a);
    }
    }






