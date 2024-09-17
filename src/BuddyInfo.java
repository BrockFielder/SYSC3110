import java.util.ArrayList; 

public class BuddyInfo {
    private String name;
    private String address;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = address;


    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BuddyInfo buddy = new BuddyInfo("Jan", "Oshawa", "990055905");
        AddressBook buddybook = new AddressBook();
        buddybook.addBuddy(buddy);
        buddybook.removeBuddy(buddy);

    }
}

