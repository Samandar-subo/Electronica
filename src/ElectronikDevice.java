public class ElectronikDevice {
    public int Year;
    public int price;

    public void setPrice(int price) {
        this.price = price;
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

    void print(){
        System.out.println();
        System.out.println("Добро пожаловат в наш могазин электроники");
        System.out.println("у нас на данный есть эти девайсы Phone, Smart watch, Laptop , Headphones ;");
        System.out.print("Выберите девавйс которые вам надо:");
    }

}