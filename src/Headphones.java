public class Headphones extends ElectronikDevice{
    private String model;
    private String name;

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public Headphones (String name, String model, int price, int Year){
        setYear(Year);
        setName(name);
        setModel(model);
        setPrice(price);

    }

    void informa(){
        System.out.println("Наушник из бренда "+getName());
        System.out.println("Модел наушников называется "+getModel());
        System.out.println("Наушники созданы в "+getYear()+" году");
        System.out.println("Наушник стоит "+getPrice()+" тг");
        checkPrice();
    }

}