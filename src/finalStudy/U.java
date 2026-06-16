package finalStudy;

public class U {
    public static void main(String[] args) {
        final int a = 12;
        // a=a+40;// cannot be reinitialize
        int sum = a + 10;
        System.out.println(a);
        U.main("hyd");
    }

    final public void test1() {
        System.out.println("test1 method");
    }

    public static void test1(int a) {
        System.out.println("test2 method with parameter");
    }

    // static ,non-static method can be overloaded
    public void main(int a) {
        System.out.println("main method with int parameter");
    }

    public static void main(String city) {
        System.out.println("main method with string parameter");
    }
}
