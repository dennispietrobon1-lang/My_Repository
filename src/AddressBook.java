import java.util.List;
import java.util.ArrayList;

public class AddressBook {

    private List<BuddyInfo> list;

    public AddressBook(){
        list = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        list.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        list.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Adress Book");
    }
}
