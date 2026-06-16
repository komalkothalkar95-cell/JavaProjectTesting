import java.util.HashSet;

public class WeekendMock
{
    public static void main(String[] args) {
        int a[] = {1,2,2,3,3};
        HashSet<Integer> hashSet= new HashSet<>();
        for ( int y:a)
        {
            hashSet.add(y);
        }
        System.out.println(hashSet);
        for(int x:hashSet)
        {
            System.out.println(x);
        }
        String name[] = {"komal","madhuri","sarika","sarika","komal"};
        HashSet<String> hashSet1= new HashSet<>();
        for ( String p :name)
        {
            hashSet1.add(p);
        }
        System.out.println(hashSet1);
        for(String l:hashSet1)
        {
            System.out.println(l);
        }

    }
}
