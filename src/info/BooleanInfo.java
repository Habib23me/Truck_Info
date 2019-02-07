package info;

public class BooleanInfo implements Info {
    private boolean info;

    public BooleanInfo(boolean info) {
        this.info = info;
    }

    public boolean getInfo() {
        return info;
    }

    @Override
    public void toMap() {

    }
}
