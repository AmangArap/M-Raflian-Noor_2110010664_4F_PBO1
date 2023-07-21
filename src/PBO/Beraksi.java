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
        daftarBarang[0] = new Barang("Keyboard", 450000);
        daftarBarang[1] = new Barang("Mouse", 50000);
        daftarBarang[2] = new Barang("MousePad", 30000);
        daftarBarang[3] = new Komputer("Laptop", 4550000, "AXIOO");
        daftarBarang[4] = new Komputer("LaptopGaming", 15500000, "ASUS");
        
        // Membuat objek TokoKomputer
        TokoKomputer toko = new TokoKomputer(daftarBarang);
        
        // IO Sederhana untuk Menampilkan daftar barang
        toko.tampilkanDaftarBarang();
        
        // Menggunakan seleksi dan perulangan untuk mencari barang
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama Barang yang dicari: ");
        try {
            String namaBarang = scanner.nextLine();
            
            // Error Handling
            Barang barangDitemukan = toko.cariBarang(namaBarang);
            if (barangDitemukan != null) {
                System.out.println("Barang ditemukan: " + barangDitemukan.getNama());
                // Polymorphism
                if (barangDitemukan instanceof Komputer) {
                    Komputer komputer = (Komputer) barangDitemukan;
                    System.out.println("Merk : " + komputer.getMerk());
                }
            }else{
                System.out.println("Barang Tidak Ditemukan...!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input Tidak Valid...!");
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan YA ges Ya: " + e.getMessage());
        }
                
    }
}
