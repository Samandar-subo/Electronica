import java.util.Scanner;

public class Headphones extends ElectronikDevice{
    private String model;
    private String name;

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public Headphones (String name, String model, int price, int Year){
        setYear(Year);
        setName(name);
        setModel(model);
        setPrice(price);

    }

    void informa(){
        System.out.println("Наушник из бренда "+getName());
        System.out.println("Модел наушников называется "+getModel());
        System.out.println("Наушники созданы в "+getYear()+" году");
        System.out.println("Наушник стоит "+getPrice()+" тг");
        checkPrice();
    }

    @Override
    public void showInfo() {
        System.out.println("Хотите купить этот Наушник ?");
        System.out.println("1 — Да\n2 — Посмотреть другое");
        Scanner sc =new Scanner(System.in);
        int choice= sc.nextInt();
        if (choice == 1) {
            System.out.println("✅ Спасибо за покупку!");
        } else {
            System.out.println("🔁 Возвращаемся к выбору.");
        }
    }
}