package info;


import helper.CityMap;

import java.text.SimpleDateFormat;

public class DeliveryInfo implements Info {

    //TODO SET ID Before Storing in RAM
    public final static SimpleDateFormat sdf = new SimpleDateFormat("MMM DD YYYY");
    enum DeliveryStatus {
        Pending, Assigned, Delivered
    }
    private int id;
    private int customerId;
    private String productName;
    private int amount;
    private double weight;
    private CityMap.City from;
    private CityMap.City to;
    private DeliveryStatus deliveryStatus= DeliveryStatus.Pending;
    private PricingOptionInfo pricingOptionInfo;

    public void setPricingOptionInfo(PricingOptionInfo pricingOptionInfo) {
        this.pricingOptionInfo = pricingOptionInfo;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

    public CityMap.City getFrom() {
        return from;
    }

    public CityMap.City getTo() {
        return to;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public PricingOptionInfo getPricingOptionInfo() {
        return pricingOptionInfo;
    }

    public DeliveryInfo(int customerId, String productName, int amount, double weight, CityMap.City from, CityMap.City to) {
        this.customerId = customerId;
        this.productName = productName;
        this.amount = amount;
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

    //Fitsum Constructor
    public DeliveryInfo(){

    }

    @Override
    public void toMap(){

    }
}