package abstractStudy;

public class Z extends Y{
    public Z(int a) {
        super(a);
    }

    @Override
    public void mul() {
        System.out.println("this is mul incomplete method from Y class");
    }

    public static void main(String[] args) {
        Z z= new Z(23);
        z.mul();
        z.add();
        z.display();

   // how to use constructor in abstract class

    }
}
