import java.util.Scanner;

public class Phone extends ElectronikDevice {
     private String model ;


     public Phone(String model,int Year,int price, int count){
         setPrice(price);
         this.model=model;
         setYear(Year);
         setCount(count);
     }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    void infor(){
        System.out.println("Модель телефона "+getModel());
        System.out.println("Телефон был создан "+getYear()+"тг");
        checkPrice();
    }

    @Override
    public void showInfo(){
        System.out.println("Хотите купить этот телефон?");
        System.out.println("1 — Да\n2 — Посмотреть другое");
        int ch ;
        Scanner sc =new Scanner(System.in);
        int choice= sc.nextInt();
        if (choice == 1) {
            System.out.println();
            processPayment();
        } else if (choice==2) {
            System.out.println("🔁 Возвращаемся к выбору.");
        }

    }

}