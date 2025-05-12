public class Phone extends ElectronikDevice {
     private String model ;


     public Phone(String model,int Year,int price){
         this.price=price;
         this.model=model;
         this.Year=Year;}

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    void Infor(){
        System.out.println("Модел телефона "+model);
        System.out.println("Телефон быль создан "+Year);
        System.out.println("В нашем магазине телфон стоит "+price+" тг");
    }

}