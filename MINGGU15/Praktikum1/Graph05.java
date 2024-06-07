package MINGGU15.Praktikum1;

public class Graph05 {
    int vertex;
    DoubleLinkedLists05 list[];

    public Graph05(int v){
        vertex = v;
        list = new DoubleLinkedLists05[v];
        for (int i = 0; i < v; i++) {
            list[i]=new DoubleLinkedLists05();
        }
    }
    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
        // untuk undirected graph
        // list[tujuan].addFirst(asal,jarak);
    }
    public void degree(int asal)throws Exception{
        int k, totalIn =0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j)==asal){
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung "+(char)('A'+asal)+": "+totalIn);
        System.out.println("OutDegree dari Gedung "+(char)('A'+asal)+": "+totalOut);
        System.out.println("Degree dari Gedung "+(char)('A'+asal)+": "+(totalIn+totalOut));
        // untuk undirected graph
        // System.out.println("Degree dari Gedung "+(char)('A'+asal)+": "+list[asal].size());
    }
    public void removeEdge(int asal, int tujuan)throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(i==tujuan){
                list[asal].remove(tujuan);
            }
        }
    }
    public void removeAllEdges(){
        for(int i=0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }
    public void printGraph()throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(list[i].size()>0){
                System.out.println("Gedung "+(char)('A'+i)+" terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char)('A'+list[i].get(j))+" ("+list[i].getJarak(j)+" m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public boolean checkInConnection(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if(list[asal].get(i)==tujuan) {
                return true;
            }
        }
        return false;
    }
    public void checkIsPathExist(int asal, int tujuan) throws Exception {
        if (checkInConnection(asal,tujuan)) {
            System.out.println("Gedung "+(char)('A'+asal)+" dan "+(char)('A'+tujuan)+" bertetangga");
        } else {
            System.out.println("Gedung "+(char)('A'+asal)+" dan "+(char)('A'+tujuan)+" tidak bertetangga");
        }
    }
}
