import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by Blåbær on 05-Nov-15.
 */
public class Service {

    public static void createPrisgruppe(char bilType, double depositum, boolean skalVæreOver25, double dagspris, ArrayList<Bil> biler)
    {
        Prisgruppe prisgruppe = new Prisgruppe(bilType, depositum, skalVæreOver25, dagspris, biler);
        Storage.addPrisgruppe(prisgruppe);
    }

    public static void createPrisgruppe(char bilType, double depositum, boolean skalVæreOver25, double dagspris)
    {
        Prisgruppe prisgruppe = new Prisgruppe(bilType, depositum, skalVæreOver25, dagspris);
        Storage.addPrisgruppe(prisgruppe);
    }

    public static void createBil(Prisgruppe prisgruppe, String mærke, String model, String brændstof)
    {
        Bil bil = prisgruppe.opretBil(mærke, model, brændstof);
        Storage.addBil(bil);
    }

    public static void createUdlejning(LocalDateTime startDato, LocalDateTime slutDato, LocalDateTime udlDato, Bil bil)
    {
        Udlejning udlejning = new Udlejning(startDato, slutDato, udlDato, bil);
        Storage.addUdlejning(udlejning);
    }
}
