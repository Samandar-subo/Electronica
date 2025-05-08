public class Headphones extends ElectronikDevice{
    String model;
    String name;

    void Informa(){
        System.out.println("Наушник из бренда "+name);
        System.out.println("Модел наушников называется "+model);
        System.out.println("Наушники созданы в "+Year+" году");
        System.out.println("Наушник стоит "+price+" тг");
    }

}