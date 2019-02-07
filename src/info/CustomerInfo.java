package info;

public class CustomerInfo implements Info {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;

    public CustomerInfo(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    //Fitsum Constructor

    public CustomerInfo(){

    }
    @Override
    public void toMap() {

    }
}
