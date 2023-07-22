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
class Barang {
    // Atribut
    private String nama;
    private int harga;

    // Constructor
    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Accessor (getter) untuk mendapatkan nilai atribut nama
    public String getNama() {
        return nama;
    }

    // Mutator (setter) untuk mengubah nilai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Accessor (getter) untuk mendapatkan nilai atribut harga
    public int getHarga() {
        return harga;
    }

    // Mutator (setter) untuk mengubah nilai atribut harga
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Override method toString() untuk mencetak informasi barang
    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + harga;
    }
}
