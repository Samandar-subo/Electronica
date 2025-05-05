import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in );


        System.out.println("Привет, GitHub!");


        Phone Iphone =new Phone();

        Iphone.price=500000;
        Iphone.Year=2024;
        Iphone.model="Iphone 16";
        Iphone.parametrs();

        System.out.println();

        Headphones Airpods= new Headphones();
        Airpods.price=65000;
        Airpods.model="Pro 3";
        Airpods.name="AirPods";
        Airpods.Year=2022;
        Airpods.Information();

        System.out.println();

        SmartWhach AplleWotch = new SmartWhach();
        AplleWotch.Manuname="Samsung";
        AplleWotch.price=45000;
        AplleWotch.Year=2023;
        AplleWotch.nameModel="AplleWotch 7 pro";
        AplleWotch.parametr();

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

        Laptop Nout= new Laptop();
        Nout.lapname= scan.nextLine();
        Nout.modelLap= scan.nextLine();
        device3.displayInfo();
        Nout.par();





        }
    }
