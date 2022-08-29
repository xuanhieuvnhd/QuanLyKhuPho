import java.util.List;

public class Family {
    private List<Person> presons;
    private String address;

    public Family(List<Person> presons, String address) {
        this.presons = presons;
        this.address = address;
    }

    public List<Person> getPresons() {
        return presons;
    }

    public void setPresons(List<Person> presons) {
        this.presons = presons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Ho dan{" +
                "So nha: " + presons +
                ", Dia chi: '" + address + '\'' +
                '}';
    }
}
