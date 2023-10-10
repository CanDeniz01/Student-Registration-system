package Aziz;

import java.util.Scanner;

public class RemoveStudent {
    static Scanner scanner = new Scanner(System.in);

    public static void removeStudent(){

        System.out.println("Lütfen Silmek istediginiz ogrencinin adını giriniz");

        System.out.println(""+StudentDatabase.student1[0]+"");
        System.out.println(""+StudentDatabase.student2[0]+"");
        System.out.println(""+StudentDatabase.student3[0]+"");
        System.out.println(""+StudentDatabase.student4[0]+"");
        System.out.println(""+StudentDatabase.student5[0]+"");

        String girilenAd = scanner.nextLine();

        if (StudentDatabase.student1[0]!=null){
            if (StudentDatabase.student1[0].contains(girilenAd)){
                StudentDatabase.student1[0]=null;
            }
        }

        if (StudentDatabase.student2[0]!=null){
            if (StudentDatabase.student2[0].contains(girilenAd)){
                StudentDatabase.student2[0] =null;
            }
        }

        if (StudentDatabase.student3[0]!=null){
            if (StudentDatabase.student3[0].contains(girilenAd)){
                StudentDatabase.student3[0] =null;
            }
        }

        if (StudentDatabase.student4[0]!=null){
            if (StudentDatabase.student4[0].contains(girilenAd)){
                StudentDatabase.student4[0]=null;
            }
        }

        if (StudentDatabase.student5[0]!=null){
            if (StudentDatabase.student5[0].contains(girilenAd)){
                StudentDatabase.student5[0]=null;
            }
        }

        StudentDatabase.atama();

    }
}
