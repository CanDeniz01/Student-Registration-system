package Aziz;

import java.util.Scanner;

public class AllMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void allMenu (){

        while (true){
            System.out.println("--------------------------------");
            System.out.println("*****ANA MENUYE HOSGELDİNİZ*****");
            System.out.println("--------------------------------");
            System.out.println("ÖĞRENCİ BİLGİLERİNİ GÖRÜNTÜLEMEK İÇİN [1] BASINIZ"
                    +"\nYENİ ÖĞRENCİ KAYDI EKLEMEK İÇİN [2] BASINIZ"
                    +"\nMEVCUT ÖĞRENCİYİ SİLMEK İÇİN [3] BASINIZ"
                    +"\nMEVCUT ÖĞRENCİ BİLGİLERİNİ GÜNCELLEMEK İCİN [4] BASINIZ"
                    +"\nŞİFRE İŞLEMLERİ İÇİN [5] BASINIZ"
                    +"\nçIKIŞ YAPMAK İÇİN [0] BASINIZ");
            System.out.println("--------------------------------");
            System.out.println("*****ANA MENUYE HOSGELDİNİZ*****");
            System.out.println("--------------------------------");

            String girilenMenu = scanner.nextLine();

            switch (girilenMenu){
                case "1" :
                    ShowStudentInformation.showStudentInformation();

                    System.out.println("*****Ana menüye dönmek için [A] basınız");
                    System.out.println("*****Cıkıs yapma icin [0] basınız");

                    String islem2 = scanner.nextLine();

                    if (islem2.equals("A")){
                        break;
                    }else {
                        System.exit(0);
                    }

                case "2" :
                    AddStudent.addStudent();

                    System.out.println("*****Ana menüye dönmek için [A] basınız");
                    System.out.println("*****Cıkıs yapma icin [0] basınız");

                    String islem1 = scanner.nextLine();

                    if (islem1.equals("A")){
                        break;
                    }else {
                        System.exit(0);
                    }

                case "3" :
                    RemoveStudent.removeStudent();

                    System.out.println("*****Ana menüye dönmek için [A] basınız");
                    System.out.println("*****Cıkıs yapma icin [0] basınız");

                    String islem3 = scanner.nextLine();

                    if (islem3.equals("A")){
                        break;
                    }else {
                        System.exit(0);
                    }

                case "4" :
                    UpdateStudent.updateStudent();

                    System.out.println("*****Ana menüye dönmek için [A] basınız");
                    System.out.println("*****Cıkıs yapma icin [0] basınız");

                    String islem4 = scanner.nextLine();

                    if (islem4.equals("A")){
                        break;
                    }else {
                        System.exit(0);
                    }

                case "5" :
                    PasswordOperations.passwordOperations();
                    break;

                default:
                    System.exit(0);
            }
        }

    }
}
