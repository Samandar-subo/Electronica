import java.sql.SQLOutput;

public class Phone extends ElectronikDevice {
    String model ;

    @Override
    void displayInfo() {
        System.out.println("Это айфон.");
    }

    @Override
    void Info() {
        System.out.println("Этот телефон очень дарагой не пакупайте.");
    }

    void parametrs(){
        System.out.println(model+" стоит "+price+" tg.");
        System.out.println("Он исползует "+ chargerWolt+" Wolt при зарядке.");
    }
}
