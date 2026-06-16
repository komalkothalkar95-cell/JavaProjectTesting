package interfaceStudy;

public interface Mother
{
    void nature();
    void look();
    default void love()
    {
        System.out.println("Mother love method");
    }
    static void kindness()
    {
        System.out.println("Mothers kindness static method");
    }

    }

