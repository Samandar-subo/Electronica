public class Headphones extends ElectronikDevice{
    String name;
    String model;

    @Override
    void displayInfo() {
        System.out.println("Это блютуз наушники.");
    }

    @Override
    void Info(){
        System.out.println("Simson");
    }

    void Information(){
        System.out.println(name+" "+model+" стоит "+price+" tg.");
        System.out.println("он создан в "+Year+" году. ");
    }

}
