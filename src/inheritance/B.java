package inheritance;
public class B extends A
{
    void testSample()
    {
    }
    void test1()
    {
        System.out.println("test1 method of class B");
    }
    void test4(){

        System.out.println("test4 method of class A");
    }
   // static void test5(int x)
  //  {
  ////      System.out.println("test5 method of class B");
  //  }
  void test3()
  {
      System.out.println("test3 method of class A");
  }
public static class C extends B
{
    void test6()
    {
        System.out.println("test6 method of class C");
    }


    public static void main(String[] args) {
        C c = new C();
        c.test1();
        c.test4();
        c.test2();
        //super.test3(45);
     
        A a = new A();
        a.test1();

    }

}
}

