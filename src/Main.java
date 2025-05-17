import javax.swing.text.StyleContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Save sklad = new Save();

        System.out.println();
        System.out.println("Добро пожаловать в наш магазин электроники");

        int mod = 0;
        while (mod == 0) {
            System.out.println("Выберите устройства которые вам нужно:\n" +
                    "1. Телефоны\n" +
                    "2. Ноутбуки \n" +
                    "3. Наушники  \n" +
                    "4. Умные часы ");
            System.out.print("Ваш выбор: ");
            int num1 = scan.nextInt();

            if (num1 == 1) {
                System.out.print("Выберите телефон который вам нужен:");
                for (int i = 0; i < sklad.phones.size(); i++) {
                    Phone phone = sklad.phones.get(i);
                    System.out.println((i + 1) + ". " + phone.getModel());
                }
                int choice = scan.nextInt();
                Phone selected = sklad.phones.get(choice - 1);
                selected.infor();
                selected.showInfo();
            } else if (num1==2) {
                System.out.println("Выберите ноутбук который вам нужен:");
                for (int i = 0; i < sklad.laptops.size(); i++) {
                    Laptop laptop = sklad.laptops.get(i);
                    System.out.println((i + 1) + ". " + laptop.getLaptopname());
                }
                int choice = scan.nextInt();
                Laptop selected = sklad.laptops.get(choice - 1);
                selected.infomation();
                selected.showInfo();
            } else if (num1 == 3) {
                System.out.print("Выберите наушники которые вам надо:");
                for (int i = 0; i < sklad.headphones.size(); i++) {
                    Headphones headphones = sklad.headphones.get(i);
                    System.out.println((i + 1) + ". " + headphones.getName());
                }
                int choice = scan.nextInt();
                Headphones selected = sklad.headphones.get(choice - 1);
                selected.informa();
                selected.showInfo();
            } else if (num1==4) {
                System.out.print("Выберите умные часы которые вам надо:");
                for (int i=0;i< sklad.smartWhaches.size(); i++ ){
                    SmartWhach smartWhach = sklad.smartWhaches.get(i);
                    System.out.println((i+1)+". "+ smartWhach.getNameModel());
                }
                int choice = scan.nextInt();
                SmartWhach selected = sklad.smartWhaches.get(choice - 1);
                selected.inform();
                selected.showInfo();
            }
            else {
                System.out.println("Такого устройства нету у нас в магазине");
                continue;
            }

            System.out.println("0. Продолжить покупку");
            System.out.println("1. Закончить транзакцию");

            int modl = scan.nextInt();

            if (modl == 0) {
                mod = 0;
            } else if (modl == 1) {
                mod = 1;
            }

        }


    }
    }
