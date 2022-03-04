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
}
