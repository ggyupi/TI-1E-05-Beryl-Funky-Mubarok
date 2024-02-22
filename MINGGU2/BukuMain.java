public class BukuMain {
    public static void main(String[] args) {
        Buku05 bk1 = new Buku05();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku05 bk2 = new Buku05("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku05 Beryl_Funky_Mubarok = new Buku05("I Wanna Be A Better Person", "Beryl Funky Mubarok", 50, 5, 50000);
        Beryl_Funky_Mubarok.tampilInformasi();
        Beryl_Funky_Mubarok.terjual(6);
    }
}
