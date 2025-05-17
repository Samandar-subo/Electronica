import java.util.Scanner;
import java.util.concurrent.CountedCompleter;

public class Laptop  extends  ElectronikDevice{
    private String laptopname;

    public void setLaptopname(String laptopname){
        this.laptopname=laptopname;
    }

    public String getLaptopname() {
        return laptopname;
    }

    public Laptop(String laptopname, int Year, int price, int count){
        setLaptopname(laptopname);
        setPrice(price);
        setYear(Year);
        setCount(count);
    }

    void infomation(){
        System.out.println("Ноутбук "+getLaptopname());
        System.out.println("Ноутбук создан в "+getYear()+" году ");
        checkPrice();

    }

    @Override
    public void showInfo() {
        System.out.println("Хотите купить этот ноутбук ?");
        System.out.println("1 — Да\n2 — Посмотреть другое");
        Scanner sc =new Scanner(System.in);
        int choice= sc.nextInt();
        if (choice == 1) {
            System.out.println();
            processPayment();
        } else {
            System.out.println("🔁 Возвращаемся к выбору.");
        }
    }


}