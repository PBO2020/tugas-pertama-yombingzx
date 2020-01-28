package kalkulator;
import java.util.Scanner;
public class Kalkulator {
    static Scanner m = new Scanner(System.in);
    public static void main(String[] args) {
        Kalkulator p = new Kalkulator();
        p.menu();
    }
    public void nambah(){
        settergetter x = new settergetter();
        System.out.println("Penambahan");
        System.out.println("Masukkan Angkanya");
        System.out.print("Angka 1 : ");
        int a=m.nextInt();
        System.out.print("Angka 2 : ");
        int b=m.nextInt();
        x.setnilainambah(a,b);
        System.out.println("Maka : " +a +" + "+b+ " = " + x.getnilainambah());
        menu();
    }
    public void kurang(){
        settergetter x = new settergetter();
        System.out.println("Pengurangan");
        System.out.println("Masukkan Angkanya");
        System.out.print("Angka 1 : ");
        int a=m.nextInt();
        System.out.print("Angka 2 : ");
        int b=m.nextInt();
        x.setnilaikurang(a,b);
        System.out.println("Maka : " +a +" - "+b+ " = " + x.getnilaikurang());
        menu();
    }
    public void kali(){
        settergetter x = new settergetter();
        System.out.println("Perkalian");
        System.out.println("Masukkan Angkanya");
        System.out.print("Angka 1 : ");
        int a=m.nextInt();
        System.out.print("Angka 2 : ");
        int b=m.nextInt();
        x.setnilaikali(a,b);
        System.out.println("Maka : " +a +" x "+b+ " = " + x.getnilaikali());
        menu();
    }
    public void bagi(){
        settergetter x = new settergetter();
        System.out.println("Pembagian");
        System.out.println("Masukkan Angkanya");
        System.out.print("Angka 1 : ");
        int a=m.nextInt();
        System.out.print("Angka 2 : ");
        int b=m.nextInt();
        x.setnilaibagi(a,b);
        System.out.println("Maka : " +a +" : "+b+ " = " + x.getnilaibagi());
        menu();
    }
    public void menu(){
        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian");
        System.out.println("5. Keluat Program");
        System.out.print("Masukkan Pilihan Dengan Angka : ");
        int pil = m.nextInt();
        switch (pil){
            case 1 :
                nambah();
                break;
            case 2 : 
                kurang();
                break;
            case 3 : 
                kali();
                break;
            case 4 :
                bagi();
                break;
            case 5 :
                System.exit(0);
            default :
                System.out.println("Tidak Ada Pilihan");
                menu();
        }
    }
}