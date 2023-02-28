package org.example;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook SamsungA208 = new Notebook("Samsung", "A-208", "Black");
        Notebook SamsungC500 = new Notebook("Samsung", "C-500", "Green");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Red");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White");
        Notebook MSIGaming29 = new Notebook("MSI", "Gaming-29", "Red");


        List<Notebook> notebookList = List.of(SamsungA208, SamsungC500, AsusTUF504, AsusTUF555, MSIGaming29);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();



    }


}