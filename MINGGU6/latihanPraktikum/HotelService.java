package MINGGU6.latihanPraktikum;
/**
 * HotelService
 */
public class HotelService {

    Hotel[] rooms = new Hotel[5];
    int idx= 0;
    void tambah(Hotel H){
        if (idx<rooms.length){
            rooms[idx] = H;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for(Hotel H : rooms){
            H.tampil();
            System.out.println("------------------------");
        }
    }
    void bubbleSortHarga(){
        for(int i = 0; i<rooms.length-1; i++){
            for(int j = 1; j<rooms.length-i; j++){
                if(rooms[j].harga<rooms[j-1].harga){
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }
    void bubbleSortRating(){
        for(int i = 0; i<rooms.length-1; i++){
            for(int j = 1; j<rooms.length-i; j++){
                if(rooms[j].bintang>rooms[j-1].bintang){
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }
    void selectionSortHarga(){
        for(int i = 0; i<rooms.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j<rooms.length; j++){
                if(rooms[j].harga<rooms[idxMin].harga){
                    idxMin=j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }
    void selectionSortRating(){
        for(int i = 0; i<rooms.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j<rooms.length; j++){
                if(rooms[j].bintang>rooms[idxMin].bintang){
                    idxMin=j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }
}