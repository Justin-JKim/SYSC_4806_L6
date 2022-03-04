package spring.classes;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuItem extends JMenuItem {

    ActionListener listener;

    public MenuItem(String text){
        super(text);
    }

    public void init(){
        addActionListener(listener);
    }


    public void setListener(ActionListener listener) {
        this.listener = listener;
    }
}
