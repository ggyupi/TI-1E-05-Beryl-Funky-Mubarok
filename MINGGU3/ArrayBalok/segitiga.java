class segitiga {
    public int alas;
    public int tinggi;
    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
    double hitungKeliling(){
        double s = alas + tinggi + Math.sqrt(alas*alas+tinggi*tinggi);
        return s;
    }
}
