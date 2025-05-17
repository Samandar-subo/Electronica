import java.util.Scanner;

public class Headphones extends ElectronikDevice{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Headphones (String name, int price, int Year, int count){
        setYear(Year);
        setName(name);
        setPrice(price);
        setCount(count);
    }

    void informa(){
        System.out.println("Наушник из бренда "+getName());
        System.out.println("Наушники созданы в "+getYear()+" году");
        checkPrice();
    }

    @Override
    public void showInfo() {
        System.out.println("Хотите купить этот наушник ?");
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