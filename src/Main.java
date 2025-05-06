import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in );

        System.out.println("Привет, GitHub!");
        // Телфоны
        Phone Iphone =new Phone();

        Iphone.price=500000;
        Iphone.Year=2024;
        Iphone.model="Iphone 16";
        Iphone.parametrs();

        System.out.println();
        // Наушники
        Headphones Airpods= new Headphones();
        Airpods.price=65000;
        Airpods.model="Pro 3";
        Airpods.name="AirPods";
        Airpods.Year=2022;
        Airpods.Information();

        System.out.println();
        // усные часы
        SmartWhach AplleWotch = new SmartWhach();
        AplleWotch.Manuname="Samsung";
        AplleWotch.setPrice(scan.nextInt());
        AplleWotch.Year=2023;
        AplleWotch.nameModel="AplleWotch 7 pro";
        AplleWotch.parametr();

        // Праверка Полиморфизма
        ElectronikDevice device =new Phone();
        ElectronikDevice device1= new Headphones();
        ElectronikDevice device2=new SmartWhach();
        ElectronikDevice device3=new Laptop();

        System.out.println("Здесь информация про девайсы ");

        device1.displayInfo();
        device2.displayInfo();
        device.displayInfo();

        System.out.println("Что это такое ");
        device2.Info();
        device1.Info();
        device.Info();

        // Ноутбуки
        Laptop Nout= new Laptop();
        Nout.lapname="ASUS";
        Nout.modelLap= "TUF F15";
        Nout.price=450000;
        Nout.Year=2022;
        device3.displayInfo();
        Nout.par();

        ElectronikDevice dev1=new Phone();

        dev1.infoYears();






    }
}