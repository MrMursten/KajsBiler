import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Blåbær on 05-Nov-15.
 */
public class Storage {

    private static ArrayList<Prisgruppe> prisgrupper = new ArrayList<>();
    private static ArrayList<Bil> biler = new ArrayList<>();
    private static ArrayList<Udlejning> udlejninger = new ArrayList<>();

    public static void addPrisgruppe(Prisgruppe prisgruppe)
    {
        prisgrupper.add(prisgruppe);
    }

    public static void addBil(Bil bil)
    {
        biler.add(bil);
    }

    public static void addUdlejning(Udlejning udlejning)
    {
        udlejninger.add(udlejning);
    }

    public static ArrayList<Prisgruppe> getPrisgrupper()
    {
        return new ArrayList<Prisgruppe>(prisgrupper);
    }

    public static ArrayList<Bil> getBiler()
    {
        return new ArrayList<Bil>(biler);
    }

    public static ArrayList<Udlejning> getUdlejninger()
    {
        return new ArrayList<Udlejning>(udlejninger);
    }
}
