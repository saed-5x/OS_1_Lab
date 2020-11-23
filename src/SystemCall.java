public class SystemCall {


    private int identifier;
    private Object [] Data;


    public SystemCall(int id, Object[] data) {
        Data=data;
        identifier=id;

    }

    public int getId(int id) {
        return identifier;
    }

    public Object[] getData() {
        return Data;
    }


}
