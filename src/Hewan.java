import java.util.ArrayList;

public class Hewan {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Nama Hewan Yang DiTambahakan : ");
        System.out.println(Hewan);

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        ArrayList<String> DeletedData = new ArrayList<>();

        for (String jenis : DeleteHewan) {
            Hewan.removeIf(h -> h.equals(jenis));
            DeletedData.add(jenis);
        }

        System.out.println("\nHewan yang dihapus : ");
        System.out.println(DeletedData);
        System.out.println("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(Hewan);
}
}
