import java.util.Scanner;

public class SmartWhach extends ElectronikDevice{
    private String nameModel;
    private String Color;

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getNameModel() {
        return nameModel;
    }

    public String getColor() {
        return Color;
    }

    public SmartWhach (String nameModel, String Color, int Year,int price,int count){
        setPrice(price);
        setNameModel(nameModel);
        setColor(Color);
        setYear(Year);
        setCount(count);
    }

    void inform(){
        System.out.println("Эти часы называются "+getNameModel());
        System.out.println("Эти смарт часы созданы в "+getYear()+" году");
        System.out.println("Цвет ремешка этих часов "+getColor());
        checkPrice();
    }

    @Override
    public void showInfo(){
        System.out.println("Хотите купить эти умные часы ?");
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