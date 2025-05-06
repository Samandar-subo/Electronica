abstract class ElectronikDevice {
    int Year;
    int price;

    public void setYear(int year) {
        Year = year;
    }
    public void setPrice(int price){
        this.price=price;
    }

    abstract void infoYears();

    void displayInfo() {
        System.out.println("Электронное устройство. ");
    }
    void Info (){
        System.out.println("Это всё электронные дивайсы .");
    }
}