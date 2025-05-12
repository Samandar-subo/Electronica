public class SmartWhach extends ElectronikDevice{
    private String nameModel;
    private String Color;

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getNameModel() {
        return nameModel;
    }

    public String getColor() {
        return Color;
    }

    public SmartWhach (String nameModel, String Color, int price, int Year){
        setPrice(price);
        setNameModel(nameModel);
        setColor(Color);
        setYear(Year);

    }

    void inform(){
        System.out.println("Эти часы называется "+getNameModel());
        System.out.println("Эти смарт часы созданы в "+getYear()+" году");
        System.out.println("В этих часов цвет ремешка "+getColor());
        System.out.println("Эти часы стоит "+getPrice()+" тг");
        checkPrice();
    }

}