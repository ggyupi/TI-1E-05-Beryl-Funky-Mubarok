package MINGGU11.Praktikum2;

public class SingleLinkedList {
    Node head, tail;
    boolean isEmpty(){ // kondisinya head harus berisi null
        return head!=null;
    }
    void print(){ // pencetakan data ini tidak memperbolehkan LL dalam
                  // kondisi kosong
        if (isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List\t\t");
            while (tmp!=null) {
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    void addFirst (int input){
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addFirst
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // jika kosong, maka peran head dan tail
                         // harus memiliki Node yang sama            
            ndInput.next=head;
            head = ndInput;
            // ndInput.next = head;
            // head = ndInput;
        }else{
            head = ndInput;
            tail = ndInput;
            // ndInput.next = head;
            // head = ndInput;
        }
    }
    void addLast (int input){
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addLast
        Node ndInput = new Node(input,null);
        if (isEmpty()) { // jika kosong, maka peran head dan tail
                         // harus memiliki Node yang sama            
            tail.next = ndInput;
            tail = ndInput;
        }else{
            head = ndInput;
            tail = ndInput;
        }
    }
    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        // Node ndInput = new Node();
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) { // jika tidak ada node selanjutnya
                                            // maka jadikan ndinput sebagai tail
                    tail = ndInput;
                    break; // jangan lupa di rem, jangan gas terus!
                }
            }
            temp = temp.next;
        } while (temp != null); // selama masih ada node, lanjutkan
    }
    void insertAt(int index, int input) {
        // pastikan operasi dari method ini adalah menggeser posisi
        // node yang terletak di indeks dan node tersebut berpindah
        // satu indeks setelahnya
        // Node ndInput = new Node(input, null);
        if (index < 0) {
            index *= -1;
            // System.out.println("Perbaiki logikanya!" + "kalau indeksnya -1 bagaimana???");
        }
        if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    int getData (int index){
        // ambil nilai data tempat sesuai index yang ditunjuk
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        return temp.next.data;
    }
    int indexOf(int key){
        // ketahui posisi nodemu ada di index mana
        Node tmp = head;
        int index = 0;
        while (tmp!=null&&tmp.data!=key) {
            tmp=tmp.next;
            index++;
        }
        return index;
        // if (tmp!=null) {
        //     return 1;
        // }else{
        //     return index;
        // }
    }
    void removeFirst(){
        if (!isEmpty()) {
            System.out.println("Linked List maish kosong,"+"tidak dapat dihapus");
        }else if (head==null) {
            head=tail=null;
        }else{
            head=head.next;
        }
    }
    void removeLast(){
       if (!isEmpty()) {
        System.out.println("Linked Link masih kosong,"+"tidak dapat dihapus");
       }else if (head==null) {
        head=tail=null;
       }else{
        Node temp = head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp.next;
       }
    }
    void remove(int key){
        if (!isEmpty()) {
            System.out.println("Linked Link masih kosong,"+"Tidak dapat dihapus");
        }else{
            Node temp = head;
            while (temp!=null) {
                if (temp.data==key&&temp==head) {
                    removeFirst();
                    break;
                }else if(temp.next.data==key){
                    temp.next=temp.next.next;
                    if (temp.next==null) {
                        tail=temp;
                    }
                    break;
                }
                temp=temp.next;
            }
        }
    }
    public void removeAt (int index){
        if (index == 0) {
            removeFirst();
        }else{
            Node temp =head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if (temp.next==null) {
                tail=temp;
            }
        }
    }
}
