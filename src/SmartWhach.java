public class SmartWhach extends ElectronikDevice{
    String strapColor;
    String nameModel;

    @Override
    void displayInfo() {
        System.out.println("это умные часы ");
    }

    @Override
    void Info() {
        System.out.println("Эти часы из компаний Apple ");
    }

    void parametr(){
        System.out.println("Название чесов "+nameModel);
        System.out.println("Он исползует "+ chargerWolt+" Wolt при зарядке");
        System.out.println("он создан в "+Year+" году ");
        System.out.println("Ремешок "+strapColor+" цвета ");
    }
}
