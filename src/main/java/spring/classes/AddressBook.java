package spring.classes;

import javax.persistence.OneToMany;
import javax.swing.*;


public class AddressBook extends DefaultListModel<BuddyInfo> {

    public AddressBook(){

    }

    @OneToMany
    public void addBuddy(BuddyInfo add) {
        if(add != null){
            this.addElement(add);
        }
    }

    public void removeBuddy(int index) {
        if(index >= 0 && index < this.size()) {
            this.remove(index);
        }
    }

    public void printBuddyInfo() {
        for(int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i).toString());
        }
    }

    public int getSize() {
        return this.size();
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Noah", "Ottawa", "613");
        addressBook.addBuddy(buddy1);
        BuddyInfo buddy2 = new BuddyInfo("Tim", "Toronto", "613");
        addressBook.addBuddy(buddy2);
        BuddyInfo buddy3 = new BuddyInfo("Dan", "Toronto", "613");
        addressBook.addBuddy(buddy3);
        addressBook.printBuddyInfo();
    }
}
