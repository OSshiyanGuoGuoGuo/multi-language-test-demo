public class RenameMiss {
    public String location;
    public String address;

    public String foo(){
        getAddress();
    }
    public String bar(){
        getAddress();
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }
}