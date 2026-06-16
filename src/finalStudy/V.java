package finalStudy;

public class V  extends U

{
    public static void main(String[] args) {
        V v=new V();
        v.main(12);
        main("pune");
    }

    public void test1(String name)
    {
        System.out.println("test1 method");
    }
    public static void test1(int a)
    {
        System.out.println("test2 method with parameter");
     //static method can not be overridden
    }
    public void main(int a)
    {
        System.out.println("main method with int parameter");
    }
    public static void main(String city)
    {
        System.out.println("main method with string parameter");
    }
}
