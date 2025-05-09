public class Laptop  extends  ElectronikDevice{
    private String laptopname;
    private String LapModel;
     int gd;
     int dengi;

    public Laptop(String laptopname,String LapModel,int gd,int dengi){
        this.laptopname=laptopname;
        this.LapModel=LapModel;
        Year=gd;
        price=dengi;
    }

    void Infomation(){
        System.out.println("Ноутбук из комапний "+laptopname);
        System.out.println("Названмие Ноутбука "+LapModel);
        System.out.println("Ноутбук создан в "+Year+" году ");
        System.out.println("Ноутбук стоит "+price+" тг ");
    }
}