import java.util.ArrayList;
import java.util.List;

public class Kegiatan2 {
    public static void main(String[] args) {
        ArrayList<String> ObjekHewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();
        ObjekHewan.add("sapi");
        ObjekHewan.add("kelinci");
        ObjekHewan.add("kambing");
        ObjekHewan.add("unta");
        ObjekHewan.add("domba");

        System.out.println("sebelum dihapus" + ObjekHewan);


        DeleteHewan.add("kelinci");
        DeleteHewan.add("kambing");
        DeleteHewan.add("unta");

        System.out.println("Hewan yang dihapus" + DeleteHewan);
        ObjekHewan.removeAll(DeleteHewan);
        System.out.println("ouput :" +ObjekHewan);
    }

}


