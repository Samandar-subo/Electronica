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

    @Override
    void infoYears(){
        System.out.println("Этот телфон в "+(Year+4)+" году можеть быть не пригоден к исползование ");
    }

    void parametrs(){
        System.out.println(model+" стоит "+price+" tg.");
        System.out.println("Этот модел телефона создона в "+Year+" года");
    }
}