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

    //changes

    //Changes again





    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer", "111111111", "123 Homer Street");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(homer);
        addressbook.removeBuddy(homer);
    }

    private void doNothing(){
        return;
    }
}
