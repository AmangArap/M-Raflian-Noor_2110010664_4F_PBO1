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
class Komputer extends Barang {
    // Atribut
    private String merk;
    
    // Constructor
    public Komputer(String nama, int harga, String merk) {
        super(nama, harga);
        this.merk = merk;
    }
    
    // Accessor untuk mendapatkan nilai atribut merk
    public String getMerk() {
        return merk;
    }
    
     // Mutator untuk mengubah nilai atribut merk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
}
