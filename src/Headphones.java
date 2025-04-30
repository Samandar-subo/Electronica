public class Headphones extends ElectronikDevice{
    String name;
    String model;

    @Override
    void displayInfo() {
        System.out.println("Это блютуз наушники");
    }
    @Override
    void Info(){
        System.out.println(5+5);
    }

    void Information(){
        System.out.println(name+" "+model+" стоит "+price+" tg");
        System.out.println("Он исползует "+ chargerWolt+" Wolt при зарядке");
        System.out.println("он создан в "+Year+" году ");
    }

}
