package MINGGU10.Tugas;

public class Queue {
    Pembeli[] data;
    int front, rear, size, max;
    public Queue(int n){
        max = n;
        data = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
      if(size == 0){
        return true;
      } else{
        return false;
      }
    }
    public boolean IsFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan : "+data[front].nama+" "+data[front].noHP+" ");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i!=rear) {
                System.out.println(data[i].nama+" "+data[i].noHP+" ");
                i = (i+1)%max;
            }
            System.out.println(data[i].nama+" "+data[i].noHP+" ");
            System.out.println("Jumlah elemen = "+size);
        }
    }
    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terbelakang : "+data[rear].nama+" "+data[rear].noHP+" ");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(Pembeli dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else{
            if(IsEmpty()){
                front = rear =0;
            }else{
                if (rear==max-1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear]=dt;
            size++;
        }
    }
    public Pembeli Dequeue(){
        Pembeli dt = new Pembeli();
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            dt=data[front];
            size--;
            if(IsEmpty()){
                front=rear=-1;
            }else{
                if(front==max-1){
                    front=0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    public void peekPosition(String keyNama) {
        int i = front;
        while (i != rear+1) {
            if (data[i].nama.equalsIgnoreCase(keyNama)) {
                System.out.println(keyNama + " berada di antrian ke-" + (i - front + 1));
                return;
            }
            i = (i + 1) % max;
        }
        System.out.println(keyNama + " tidak ada di antrian");
    }
    public void daftarPembeli(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");

        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
}
