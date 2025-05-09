public class Headphones extends ElectronikDevice{
    private String model;
    private String name;
    int Yea;
    int prese;

    public Headphones (String name,String model,int prese,int Yea){
        this.name=name;
        this.model=model;
        price=prese;
        Year=Yea;

    }

    void Informa(){
        System.out.println("Наушник из бренда "+name);
        System.out.println("Модел наушников называется "+model);
        System.out.println("Наушники созданы в "+Year+" году");
        System.out.println("Наушник стоит "+price+" тг");
    }

}