public abstract class ElectronikDevice {
    private int Year;
    private int price;

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
        } else {
            System.out.println("Цена: " + getPrice() + " тг");
        }
    }

    public abstract void showInfo();




}