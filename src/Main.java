import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in );
        System.out.println();
        System.out.println("Добро пожаловат в наш могазин электроники");
        System.out.println("у нас на данный есть эти девайсы Phone, Smart watch, Laptop , Headphones ;");
        System.out.print("Выберите девавйс которые вам надо:");

        String num= scan.nextLine();

        Phone Iphone =new Phone();
        Phone Samsung =new Phone();
        Phone Redmi =new Phone();

        // Information about Iphone
        Iphone.model="Iphone 11";
        Iphone.Year=2019;
        Iphone.price=340000;

        // Information about Samsung

        Samsung.model="Samsung S24 Ultra";
        Samsung.Year=2024;
        Samsung.price=540000;

        // Information about Redmi

        Redmi.model="Redmi not 12";
        Redmi.Year=2021;
        Redmi.price=120000;

        //Laptops
        Laptop Asus= new Laptop();

        // Asus

        Asus.laptopname="Asus";
        Asus.LapModel="TUF F15";
        Asus.Year=2022;
        Asus.price=450000;

        //iMac
        Laptop iMac = new Laptop();

        iMac.laptopname="iMac";
        iMac.LapModel="M3";
        iMac.Year=2019;
        iMac.price=540000;

        //Hp
        Laptop Hp=new Laptop();

        Hp.laptopname="Hp";
        Hp.LapModel="L20";
        Hp.Year=2018;
        Hp.price=280000;

        // Smart watch
        SmartWhach Hoco = new SmartWhach();

        // Hoco
        Hoco.nameModel="Hoco";
        Hoco.Year=2023;
        Hoco.Color="red";
        Hoco.price=8000;

        // Apple Watch

        SmartWhach Apple_watch = new SmartWhach();

        Apple_watch.nameModel="Apple watch";
        Apple_watch.Year=2024;
        Apple_watch.Color="green";
        Apple_watch.price=64000;

        // Mi watch
        SmartWhach Mi_watch = new SmartWhach();
        Mi_watch.nameModel="MI wacth 5";
        Mi_watch.Year=2021;
        Mi_watch.Color="white";
        Mi_watch.price=23000;

        //Headphones

        // Minor
        Headphones Minor =new Headphones();

        Minor.name="Minor";
        Minor.Year=2022;
        Minor.model="gidra";
        Minor.price=23000;

        //Air pods
        Headphones Air_pods =new Headphones();

        Air_pods.name="Air pods";
        Air_pods.model=" pro 3";
        Air_pods.price=120000;
        Air_pods.Year=2023;

        // Hoco
        Headphones Hoco1 = new Headphones();

        Hoco1.name="Hoco";
        Hoco1.model=" Max";
        Hoco1.Year=2022;
        Hoco1.price=8000;


        if (num.equalsIgnoreCase("Phone")) {
            System.out.print("У наc есть телефоны Iphone Samsung Redmi: ");
            String num0=scan.nextLine();
            if (num0.equalsIgnoreCase("Iphone")) {
                Iphone.Infor();
            } else if (num0.equalsIgnoreCase("Samsung")) {
                Samsung.Infor();
            } else if (num0.equalsIgnoreCase("Redmi")) {
                Redmi.Infor();
            } else {
                System.out.println("К сожелению у нас нет такого телофона");
            }
        }
        else if (num.equalsIgnoreCase("Laptop")) {
            System.out.print("У наc есть ноутбуки Asus iMac Hp:");
            String num2= scan.nextLine();
            if (num2.equalsIgnoreCase("Asus")){
                Asus.Infomation();
            } else if (num2.equalsIgnoreCase("Hp")) {
                Hp.Infomation();
            } else if (num2.equalsIgnoreCase("iMac")) {
                iMac.Infomation();
            }
            else {
                System.out.println("К сожелению у нас нет такого Ноутбука");
            }
        }
        else if (num.equalsIgnoreCase("Smart watch")){
            System.out.print("У нас есть умные часы Hoco, Apple watch , Mi watch 5 :");
            String num1= scan.nextLine();
            if (num1.equalsIgnoreCase("Hoco")){
                Hoco.Inform();
            } else if (num1.equalsIgnoreCase("Apple watch")) {
                Apple_watch.Inform();
            } else if (num1.equalsIgnoreCase("Mi watch 5")) {
                Mi_watch.Inform();
            }
            else {
                System.out.println("К сожелению у нас нет такого Умные часы ");
            }
        } else if (num.equalsIgnoreCase("Headphones")){
            System.out.print("У нас есть наушники Minor , Air pods , Hoco :");
            String num3= scan.nextLine();
            if (num3.equalsIgnoreCase("Minor")){
                Minor.Informa();
            } else if (num3.equalsIgnoreCase("Air pods")) {
                Air_pods.Informa();
            } else if (num3.equalsIgnoreCase("Hoco")) {
                Hoco1.Informa();
            }
            else {
                System.out.println("У нас нету такого наушника ");
            }
        }else {
            System.out.println(" У нам нету такого девайса ");
        }






    }
}