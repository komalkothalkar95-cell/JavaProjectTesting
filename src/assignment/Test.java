package assignment;

public class Test {

    void show(Integer a) {
        System.out.print("Integer ");
    }

    void show(Object a) {
        System.out.print("Object ");
    }

    public static void main(String[] args) {
        new Test().show(10);
    }


}
