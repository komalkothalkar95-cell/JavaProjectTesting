package abstractStudy;

public abstract class Y extends X{

    @Override
    public void add()
    { int x=4;int y=8;
        System.out.println(x+y);

    }
    public Y(int a)
    {
        System.out.println("X  user defined constructor");
    }

    @Override
    public void display() {
        System.out.println("abstract method from X class is implemented here");
    }
     void test()
    {
        System.out.println("test method of class Y");
    }
    public abstract void mul();
}
