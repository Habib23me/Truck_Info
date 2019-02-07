package info;

public class AuthInfo implements Info {
    private String username;
    private String password;

    public AuthInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void toMap() {

    }

// AuthInfo authInfoBuilder= new AuthInfo.Builder().setPassword("").setUsername("").build();




}
