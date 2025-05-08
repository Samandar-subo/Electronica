public class SmartWhach extends ElectronikDevice{
    String nameModel;
    String Color;

    void Inform(){
        System.out.println("Эти часы называется "+nameModel);
        System.out.println("Эти смарт часы созданы в "+Year+" году");
        System.out.println("В этих часов цвет ремешка "+Color);
        System.out.println("Эти часы стоит "+price+" тг");
    }

}