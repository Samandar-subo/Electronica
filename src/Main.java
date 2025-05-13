import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System. in );

        System.out.println();
        System.out.println("Добро пожаловат в наш могазин электроники");
        System.out.println("у нас на данный есть эти девайсы Phone, Smart watch, Laptop , Headphones ;");
        System.out.print("Выберите девавйс которые вам надо:");

        String num =scan.nextLine();

        // Phone
        Phone Iphone = new Phone("Iphone 14 pro",2022,-540000);
        Phone Samsung = new Phone("Samsung S24 Ultra",2023,650000);
        Phone Redmi = new Phone("Redmi not 12",2021,156000);

        // Laptop
        Laptop Asus = new Laptop("Asus","TUF F15",2022,-450000);
        Laptop Hp =new Laptop("Hp","h5",2020,280000);
        Laptop Imac= new Laptop("Mac","m5",2022,50000);

        // Smartwatch
        SmartWhach Hoco =new SmartWhach("Hoco","Red",-8000,2022);
        SmartWhach Apple_watch =new SmartWhach("Apple watch","black",64000,2022);
        SmartWhach Mi_watch = new SmartWhach("Mi watch","green",12000,2021);

        //Headphones
        Headphones Minor = new Headphones("Minor","pro",-28000,2023);
        Headphones Air_pods = new Headphones("Air pods","max 3",110000,2024);
        Headphones Hoco1 =new Headphones("Hoco","pro",8000,2022);

        ElectronikDevice d1 =new Phone("Iphone 14 pro",2023,-540000);


        if (num.equalsIgnoreCase("Phone")) {
            System.out.print("У наc есть телефоны Iphone Samsung Redmi: ");
            String num0=scan.nextLine();
            if (num0.equalsIgnoreCase("Iphone")) {
                Iphone.infor();
                Iphone.showInfo();
            } else if (num0.equalsIgnoreCase("Samsung")) {
                Samsung.infor();
                Samsung.showInfo();
            } else if (num0.equalsIgnoreCase("Redmi")) {
                Redmi.infor();
                Redmi.showInfo();
            } else {
                System.out.println("К сожелению у нас нет такого телофона");
            }
        }
        else if (num.equalsIgnoreCase("Laptop")) {
            System.out.print("У наc есть ноутбуки Asus Imac Hp:");
            String num2= scan.nextLine();
            if (num2.equalsIgnoreCase("Asus")){
                Asus.infomation();
                Asus.showInfo();
            } else if (num2.equalsIgnoreCase("Hp")) {
                Hp.infomation();
                Hp.showInfo();
            } else if (num2.equalsIgnoreCase("iMac")) {
                Imac.infomation();
                Imac.showInfo();
            }
            else {
                System.out.println("К сожелению у нас нет такого Ноутбука");
            }
        }
        else if (num.equalsIgnoreCase("Smart watch")){
            System.out.print("У нас есть умные часы Hoco, Apple watch , Mi watch 5 :");
            String num1= scan.nextLine();
            if (num1.equalsIgnoreCase("Hoco")){
                Hoco.inform();
                Hoco.showInfo();
            } else if (num1.equalsIgnoreCase("Apple watch")) {
                Apple_watch.inform();
                Apple_watch.showInfo();
            } else if (num1.equalsIgnoreCase("Mi watch")) {
                Mi_watch.inform();
                Mi_watch.showInfo();
            }
            else {
                System.out.println("К сожелению у нас нет такого Умные часы ");
            }
        } else if (num.equalsIgnoreCase("Headphones")){
            System.out.print("У нас есть наушники Minor , Air pods , Hoco :");
            String num3= scan.nextLine();
            if (num3.equalsIgnoreCase("Minor")){
                Minor.informa();
                Minor.showInfo();
            } else if (num3.equalsIgnoreCase("Air pods")) {
                Air_pods.informa();
                Air_pods.showInfo();
            } else if (num3.equalsIgnoreCase("Hoco")) {
                Hoco1.informa();
                Hoco1.showInfo();
            }
            else {
                System.out.println("У нас нету такого наушника ");
            }
        }else {
            System.out.println(" У нам нету такого девайса ");
        }











    }
}