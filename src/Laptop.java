public class Laptop  extends  ElectronikDevice{
    String lapname;
    String modelLap;

    @Override
    void displayInfo() {
        System.out.println("Этот ноутбук называется  ");
    }

    void par (){
        System.out.println(lapname+" "+modelLap);
    }
}
