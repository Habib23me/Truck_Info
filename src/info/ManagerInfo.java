package info;

public class ManagerInfo implements Info {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private int companyId;
    private AuthInfo authInfo;

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

    public int getCompanyId() {
        return companyId;
    }

    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    //Don't Store
    public ManagerInfo(String firstName, String lastName, String phone, AuthInfo authInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.authInfo=authInfo;
    }

    //Fistum
    public ManagerInfo(){

    }

    @Override
    public void toMap() {

    }
}
