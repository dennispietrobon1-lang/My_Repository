public class BuddyInfo {

    private String name;
    private String phone;
    private String address;

    public BuddyInfo(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public BuddyInfo() {
        new BuddyInfo("John", "111111111", "123 John Street");
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }






    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer", "111111111", "123 Homer Street");
        System.out.println("Hello " + homer.getName());
    }
}
