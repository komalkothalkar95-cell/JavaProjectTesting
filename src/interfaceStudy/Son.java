package interfaceStudy;

public class Son implements Father,Mother
{
    void height() {
        System.out.println("height method");
    }
 public void love()
 { Father.super.love();
     Mother.super.love();
 }
    @Override
    public void hardwork() {
        System.out.println("Fathers hardwork method");
    }

    @Override
    public void honesty() {
        System.out.println("Fathers honesty method");
    }

    @Override
    public void nature() {
        System.out.println("Mothers nature method");
    }

    @Override
    public void look() {
        System.out.println("Fathers hardwork method");
    }
 
    public static void main(String[] args)
    {
        Son son =new Son();
        son.hardwork();
        son.nature();
        son.love();
        son.nature();
        son.honesty();
        Mother.kindness();;
        Father.kindness();
    }
}
