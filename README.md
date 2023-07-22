# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `MahasiswaDetail`, dan `MahasiswaBeraksi` adalah contoh dari class.

```bash
public class Barang {
...
}

public class Komputer extends Barang {
...
}

public class TokoKomputer {
...
}

public class Beraksi {
...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Barang[] daftarBarang = new Barang[5];`, `TokoKomputer toko = new TokoKomputer(daftarBarang);` dan `Scanner scanner = new Scanner(System.in);` adalah contoh pembuatan object.

```bash
Barang[] daftarBarang = new Barang[5];
TokoKomputer toko = new TokoKomputer(daftarBarang);
Scanner scanner = new Scanner(System.in);
```

3. **Atribut** adalah variabel yang ada dalam class. Untuk Contohnya, Pada Class `Barang` terdapat atribut `nama` dan `harga`, Di Class `Komputer` terdapat atribut `merk` dan Pada Class `TokoKomputer` terdapat atribut `daftarBarang` semua ini adalah contoh dari atribut.

```bash
private String nama;
private int harga;
private String merk;
private Barang[] daftarBarang;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Barang`, `Komputer` dan `TokoKomputer`.

```bash
public Barang(String nama, int harga) {
this.nama = nama;
this.harga = harga;
}

public Komputer(String nama, int harga, String merk) {
super(nama, harga);
this.merk = merk;
}
public TokoKomputer(Barang[] daftarBarang) {
this.daftarBarang = daftarBarang;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setHarga` dan `setMerk` adalah contoh method mutator.

```bash
public void setNama(String nama) {
this.nama = nama;
}

public void setHarga(int harga) {
this.harga = harga;
}
public void setMerk(String merk) {
this.merk = merk;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga` dan `getMerk` adalah contoh method accessor.

```bash
public String getNama() {
return nama;
}

public int getHarga() {
return harga;
}

public String getMerk() {
return merk;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `harga`, `merk` dan `daftarBarang` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int harga;
private String merk;
private Barang[] daftarBarang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Komputer` mewarisi `Barang` dengan sintaks `extends`.

```bash
public class Komputer extends Barang {
...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Namun, didalam java ada dua bentuk utama dari polymorphism yaitu `Compile-time Polymorphism` dan `Runtime Polymorphism`, Nah untuk Kode ini itu memakai `Runtime Polymorphism`. Pada kode ini, `barangDitemukan` memiliki tipe referensi `Barang`, objek tersebut merupakan instance dari `Komputer`. Setelah casting maka dapat mengakses method `getMerk()` yang hanya ada di kelas `Komputer`.

```bash
Barang barangDitemukan = toko.cariBarang(namaBarang);
if (barangDitemukan != null) {
System.out.println("Barang ditemukan: " + barangDitemukan.getNama());
if (barangDitemukan instanceof Komputer) {
Komputer komputer = (Komputer) barangDitemukan;
System.out.println("Merk : " + komputer.getMerk());
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `main`. Lebih tepatnya, Seleksi if-else digunakan untuk mengecek hasil dari pencarian barang pada method `cariBarang` di class`TokoKomputer`.

```bash
Barang barangDitemukan = toko.cariBarang(namaBarang);
if (barangDitemukan != null) {
System.out.println("Barang ditemukan: " + barangDitemukan.getNama());
if (barangDitemukan instanceof Komputer) {
Komputer komputer = (Komputer) barangDitemukan;
System.out.println("Merk : " + komputer.getMerk());
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, setelah menampilkan daftar barang, pengguna akan diminta apakah ingin mencari barang lagi atau tidak. Jika pengguna menginputkan "y" (yes), maka perulangan akan berlanjut dan program akan menanyakan kembali nama barang yang dicari. Jika pengguna menginputkan "n" (no), maka perulangan berhenti dan program selesai.
```bash
isLanjut = jawaban.equalsIgnoreCase("y");
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
toko.tampilkanDaftarBarang();
Scanner scanner = new Scanner(System.in);
System.out.print("Masukan nama Barang yang dicari: ");
String namaBarang = scanner.nextLine();

System.out.println("Barang ditemukan: " + barangDitemukan.getNama());
System.out.println("Merk : " + komputer.getMerk());
System.out.println("Barang Tidak Ditemukan...!");
System.out.println("Input Tidak Valid...!");
System.out.println("Terjadi Kesalahan YA ges Ya: " + e.getMessage());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Barang[] daftarBarang = new Barang[5];` adalah contoh penggunaan array.

```bash
Barang[] daftarBarang = new Barang[5];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, menggunakan validasi angka sebelum melakukan pencarian barang. Untuk melakukan itu, kita bisa menggunakan `try-catch` terpisah untuk mencegah input angka yang tidak valid.

```bash
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
```

## Usulan nilai

| No | Materi | Nilai |
| :-: | -------------- | :-----: |
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Atribut | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | IO Sederhana | 10 |
| 13 | Array | 15 |
| 14 | Error Handling | 15 |
| | **TOTAL** | **100** |

## Pembuat

Nama: M. Raflian Noor
NPM: 21110010664
