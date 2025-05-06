public class Laptop  extends  ElectronikDevice{
    String lapname;
    String modelLap;

    @Override
    void displayInfo() {
        System.out.println("Этот ноутбук называется  ");
    }

    @Override
    void infoYears(){
        System.out.println("Этот Ноутбук в"+(Year+4)+" году можеть быть не пригоден к исползование ");
    }



    void par (){
        System.out.println(lapname+" "+modelLap);
        System.out.println("Этот ноутбук создан в "+Year+" году и стоит "+price+" тг");
    }
}