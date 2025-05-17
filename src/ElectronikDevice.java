import java.util.Scanner;

public abstract class ElectronikDevice {
    private int Year;
    private int price;
    private int count;

    public void setPrice(int price) {
            this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getYear() {
        return Year;
    }

    void checkPrice() {
        if (getPrice() <= 0) {
            System.out.println("❗ В этом девайсе ошибочная цена");
            throw new IllegalArgumentException("Цена не может быть отрицательной измените цены на тавар положительным числом");
        } else {
            System.out.println("Цена: " + getPrice() + " тг");
        }
    }

    protected void processPayment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Уважаемый клиент, как вы хотите оплатить?");
        System.out.println("1 — Кредит");
        System.out.println("2 — Наличные");
        System.out.println("3 — Цифровые деньги");
        System.out.print("Ваш выбор: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Спасибо! Перейдите к оформлению кредита.");
            case 2 -> System.out.println("Оплатите наличными у кассира.");
            case 3 -> System.out.println("Оплатите по QR-коду на экране.");
            default -> System.out.println("❌ Способ оплаты не выбран.");
        }

        System.out.println("✅ Спасибо за покупку!");
    }


    public abstract void showInfo();


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}