public class Laptop  extends  ElectronikDevice{
    private String laptopname;
    private String LapModel;


    public Laptop(String laptopname,String LapModel,int Year,int price){
        this.laptopname=laptopname;
        this.LapModel=LapModel;
        this.Year=Year;
        this.price=price;
    }

    void Infomation(){
        System.out.println("Ноутбук из комапний "+laptopname);
        System.out.println("Названмие Ноутбука "+LapModel);
        System.out.println("Ноутбук создан в "+Year+" году ");
        System.out.println("Ноутбук стоит "+price+" тг ");
    }
}