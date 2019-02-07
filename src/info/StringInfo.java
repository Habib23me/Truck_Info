package info;

public class StringInfo implements Info {
    private String info;

    public String getInfo() {
        return info;
    }

    public StringInfo(String info){
        this.info=info;
    }
    @Override
    public void toMap() {

    }
}
