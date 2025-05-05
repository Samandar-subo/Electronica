public class SmartWhach extends ElectronikDevice{
    String Manuname ;
    String nameModel;

    @Override
    void displayInfo() {
        System.out.println("это умные часы. ");
    }


    @Override
    void Info() {
        System.out.println("Эти часы из компаний Apple.");
    }

    void parametr(){
        System.out.println("Название чесов "+nameModel);
        System.out.println("он создан в "+Year+" году .");
        System.out.println(" Прозвадител  часов "+Manuname+" ");
    }
}
