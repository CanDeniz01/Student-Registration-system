package Aziz;

import java.util.Scanner;

public class AddStudent {
    static Scanner scanner = new Scanner(System.in);

    public static void addStudent(){

        int count = 0;

        while (true){
            System.out.println("Ogrenci adi gir");
            String ogrenciAdi = scanner.nextLine();

            System.out.println("Ogrenci soy adi gir");
            String ogrenciSoyAdi = scanner.nextLine();

            System.out.println("Ogrenci bölümü gir");
            String ogrenciBolum = scanner.nextLine();

            System.out.println("Ogrenci yas gir");
            String ogrenciYas = scanner.nextLine();

            String ogrentiTumBilgiler = ""+ogrenciAdi+"-"+ogrenciSoyAdi+"-"+ogrenciBolum+"-"+ogrenciYas;

            if (count==0){
                StudentDatabase.student1[0] =  ogrentiTumBilgiler;
            }

            if (count==1){
                StudentDatabase.student2[0] =  ogrentiTumBilgiler;
            }

            if (count==2){
                StudentDatabase.student3[0] =  ogrentiTumBilgiler;
            }

            if (count==3){
                StudentDatabase.student4[0] =  ogrentiTumBilgiler;
            }

            if (count==4){
                StudentDatabase.student5[0] =  ogrentiTumBilgiler;
            }

            if (count>=5){
                System.out.println("Yeter la kaç tane ekliyon!!!!!");
            }

            count++;


            System.out.println("Yeni Ogrenci Eklemek İcin [Y] basınız");
            System.out.println("Cıkıs yapma icin [0] basınız");

            String islem = scanner.nextLine();

            if (islem.equalsIgnoreCase("0")){
                StudentDatabase.atama();
                break;
            }else {

            }
        }


    }
}
