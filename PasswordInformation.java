package Aziz;

import java.util.Scanner;

public class PasswordInformation {
    static Scanner scanner = new Scanner(System.in);
    static String userName = "a";
    static String password = "b";

    public static void password(){

        int guvenlikDuvari = 3;
        int girisSayisi = 0;

        while (true){

            System.out.println("Lütfen kullanıcı adını giriniz");

            String girilenKullaniciAdi = scanner.nextLine();

            girisSayisi++;

            if (!girilenKullaniciAdi.equals(userName)){
                System.out.println("Kullanıcı Adi yanlış Tekrar Giriniz");
            }else {

                break;
            }

            if (guvenlikDuvari==girisSayisi){
                System.out.println("=========================================");
                System.out.println("*****Üst üste yanlıs giris, sitemden atıldınız*****");
                System.out.println("=========================================");
                System.exit(0);
            }

        }

        girisSayisi = 0;

        while (true){
            System.out.println("Lütfen sifre giriniz");

            String girilenSifre = scanner.nextLine();

            girisSayisi++;

            if (!girilenSifre.equals(password)){
                System.out.println("sifre yanlış Tekrar Giriniz");
            }else {
                break;
            }

            if (guvenlikDuvari==girisSayisi){
                System.out.println("=========================================");
                System.out.println("*****Üst üste yanlıs giris, sitemden atıldınız*****");
                System.out.println("=========================================");
                System.exit(0);
            }
        }

    }
}
