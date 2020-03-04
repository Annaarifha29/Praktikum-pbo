package main;

public class Main {

    public static void main(String[] args) {
      Persegi persegi = new Persegi();
      PersegiPanjang persegipanjang = new PersegiPanjang();
      Kubus kubus = new Kubus();
      Balok balok = new Balok();
      Segitiga segitiga = new Segitiga();
      Lingkaran lingkaran = new Lingkaran();
      Silinder silinder = new Silinder();
      
        System.out.println("1. Persegi");
        System.out.println("Luas persegi : "+persegi.luas(12));
        System.out.println("Keliling persegi : "+persegi.keliling(12));
        System.out.println("2. Persegi Panjang");
        System.out.println("Luas persegi panjang : "+persegipanjang.luas(3,5));
        System.out.println("Keliling persegi panjang : "+persegipanjang.keliling(3,5));
        System.out.println("3. Kubus");
        System.out.println("Volume Kubus : "+kubus.volume(10));
        System.out.println("4. Balok");
        System.out.println("Volume Balok : "+balok.volume(3,5,7));
        System.out.println("5. Segitiga");
        System.out.println("Luas segitiga : "+segitiga.luas(4,5));
        System.out.println("Keliling segitiga : "+segitiga.keliling(4,5));
        System.out.println("6. Lingkaran");
        System.out.println("Luas lingkaran : "+lingkaran.luas(12));
        System.out.println("Keliling lingkaran : "+lingkaran.keliling(12));
        System.out.println("7. Silinder");
        System.out.println("Volume silinder : "+silinder.volume(12,6 ));
    }
    
}
