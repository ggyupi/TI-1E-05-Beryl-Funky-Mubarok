class limasPersegi extends BangunRuang{
    public double sisiAlas;
    public double tinggi;
    public limasPersegi(double sa, double t){
        sisiAlas = sa;
        tinggi = t;
    }
    double luasPermukaan(){
        return Math.pow(sisiAlas, 2) + 4 *(0.5 * sisiAlas * Math.sqrt(Math.pow(tinggi, 2)+Math.pow(sisiAlas*0.5, 2)));
    }
    double hitungVolume(){
        return (1.0/3.0) * Math.pow(sisiAlas, 2) * tinggi;
    }
}
