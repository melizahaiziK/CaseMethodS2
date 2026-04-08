public class Sistem11 {
    Mahasiswa11[] listMahasiswa;
    Buku11[] listBuku;
    Peminjaman11[] listPeminjaman;
    int idxMhs = 0;
    int idxBuku = 0;
    int idxPinjam = 0;

    public Sistem11 (int maxMhs, int MaxBuku, int maxPinjam){
        listMahasiswa = new Mahasiswa11[maxPinjam];
        listBuku = new Buku11[MaxBuku];
        listPeminjaman = new Peminjaman11[maxPinjam];
    }
    public void tambahMahasiswa (Mahasiswa11 m){
        if (idxMhs < listMahasiswa.length){
            listMahasiswa[idxMhs++] = m;
        } else {
            System.out.println("Data mahasiswa sudah penuh");
        }
    }
    public void tambahBuku (Buku11 b) {
        if (idxBuku < listBuku.length){
            listBuku[idxBuku++] = b;
        } else {
            System.out.println("Data buku sudah penuh");
        }
    }
    public void tambahPeminjaman(Peminjaman11 p) {
        if (idxPinjam < listPeminjaman.length) {
            listPeminjaman[idxPinjam++] = p;
        } else {
            System.out.println("Data peminjaman sudah penuh.");
        }
    }
    public void tampilSemuaMhs(){
        System.out.println("================================");
        System.out.println("         DATA MAHASISWA");
        System.out.println("================================");
        for (int i = 0; i < idxMhs; i++) {
        System.out.println("-- Mahasiswa " + (i+1) + " --");
        listMahasiswa[i].tampilInformasi();
        System.out.println();
        }
    }
    public void tampilSemuaBuku(){
        System.out.println("===============================");
        System.out.println("         DATA BUKU");
        System.out.println("===============================");
        for (int i = 0; i < idxBuku; i++){
        System.out.println("-- Buku " + (i+1) + " --");
        listBuku[i].tampilInformasi();
        System.out.println();
        }
    }
    public void tampilSemuaPeminjaman() {
        System.out.println("========================================");
        System.out.println("          DATA PEMINJAMAN");
        System.out.println("========================================");
        for (int i = 0; i < idxPinjam; i++) {
            System.out.println("-- Peminjaman " + (i + 1) + " --");
            listPeminjaman[i].tampilInformasi();
            System.out.println();
        }
    }
    public void insertionSortByDenda(){
        for (int i=0; i < idxPinjam; i++){
            Peminjaman11 temp = listPeminjaman[i];
            int j = i - 1;
            while (j>= 0 && listPeminjaman[j].totalDenda < temp.totalDenda){
                listPeminjaman[j + 1] = listPeminjaman[j];
                j--;
            }
                listPeminjaman[j + 1] = temp;
        }
    }
    public void tampilPeminjamanTerurut() {
        insertionSortByDenda();
        System.out.println("========================================");
        System.out.println("  DATA PEMINJAMAN (DENDA TERBESAR)");
        System.out.println("========================================");
        for (int i = 0; i < idxPinjam; i++) {
            System.out.println("-- Urutan " + (i + 1) + " --");
            listPeminjaman[i].tampilInformasi();
            System.out.println();
        }
    }
    private void sortByNIM() {
        for (int i = 1; i < idxPinjam; i++) {
            Peminjaman11 temp = listPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && listPeminjaman[j].mahasiswa.nim.compareTo(temp.mahasiswa.nim) > 0) {
                listPeminjaman[j + 1] = listPeminjaman[j];
                j--;
            }
            listPeminjaman[j + 1] = temp;
        }
    }
    public void binarySearchByNIM(String nim) {
        sortByNIM();
 
        int low = 0;
        int high = idxPinjam - 1;
        boolean ditemukan = false;
 
        System.out.println("========================================");
        System.out.println("     HASIL PENCARIAN NIM: " + nim);
        System.out.println("========================================");

        int posisi = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = listPeminjaman[mid].mahasiswa.nim.compareTo(nim);
            if (cmp == 0) {
                posisi = mid;
                high = mid - 1; // terus cari ke kiri untuk semua data dengan NIM yang sama
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
         if (posisi != -1) {
            for (int i = posisi; i < idxPinjam; i++) {
                if (listPeminjaman[i].mahasiswa.nim.equals(nim)) {
                    ditemukan = true;
                    listPeminjaman[i].tampilInformasi();
                    System.out.println();
                }
            }
        }
        if (!ditemukan){
            System.out.println("Data peminjam dengan NIM " + nim + "tidak ditemukan");
        }
    }

}