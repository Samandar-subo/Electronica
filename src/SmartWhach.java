public class SmartWhach extends ElectronikDevice{
    private String nameModel;
    private String Color;
    int yars;
    int pase;

    public SmartWhach (String nameModel, String Color,int pase,int yars){
        this.nameModel=nameModel;
        this.Color=Color;
        price=pase;
        Year=yars;

    }

    void Inform(){
        System.out.println("Эти часы называется "+nameModel);
        System.out.println("Эти смарт часы созданы в "+Year+" году");
        System.out.println("В этих часов цвет ремешка "+Color);
        System.out.println("Эти часы стоит "+price+" тг");
    }

}