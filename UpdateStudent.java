package Aziz;

import java.util.Scanner;

public class UpdateStudent {

    static Scanner scanner = new Scanner(System.in);

    public static void updateStudent(){

        System.out.println("Lütfen güncellemek istediginiz ogrencinin adını giriniz");

        System.out.println("*****"+StudentDatabase.student1[0]+"*****");
        System.out.println("*****"+StudentDatabase.student2[0]+"*****");
        System.out.println("*****"+StudentDatabase.student3[0]+"*****");
        System.out.println("*****"+StudentDatabase.student4[0]+"*****");
        System.out.println("*****"+StudentDatabase.student5[0]+"*****");

        String girilenAd = scanner.nextLine();

        if (StudentDatabase.student1[0]!=null){
            if (StudentDatabase.student1[0].contains(girilenAd)){

                System.out.println("isim güncelle");
                String ogrenciAdi = scanner.nextLine();

                System.out.println("soy isim güncelle");
                String ogrenciSoyAdi = scanner.nextLine();

                System.out.println("bölüm güncelle");
                String ogrenciBolum = scanner.nextLine();

                System.out.println("yas güncelle");
                String ogrenciYas = scanner.nextLine();

                String ogrentiTumBilgiler = ""+ogrenciAdi+"-"+ogrenciSoyAdi+"-"+ogrenciBolum+"-"+ogrenciYas;

                StudentDatabase.student1[0]= ogrentiTumBilgiler;
            }
        }

        if (StudentDatabase.student2[0]!=null){
            if (StudentDatabase.student2[0].contains(girilenAd)){

                System.out.println("isim güncelle");
                String ogrenciAdi = scanner.nextLine();

                System.out.println("soy isim güncelle");
                String ogrenciSoyAdi = scanner.nextLine();

                System.out.println("bölüm güncelle");
                String ogrenciBolum = scanner.nextLine();

                System.out.println("yas güncelle");
                String ogrenciYas = scanner.nextLine();

                String ogrentiTumBilgiler = ""+ogrenciAdi+"-"+ogrenciSoyAdi+"-"+ogrenciBolum+"-"+ogrenciYas;

                StudentDatabase.student2[0]= ogrentiTumBilgiler;
            }
        }

        if (StudentDatabase.student3[0]!=null){
            if (StudentDatabase.student3[0].contains(girilenAd)){

                System.out.println("isim güncelle");
                String ogrenciAdi = scanner.nextLine();

                System.out.println("soy isim güncelle");
                String ogrenciSoyAdi = scanner.nextLine();

                System.out.println("bölüm güncelle");
                String ogrenciBolum = scanner.nextLine();

                System.out.println("yas güncelle");
                String ogrenciYas = scanner.nextLine();

                String ogrentiTumBilgiler = ""+ogrenciAdi+"-"+ogrenciSoyAdi+"-"+ogrenciBolum+"-"+ogrenciYas;

                StudentDatabase.student3[0]= ogrentiTumBilgiler;
            }
        }

        if (StudentDatabase.student4[0]!=null){
            if (StudentDatabase.student4[0].contains(girilenAd)){

                System.out.println("isim güncelle");
                String ogrenciAdi = scanner.nextLine();

                System.out.println("soy isim güncelle");
                String ogrenciSoyAdi = scanner.nextLine();

                System.out.println("bölüm güncelle");
                String ogrenciBolum = scanner.nextLine();

                System.out.println("yas güncelle");
                String ogrenciYas = scanner.nextLine();

                String ogrentiTumBilgiler = ""+ogrenciAdi+"-"+ogrenciSoyAdi+"-"+ogrenciBolum+"-"+ogrenciYas;

                StudentDatabase.student4[0]= ogrentiTumBilgiler;
            }
        }

        if (StudentDatabase.student5[0]!=null){
            if (StudentDatabase.student5[0].contains(girilenAd)){

                System.out.println("isim güncelle");
                String ogrenciAdi = scanner.nextLine();

                System.out.println("soy isim güncelle");
                String ogrenciSoyAdi = scanner.nextLine();

                System.out.println("bölüm güncelle");
                String ogrenciBolum = scanner.nextLine();

                System.out.println("yas güncelle");
                String ogrenciYas = scanner.nextLine();

                String ogrentiTumBilgiler = ""+ogrenciAdi+"-"+ogrenciSoyAdi+"-"+ogrenciBolum+"-"+ogrenciYas;

                StudentDatabase.student5[0]= ogrentiTumBilgiler;
            }
        }

        StudentDatabase.atama();

    }
}
