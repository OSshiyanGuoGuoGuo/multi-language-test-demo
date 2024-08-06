public class RenameMiss {
    public String location;

    public String foo(){
        getLocation();
    }
    public String bar(){
        getLocation();
    }

    public String getLocation() {
        return location;
    }
}