import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> collection;

    public AddressBook() {
        collection = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        collection.add(buddy);
    }

    public ArrayList<BuddyInfo> getCollection() {
        return collection;
    }

    public void removeBuddy(BuddyInfo buddy) {
        collection.remove(buddy);
    }


public static void main(String[] args) {
    System.out.println("Address Book!!!!!!!!!");
    AddressBook Book1= new AddressBook();


}
}


