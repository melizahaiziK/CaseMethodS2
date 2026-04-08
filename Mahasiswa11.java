public class Mahasiswa11 {
    String nim;
    String nama;
    String prodi;
 
    public Mahasiswa11() {}
 
    public Mahasiswa11(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
 
    public void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}