package main;

public class Balok {
    private double tinggi;
    
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double volume(double panjang, double lebar, double tinggi){
        return panjang*lebar*tinggi;
    }
}
