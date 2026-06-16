package returnType;

public class Test {
    public static void main(String[] args) {
       // System.out.println(addition()); //normal addition is only displaying
//Object t = addition();
      //  System.out.println(addition1());
        int result = addition1();
        System.out.println(info().toLowerCase());


    }
    public static void addition()
    { //void ---nothing
        int sum = 1 + 2;
        System.out.println(sum);
    }
    public static int addition1()
    {
        int sum = 1 + 2;
       // System.out.println(sum);
        return sum;
    }
    public static String info()
    {
        String t="my test";
        return t;
    }

}
