package Aziz;

import java.util.Scanner;

public class PasswordOperations {
    static Scanner scanner = new Scanner(System.in);

    public static void passwordOperations(){

        while (true){
            System.out.println("Lütfen eski sifrenizi giriniz");

            String girilenEskiSifre = scanner.nextLine();

            if (girilenEskiSifre.equals(PasswordInformation.password)){

                System.out.println("Lütfen yeni şifreyi giriniz");

                String  girilenYeniSifre = scanner.nextLine();

                System.out.println("Lütfen yeni şifreyi tekrar giriniz");

                String girilenOnaySifresi = scanner.nextLine();

                if (girilenYeniSifre.equals(girilenOnaySifresi)){
                    System.out.println("Sifreniz Basarili bir sekilde degistirildi");
                    break;
                }else {
                    System.out.println("hatalı sifre girdiniz, Ana menüye yönlediriliyorsunuz");
                    break;
                }

            }else {
                System.out.println("Eski sifre yanlıs, ana menüye yönlendiriliyorsunuz");
                break;
            }

        }

    }
}
