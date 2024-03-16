package MINGGU5.latihanPraktikum;
public class mainShowroom {
    public static void main(String[] args) {
        int[] top_acceleration = { 6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180 };
        int[] top_power = { 728, 575, 657, 609, 703, 553, 609, 631 };
        Showroom sr = new Showroom(top_acceleration, top_power);
        System.out.println("_______________________________________________________________________");
        System.out.println("| merk       | tipe            | tahun | top_acceleration | top_power |\n"+
                           "|____________|_________________|_______|__________________|___________|\n" +
                           "| BMW        | M2 Coupe        | 2016  | 6816             | 728       |\n" + 
                           "| Ford       | Fiesta ST       | 2014  | 3921             | 575       |\n" +
                           "| Nissan     | 370Z            | 2009  | 4360             | 657       |\n" +
                           "| Subaru     | BRZ             | 2014  | 4058             | 609       |\n" +
                           "| Subaru     | Impreza WRX STI | 2013  | 6255             | 703       |\n" +
                           "| Toyota     | AE86 Trueno     | 1986  | 3700             | 553       |\n" +
                           "| Toyota     | 86/GT86         | 2014  | 4180             | 609       |\n" +
                           "| Volkswagen | Golf GTI        | 2014  | 4180             | 631       |");
        System.out.println("_______________________________________________________________________");
        System.out.println();
        System.out.println("Hasil mencari top_acceleration tertinggi menggunakan Divide Conquer : " + sr.akselerasiTertinggi());
        System.out.println("Hasil mencari top_acceleration terendah menggunakan Divide Conquer : " + sr.akselerasiTerendah());
        System.out.println("Hasil mencari rata-rata top_power menggunakan Brute Force: " + sr.top_power_Ratarata());
    }
}