import java.time.Year;

public class Headphones extends ElectronikDevice{
    private String model;
    private String name;


    public Headphones (String name,String model,int price,int Year){
        this.price=price;
        this.name=name;
        this.model=model;
        this.Year= Year;

    }

    void Informa(){
        System.out.println("Наушник из бренда "+name);
        System.out.println("Модел наушников называется "+model);
        System.out.println("Наушники созданы в "+Year+" году");
        System.out.println("Наушник стоит "+price+" тг");
    }

}