public class Peminjaman11{
        Mahasiswa11 mahasiswa;
        Buku11 buku;
        int lamaPinjam;
        int keterlambatan;
        int totalDenda;

        static final int BATAS_PINJAM = 5;
        static final int DENDA_PERHARI = 2000;

        public Peminjaman11() {
        }
        public Peminjaman11 (Mahasiswa11 mahasiswa, Buku11 buku, int lamaPinjam) {
            this.mahasiswa = mahasiswa;
            this.buku = buku;
            this.lamaPinjam = lamaPinjam;
            hitungDenda();
        } 
        public void hitungDenda () {
            if (lamaPinjam > BATAS_PINJAM){
                keterlambatan = lamaPinjam - BATAS_PINJAM;
                totalDenda = keterlambatan * DENDA_PERHARI;
            } else {
                keterlambatan = 0;
                totalDenda = 0;
            }
        }
        public void tampilInformasi() {
        System.out.println("NIM          : " + mahasiswa.nim);
        System.out.println("Nama         : " + mahasiswa.nama);
        System.out.println("Judul Buku   : " + buku.judul);
        System.out.println("Lama Pinjam  : " + lamaPinjam + " hari");
        System.out.println("Terlambat    : " + keterlambatan + " hari");
        System.out.println("Total Denda  : Rp " + totalDenda);
    }
    }
