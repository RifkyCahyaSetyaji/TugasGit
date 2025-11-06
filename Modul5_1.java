package PraktikumMethod;

import java.util.Scanner;

public class Modul5_1 {

// Nama: Rifky Cahya Setyaji
// NIM: 255150401111002
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean kondisi = true;
        int n = 0;
        int r = 0;

        while (kondisi == true) {
            System.out.println();
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai n: ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai r: ");
                    r = sc.nextInt();
                    int fnp = Faktorialn(n);
                    int fnrp = Faktorialnr(n, r);
                    int hasilp = fnp / fnrp;
                    System.out.println("Maka Hasil Permutasinya adalah: " + hasilp);
                    break;
                case 2:
                    System.out.print("Masukkan nilai n: ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai r: ");
                    r = sc.nextInt();
                    int fnk = Faktorialn(n);
                    int frk = Faktorialn(r);
                    int fnrk = Faktorialnr(n, r);
                    int hasilk = fnk / (fnrk * frk);
                    System.out.println("Maka Hasil Kombinasinya adalah: " + hasilk);
                    break;
                case 3:
                    kondisi = false;
                    break;
                default:
                    System.out.println("Inputan Tidak Ada");
                    break;
            }
        }
    }

    static int Faktorialn(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Faktorialn(n - 1);
        }
    }
    public static void b(String[] a){

    } 
    static int Faktorialnr(int n, int r) {
        int nr = n - r;
        if (nr == 1) {
            return 1;
        } else {
            return nr * Faktorialn(nr - 1);
        }
    }
}
