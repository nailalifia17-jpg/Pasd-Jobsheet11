public class Mahasiswa20 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa20() {
    }

    Mahasiswa20(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}