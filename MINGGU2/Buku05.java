class Buku05{
 String judul, pengarang;
 int halaman, stok, harga;  

 void tampilInformasi(){
    System.out.println("Judul: " + judul);
    System.out.println("Pengarang: " + pengarang);
    System.out.println("Jumlah halaman: " + halaman);
    if (stok==0) System.out.println("stok habis");
    else System.out.println("Sisa stok : " + stok);
    System.out.println("Harga: Rp " + harga);
 }
 void terjual(int jml){
   if (stok>=jml){
      stok -= jml;
   } else {
      System.out.println("Stok habis");
   }
 }
 void restok(int jml){
    stok += jml;
 }
 void gantiHarga(int hrg){
    harga = hrg;
 }
 public Buku05() {

 }
 public Buku05(String jud, String pg, int hal, int stok, int har){
   judul = jud;
   pengarang = pg;
   halaman = hal;
   this.stok = stok;
   harga = har;
 }
}