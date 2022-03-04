package spring.classes;

import javax.swing.*;

public class Menu extends JMenu {

    JMenuItem item1;
    JMenuItem item2;

    public Menu(String text){
        super(text);
    }

    public void init() {
        add(item1);
        add(item2);
    }

    public void setItem1(JMenuItem item1) {
        this.item1 = item1;
    }

    public void setItem2(JMenuItem item2) {
        this.item2 = item2;
    }
}
