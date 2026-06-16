package interfaceStudy;

public class Myclass implements Interface{
    @Override
    public void sample2() {
System.out.println("interface method completed in implementation class");
    }

    @Override
    public void sample3() {

    }

    public static void main(String[] args) {
        Myclass myclass= new Myclass();
       myclass.sample2();
       myclass.sample3();
       myclass.sample1();
    }
}
