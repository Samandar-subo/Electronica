public class Laptop  extends  ElectronikDevice{
    private String laptopname;
    private String LapModel;

    public void setLaptopname(String laptopname){
        this.laptopname=laptopname;
    }

    public void setLapModel(String lapModel) {
        LapModel = lapModel;
    }

    public String getLaptopname() {
        return laptopname;
    }

    public String getLapModel() {
        return LapModel;
    }

    public Laptop(String laptopname, String LapModel, int Year, int price){
        setLaptopname(laptopname);
        setLapModel(LapModel);
        setPrice(price);
        setYear(Year);
    }

    void infomation(){
        System.out.println("Ноутбук из комапний "+getLaptopname());
        System.out.println("Названмие Ноутбука "+getLapModel());
        System.out.println("Ноутбук создан в "+getYear()+" году ");
        System.out.println("Ноутбук стоит "+getPrice()+" тг ");
    }
}