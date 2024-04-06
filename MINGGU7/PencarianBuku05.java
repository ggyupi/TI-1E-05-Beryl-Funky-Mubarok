package MINGGU7;
/**
 * PencarianBuku05
 */
public class PencarianBuku05 {

    Buku05 listBk[] = new Buku05[5];
    int idx;
    void tambah(Buku05 m){
        if(idx<listBk.length){
            listBk[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for(Buku05 m : listBk){
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(String cari){
        int posisi=-1;
        for(int j=0; j<listBk.length;j++){
            if(cari.equals(listBk[j].kodeBuku)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void tampilPosisi(String x, int pos){
        if(pos!=-1){
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    public void tampilData(String x, int pos){
        if (pos!=-1){
            System.out.println("Kode Buku\t : "+x);
            System.out.println("Judul\t\t : "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : "+listBk[pos].pengarang);
            System.out.println("Stock\t\t : "+listBk[pos].stock);
        } else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public Buku05 FindBuku(String kodeBuku) {
        int posisi = FindSeqSearch(kodeBuku);
        if(posisi != -1){
            return listBk[posisi];
        } else{
            return new Buku05(null, null, 0, null, 0);
        }
    }
    public int FindBinarySearch(String cari, int left, int rigth){
        int mid;
        if(rigth>=left){
            mid=(rigth+left)/2;
            if(cari.equals(listBk[mid].kodeBuku)){
                return (mid);
            }else if(Integer.parseInt(listBk[mid].kodeBuku)>Integer.parseInt(cari)){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1, rigth);
            }
        }
        return -1;
    }
}