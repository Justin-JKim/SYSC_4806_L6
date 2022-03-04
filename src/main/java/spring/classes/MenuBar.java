package spring.classes;

import javax.swing.*;

public class MenuBar extends JMenuBar {


    private JMenu menu;

    public void init() {
        add(menu);
    }

    public void setMenu(JMenu menu) {
        this.menu = menu;
    }

    public JMenu getMenu() {
        return menu;
    }
}
