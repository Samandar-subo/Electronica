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

}