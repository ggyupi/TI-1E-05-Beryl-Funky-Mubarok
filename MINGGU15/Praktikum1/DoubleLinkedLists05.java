package MINGGU15.Praktikum1;

public class DoubleLinkedLists05 {
    Node05 head;
    int size;
    public DoubleLinkedLists05(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item, int jarak){
        if (isEmpty()){
            head=new Node05(null,item,jarak,null);
        }else{
            Node05 newNode = new Node05(null,item,jarak,head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addlast(int item, int jarak){
        if(isEmpty()){
            addFirst(item,jarak);
        }else{
            Node05 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node05 newNode = new Node05(current,item,jarak,null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item,int jarak,int index) throws Exception {
        if(isEmpty()){
            addFirst(item,jarak);
        }else if(index<0||index>size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Node05 current = head;
            int i =0;
            while(i<index){
                current=current.next;
                i++;
            }
            if(current.prev==null){
                Node05 newNode = new Node05(null,item,jarak,current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node05 newNode = new Node05(null,item,jarak,current);
                newNode.prev=current.prev;
                newNode.next=current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head=null;
        size=0;
    }
    public void print(){
        if(!isEmpty()){
            Node05 tmp = head;
            while (tmp!=null){
                System.out.print(tmp.data+"\t");
                tmp=tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked Lists Kosong");
        }
    }
    public void removeFirst()throws Exception{
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if(size==1){
            removeLast();
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    public void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node05 current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index)throws Exception{
            Node05 current = head;
            while(current!=null){
                if(current.data==index){
                    if(current.prev!=null){
                        current.prev.next=current.next;
                    }else{
                        head=current.next;
                    }
                    if(current.next!=null){
                        current.next.prev=current.prev;
                    }
                    break;
                }
                current=current.next;
            }
            size--;
        }
    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
    public int getLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        Node05 tmp = head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    public int get(int index)throws Exception {
        if(isEmpty()||index>=size){
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node05 tmp=head;
        for(int i=0;i<index;i++){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    public int getJarak(int index) throws Exception{
        if(isEmpty()||index>=size){
            throw new Exception("Nilai indeks di luar batas");
        }
        Node05 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp=tmp.next;
        }
        return tmp.jarak;
    }
}
