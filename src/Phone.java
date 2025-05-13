import java.util.Scanner;

public class Phone extends ElectronikDevice {
     private String model ;


     public Phone(String model,int Year,int price){
         setPrice(price);
         this.model=model;
         setYear(Year);
     }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    void infor(){
        System.out.println("Модел телефона "+getModel());
        System.out.println("Телефон быль создан "+getYear()+"тг");
        System.out.println("В нашем магазине телфон стоит "+getPrice()+" тг");
        checkPrice();
    }

    @Override
    public void showInfo(){
        System.out.println("Хотите купить этот Телефон?");
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