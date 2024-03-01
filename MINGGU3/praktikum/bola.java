class bola extends BangunRuang{
    public double jariJari;
    public double phi = Math.PI;
    public bola(double r){
        jariJari = r;
    }
    double luasPermukaan(){
        return 4 * phi * Math.pow(jariJari, 2);
    }
    double hitungVolume(){
        return (4.0/3.0) * phi * Math.pow(jariJari, 3);
    }
}
