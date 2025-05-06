public class Headphones extends ElectronikDevice{
    String name;// имя произвадителя
    String model;

    @Override
    void displayInfo() {
        System.out.println("Это блютуз наушники.");
    }

    @Override
    void Info(){
        System.out.println("этот наушник работает толка через блютуз ");
    }

    @Override
    void infoYears(){
        System.out.println("Эти Наушник в"+(Year+4)+" году можеть быть не пригоден к исползование ");
    }

    void Information(){
        System.out.println(name+" "+model+" стоит "+price+" tg.");
        System.out.println("он создан в "+Year+" году. ");
    }

}