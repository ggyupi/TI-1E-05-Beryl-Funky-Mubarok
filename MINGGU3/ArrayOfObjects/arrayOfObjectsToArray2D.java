package ArrayOfObjects;

class Mahasiswa {
    String nama;
    int usia;
    public String toString() {
        String s = "Nama : " + nama + ", usia : " + usia;
        return s;
    }
}
public class arrayOfObjectsToArray2D {

    public static void main(String[] args) {
        Mahasiswa[][] dataMahasiswa = new Mahasiswa[2][2];
        dataMahasiswa[0][0] = new Mahasiswa();
        dataMahasiswa[0][0].nama = "talita";
        dataMahasiswa[0][0].usia = 10;
        dataMahasiswa[0][1] = new Mahasiswa();
        dataMahasiswa[0][1].nama = "dewi";
        dataMahasiswa[0][1].usia = 11;
        dataMahasiswa[1][0] = new Mahasiswa();
        dataMahasiswa[1][0].nama = "siska";
        dataMahasiswa[1][0].usia = 11;
        dataMahasiswa[1][1] = new Mahasiswa();
        dataMahasiswa[1][1].nama = "nala";
        dataMahasiswa[1][1].usia = 10;

        for (int i = 0; i < dataMahasiswa.length; i++){
            for (int j = 0; j < dataMahasiswa[i].length; i++){
                System.out.println("Mahasiswa [" + i + "][" + j + "]: " + dataMahasiswa[i][j]);
            }
        }
    }
}