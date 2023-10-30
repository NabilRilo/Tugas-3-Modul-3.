# Tugas-3-Modul-3.
# SlipGaji

**SlipGaji** adalah sebuah kelas Java yang digunakan untuk menghitung slip gaji karyawan berdasarkan gaji pokok, tunjangan, dan potongan yang diinputkan.

## Penggunaan

1. **Membuat Objek SlipGaji**
    - Untuk membuat objek `SlipGaji`, Anda perlu memasukkan nama karyawan sebagai parameter konstruktor.
    - Contoh:
      ```java
      SlipGaji slipKaryawan1 = new SlipGaji("Nama Karyawan");
      ```

2. **Memasukkan Data Gaji Karyawan**
    - Gunakan metode `inputGaji` untuk memasukkan data gaji karyawan, termasuk gaji pokok, tunjangan, dan potongan.
    - Contoh:
      ```java
      slipKaryawan1.inputGaji(5000000, 1000000, 500000);
      ```

3. **Menghitung Total Gaji Karyawan**
    - Untuk menghitung total gaji karyawan berdasarkan data yang telah dimasukkan, gunakan metode `hitungTotalGaji`.
    - Contoh:
      ```java
      int totalGaji = slipKaryawan1.hitungTotalGaji();
      ```

4. **Menampilkan Slip Gaji**
    - Gunakan metode `tampilkanSlipGaji` untuk menampilkan slip gaji karyawan, termasuk detail gaji pokok, tunjangan, potongan, dan total gaji.
    - Contoh:
      ```java
      slipKaryawan1.tampilkanSlipGaji();
      ```

## Contoh Penggunaan

Berikut adalah contoh penggunaan kelas `SlipGaji`:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = scanner.nextLine();

        SlipGaji slipKaryawan1 = new SlipGaji(namaKaryawan);

        System.out.print("Masukkan gaji pokok: Rp. ");
        int gajiPokok = scanner.nextInt();

        System.out.print("Masukkan tunjangan: Rp. ");
        int tunjangan = scanner.nextInt();

        System.out.print("Masukkan potongan: Rp. ");
        int potongan = scanner.nextInt();

        slipKaryawan1.inputGaji(gajiPokok, tunjangan, potongan);
        slipKaryawan1.hitungTotalGaji();
        slipKaryawan1.tampilkanSlipGaji();
    }
}
