public class Phone extends ElectronikDevice {
     private String model ;
     private int years;
     private int prise;

     public Phone(String model,int yers,int prise){
         this.model=model;
         price=prise;
         Year=yers;

     }


    void Infor(){
        System.out.println("Модел телефона "+model);
        System.out.println("Телефон быль создан "+Year);
        System.out.println("В нашем магазине телфон стоит "+price+" тг");
    }

}