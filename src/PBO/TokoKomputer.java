/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

/**
 *
 * @author AmangArap
 */
class TokoKomputer {
    // Atribut
    private Barang[] daftarBarang;

    // Constructor
    public TokoKomputer(Barang[] daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    // Method untuk menampilkan daftar barang di toko komputer
    public void tampilkanDaftarBarang() {
        System.out.println("Daftar Barang di Toko Komputer:");
        for (Barang barang : daftarBarang) {
            System.out.println(barang.getNama() + " - Rp" + barang.getHarga());
        }
    }

    // Method untuk mencari barang berdasarkan nama
    public Barang cariBarang(String nama) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equalsIgnoreCase(nama)) {
                return barang;
            }
        }
        return null;
    }
}
