/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Beraksi {
    public static void main(String[] args) {
        // Inisialisasi daftar barang di toko komputer (Array)
        Barang[] daftarBarang = new Barang[5];
        daftarBarang[0] = new Barang("Keyboard", 350000);
        daftarBarang[1] = new Barang("Mouse", 70000);
        daftarBarang[2] = new Barang("Mousepad", 35000);
        daftarBarang[3] = new Barang("Monitor", 900000);
        daftarBarang[4] = new Komputer("Laptop", 7600000, "ASUS");

        // Membuat objek TokoKomputer (Object)
        TokoKomputer toko = new TokoKomputer(daftarBarang);
        // Menggunakan seleksi dan perulangan untuk mencari barang
        Scanner scanner = new Scanner(System.in);
        boolean isLanjut = true;
        
        while (isLanjut) {
           // Menampilkan daftar barang (IO Sederhana)
        toko.tampilkanDaftarBarang();

        
        System.out.print("Masukkan nama barang yang dicari: ");
        try {
            String input = scanner.nextLine();

            // Validasi apakah input adalah angka
            if (isNumeric(input)) {
                throw new InputMismatchException("Input tidak valid. Pastikan Anda memasukkan nama barang dengan benar.");
            }

            // Pencarian barang berdasarkan nama
            Barang barangDitemukan = toko.cariBarang(input);
            if (barangDitemukan != null) {
                System.out.println("Barang ditemukan: " + barangDitemukan.getNama());
                if (barangDitemukan instanceof Komputer) { // Polymorphism
                    Komputer komputer = (Komputer) barangDitemukan;
                    System.out.println("Merk: " + komputer.getMerk());
                }
            } else {
                System.out.println("Barang tidak ditemukan.");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        // Menanyakan apakah pengguna ingin melanjutkan mencari barang atau tidak
            System.out.print("Cari barang lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            isLanjut = jawaban.equalsIgnoreCase("y");
        } 
        }
        

    // Method untuk memeriksa apakah sebuah string adalah angka
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  
        }
    }
