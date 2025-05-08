public class Laptop  extends  ElectronikDevice{
    String laptopname;
    String LapModel;

    void Infomation(){
        System.out.println("Ноутбук из комапний "+laptopname);
        System.out.println("Названмие Ноутбука "+LapModel);
        System.out.println("Ноутбук создан в "+Year+" году ");
        System.out.println("Ноутбук стоит "+price+" тг ");
    }
}