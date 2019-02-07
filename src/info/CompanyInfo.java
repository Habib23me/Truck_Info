package info;

public class CompanyInfo implements Info{
    private int id;
    private String name;
    private double customerSatisfaction;
    private int numberOfDeliveries;
    private String phone;
    private double pricePerKg;
    private double pricePerKm;

    public CompanyInfo(String name, String phone, double pricePerKg, double pricePerKm) {
        this.name = name;
        this.phone = phone;
        this.pricePerKg = pricePerKg;
        this.pricePerKm = pricePerKm;
    }
    public CompanyInfo(){

    }
    @Override
    public void toMap() {

    }
}
