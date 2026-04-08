public class Buku11 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
 
    public Buku11() {}
 
    public Buku11(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
 
    public void tampilInformasi() {
        System.out.println("Kode Buku    : " + kodeBuku);
        System.out.println("Judul        : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}

