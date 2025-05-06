public class SmartWhach extends ElectronikDevice{
    String Manuname ;// Имя произвадителя
    String nameModel;

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    void displayInfo() {
        System.out.println("это умные часы. ");
    }

    @Override
    void Info() {
        System.out.println("Эти часы из компаний Apple.");
    }

    @Override
    void infoYears(){
        System.out.println("Эти умные часы в "+(Year+4)+" году можеть быть не пригоден к исползование ");
    }


    void parametr(){
        System.out.println("Название чесов "+nameModel);
        System.out.println("он создан в "+Year+" году .");
        System.out.println(" Прозвадител  часов "+Manuname+" ");
        System.out.println("этот часы стоит "+price+" tg");
    }
}