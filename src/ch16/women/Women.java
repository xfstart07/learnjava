package ch16.women;

public class Women implements IWomen {

    private int type=0;
    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type;
        this.request = _request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
