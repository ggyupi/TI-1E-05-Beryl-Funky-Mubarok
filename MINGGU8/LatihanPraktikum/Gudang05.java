package MINGGU8.LatihanPraktikum;
/**
 * Gudang05
 */
public class Gudang05 {

    Barang05[] tumpukan;
    int size;
    int top;

    public Gudang05(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang05[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean cekPenuh() {
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void tambahBarang(Barang05 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang05 ambilBarang() {
        if (!cekKosong()) {
            Barang05 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang05 lihatBarangTeratas() {
        if (!isEmpty()) {
            Barang05 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public Barang05 lihatBarangTerbawah() {
        if (!cekKosong()) {
            System.out.println("Barang terbawah: " + tumpukan[0].nama);
            return tumpukan[0];
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }  
    public Barang05 cariBarang(String keyword) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == Integer.parseInt(keyword) || tumpukan[i].nama.equalsIgnoreCase(keyword)) {
                    return tumpukan[i];
                }
            }
            System.out.println("Barang dengan kode atau nama '" + keyword + "' tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
}