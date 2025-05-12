public class SmartWhach extends ElectronikDevice{
    private String nameModel;
    private String Color;


    public SmartWhach (String nameModel, String Color,int price,int Year){
        this.price=price;
        this.nameModel=nameModel;
        this.Color=Color;
        this.Year=Year;

    }

    void Inform(){
        System.out.println("Эти часы называется "+nameModel);
        System.out.println("Эти смарт часы созданы в "+Year+" году");
        System.out.println("В этих часов цвет ремешка "+Color);
        System.out.println("Эти часы стоит "+price+" тг");
    }

}