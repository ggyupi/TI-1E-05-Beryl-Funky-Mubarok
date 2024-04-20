package MINGGU8;
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

        if (top == size - 1) {
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
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang05 ambilBarang() {
        if (!cekKosong()) {
            Barang05 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang05 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang05 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang05 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang05 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " +
                    barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang05 cariBarang(int kode) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kode) {
                    Barang05 barangDicari = tumpukan[i];
                    return barangDicari;
                }
            }
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang digudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi05 stack = new StackKonversi05();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}