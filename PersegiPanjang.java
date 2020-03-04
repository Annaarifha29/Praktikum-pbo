package main;

public class PersegiPanjang extends BangunDatar{
    private double panjang,lebar;
    
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double luas(){
        return this.panjang*this.lebar;
    }
    public double keliling(){
        return 2*(this.panjang+this.lebar);
    }
    public double luas(double panjang, double luas){
        return panjang*lebar;
    }
    public double keliling(double panjang, double lebar){
        return 2*(panjang+lebar);
    }
}
