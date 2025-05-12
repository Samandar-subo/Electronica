public class ElectronikDevice {
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


    void print(){
        System.out.println();
        System.out.println("Добро пожаловат в наш могазин электроники");
        System.out.println("у нас на данный есть эти девайсы Phone, Smart watch, Laptop , Headphones ;");
        System.out.print("Выберите девавйс которые вам надо:");
    }

}