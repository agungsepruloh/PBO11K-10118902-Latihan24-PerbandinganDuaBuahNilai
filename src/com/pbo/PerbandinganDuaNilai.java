package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * Kelas : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini akan menampilkan hasil dari perbandingan dua buah nilai
 *
 */

public class PerbandinganDuaNilai {

    public static void perbandingan() {
        System.out.print("\nMasukkan Nilai Pertama\t: ");
        Scanner scanner = new Scanner(System.in);
        float nilaiPertama = scanner.nextInt();
        System.out.print("Masukkan Nilai Kedua\t: ");
        float nilaiKedua = scanner.nextInt();

        checkValue(nilaiPertama, nilaiKedua);
    }

    public static void checkValue(float pertama, float kedua) {
        String hasil;
        if (pertama > kedua) {
            hasil = "lebih besar dari";
        } else if (kedua > pertama){
            hasil = "lebih kecil dari";
        } else {
            hasil = "sama dengan";
        }
        System.out.println(String.format("\nHasil: %.0f %s %.0f", pertama, hasil, kedua));
    }

    public static void main(String[] args) {
        System.out.println("===== Perbandingan Dua Buah Nilai =====");
        String ulangi = "YA";

        while(!ulangi.equals("TIDAK")) {
            perbandingan();
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nUlangi Aktifitas? (Ya/Tidak)\t: ");
            ulangi = scanner.next().toUpperCase();
        }
    }
}
