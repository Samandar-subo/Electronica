public class ElectronikDevice {
    public int Year;
    public int price;

    public void setPrice(int price) {
        this.price = price;
        if(price<=0){
            price=0;
        }
    }

    void Print(){
        System.out.println();
        System.out.println("Добро пожаловат в наш могазин электроники");
        System.out.println("у нас на данный есть эти девайсы Phone, Smart watch, Laptop , Headphones ;");
        System.out.print("Выберите девавйс которые вам надо:");
    }

}