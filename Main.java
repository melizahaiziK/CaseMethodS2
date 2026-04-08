import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Sistem11 sistem = new Sistem11(5, 5, 5);

        Mahasiswa11 mhs1 = new Mahasiswa11("22001", "Andi", "Teknik Informatika");
        Mahasiswa11 mhs2 = new Mahasiswa11("22002", "Budi", "Teknik Informatika");
        Mahasiswa11 mhs3 = new Mahasiswa11("22003", "Citra", "Sistem Informasi Bisnis");

        Buku11 b1 = new Buku11("B001", "Algoritma", 2020);
        Buku11 b2 = new Buku11("B002", "Basis Data", 2019);
        Buku11 b3 = new Buku11("B003", "Pemrograman", 2021);
        Buku11 b4 = new Buku11("B004", "Fisika", 2024);

        sistem.tambahMahasiswa(mhs1);
        sistem.tambahMahasiswa(mhs2);
        sistem.tambahMahasiswa(mhs3);

        sistem.tambahBuku(b1);
        sistem.tambahBuku(b2);
        sistem.tambahBuku(b3);
        sistem.tambahBuku(b4);

        sistem.tambahPeminjaman(new Peminjaman11(mhs1, b1, 7));
        sistem.tambahPeminjaman(new Peminjaman11(mhs2, b2, 3));
        sistem.tambahPeminjaman(new Peminjaman11(mhs3, b3, 10));
        sistem.tambahPeminjaman(new Peminjaman11(mhs3, b4, 6));
        sistem.tambahPeminjaman(new Peminjaman11(mhs1, b2, 4));

        int pilihan = 0;
        do {
            System.out.println("=== SISTEM PEMINJAMAN BUKU RUANG BACA JTI ===");
            System.out.println("1. Tampil Data Mahasiswa");
            System.out.println("2. Tampil Data Buku");
            System.out.println("3. Tampil Data Peminjaman");
            System.out.println("4. Urutkan Data Peminjam (denda)");
            System.out.println("5. Cari Data Peminjaman Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt(); 

            switch (pilihan){
                case 1: 
                    sistem.tampilSemuaMhs();
                    break;
                case 2:
                    sistem.tampilSemuaBuku();
                    break;
                case 3: 
                    sistem.tampilSemuaPeminjaman();
                    break;
                case 4: 
                    sistem.tampilPeminjamanTerurut();
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    sistem.binarySearchByNIM(nim);
                    break;
                case 0:
                    System.out.println("Terimakasih. Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan !=0);
    }
}
