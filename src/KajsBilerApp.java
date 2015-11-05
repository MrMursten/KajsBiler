/**
 * Created by Blåbær on 05-Nov-15.
 */
public class KajsBilerApp {

    public static void main(String[] args)
    {
        Service.createPrisgruppe('A',2000,true,200);
        Service.createPrisgruppe('B',1500,false,150);
        System.out.println(Storage.getPrisgrupper());
    }
}
