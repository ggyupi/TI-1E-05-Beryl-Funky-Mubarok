package MINGGU11.Praktikum1;

public class SingleLinkedList {
    Node head, tail;
    boolean isEmpty(){ // kondisinya head harus berisi null
        return head!=null;
    }
    void print(){ // pencetakan data ini tidak memperbolehkan LL dalam
                  // kondisi kosong
        if (isEmpty()) {
            Node temp = head;
            System.out.print("Isi Linked List\t\t");
            while (temp!=null) {
                System.out.print(temp.data+"\t");
                temp = temp.next;
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
}
