import java.util.Scanner;

/**
 * Class untuk menghitung slip gaji karyawan berdasarkan gaji pokok, tunjangan, dan potongan yang diinputkan.
 */
public class SlipGaji {

    private String namaKaryawan;
    private int gajiPokok;
    private int tunjangan;
    private int potongan;
    private int totalGaji;

    /**
     * Konstruktor untuk membuat objek SlipGaji.
     *
     * @param namaKaryawan Nama karyawan.
     */
    public SlipGaji(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    /**
     * Memasukkan data gaji karyawan.
     *
     * @param gajiPokok Gaji pokok karyawan.
     * @param tunjangan Tunjangan karyawan.
     * @param potongan Potongan gaji karyawan.
     */
    public void inputGaji(int gajiPokok, int tunjangan, int potongan) {
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
    }

    /**
     * Menghitung total gaji karyawan berdasarkan gaji pokok, tunjangan, dan potongan.
     *
     * @return Total gaji karyawan.
     */
    public int hitungTotalGaji() {
        totalGaji = gajiPokok + tunjangan - potongan;
        return totalGaji;
    }

    /**
     * Mendapatkan nama karyawan.
     *
     * @return Nama karyawan.
     */
    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    /**
     * Mendapatkan gaji pokok karyawan.
     *
     * @return Gaji pokok karyawan.
     */
    public int getGajiPokok() {
        return gajiPokok;
    }

    /**
     * Mendapatkan tunjangan karyawan.
     *
     * @return Tunjangan karyawan.
     */
    public int getTunjangan() {
        return tunjangan;
    }

    /**
     * Mendapatkan potongan gaji karyawan.
     *
     * @return Potongan gaji karyawan.
     */
    public int getPotongan() {
        return potongan;
    }

    /**
     * Mendapatkan total gaji karyawan.
     *
     * @return Total gaji karyawan.
     */
    public int getTotalGaji() {
        return totalGaji;
    }

    /**
     * Menampilkan slip gaji karyawan.
     */
    public void tampilkanSlipGaji() {
        System.out.println("===== SLIP GAJI " + namaKaryawan + " =====");
        System.out.println("Gaji Pokok  : Rp. " + gajiPokok);
        System.out.println("Tunjangan   : Rp. " + tunjangan);
        System.out.println("Potongan    : Rp. " + potongan);
        System.out.println("Total Gaji  : Rp. " + totalGaji);
        System.out.println("===============================");
    }

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
