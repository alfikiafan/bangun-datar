package bangundatar;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        double s1;
        double s2;
        double r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
        DecimalFormat df = new DecimalFormat("#.###");
        /*Program*/
        // panggil metode

        mainMenu();
        // kondisional untuk pilihan menu yang dimasukan
        switch (pilihan) {
            case '1' -> {
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextDouble();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextDouble();
                System.out.println("Luas persegi panjang: " + df.format(opersegi.luas(s1, s2)));
                System.out.println("Keliling persegi panjang: " + df.format(opersegi.keliling(s1, s2)));
            }
            case '2' -> {
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextDouble();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextDouble();
                System.out.println("Luas segitiga: " + df.format(osegitiga.luas(s1, s2)));
                System.out.println("Keliling segitiga: " + df.format(osegitiga.keliling(s1, s2)));
            }
            case '3' -> {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextDouble();
                System.out.println("Luas lingkaran: " + df.format(olingkaran.luas(r)));
                System.out.println("Keliling lingkaran: " + df.format(olingkaran.keliling(r)));
            }
            default ->
                System.out.println("tidak ada pilihan");

        }
    }

    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu: ");
        pilihan = scanner.next().charAt(0);
    }
}