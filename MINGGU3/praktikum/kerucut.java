class kerucut extends BangunRuang{
    public double sisiMiring;
    public double jariJari;
    public double phi = Math.PI;

    public kerucut (double sm, double r){
        sisiMiring = sm;
        jariJari = r;
    }
    double luasPermukaan(){
        return phi * sisiMiring * (jariJari + sisiMiring);
    }
    double hitungVolume(){
        return (1.0/3.0) * phi * Math.pow(jariJari, 2) * Math.sqrt(Math.pow(sisiMiring, 2)-Math.pow(jariJari, 2));
    }
}
