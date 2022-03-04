package spring.classes;

import spring.classes.AddressBook;
import spring.classes.BuddyInfo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class MainFrame extends JFrame implements ActionListener
{


	private AddressBook addressBook;
	private JList<BuddyInfo> list;


	public void init() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(new Dimension(600, 400));
		add(list);
		setVisible(true);
		setState(Frame.NORMAL);
		show();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		System.out.println(e.getActionCommand());
		
		if(e.getActionCommand().equals("Create")) {
			addressBook.clear();;
		}
		else if(e.getActionCommand().contentEquals("View")) {
			list.setVisible(true);
		}
		else if(e.getActionCommand().contentEquals("Add")) {
			String name = JOptionPane.showInputDialog("Enter name");
			String address = JOptionPane.showInputDialog("Enter Address");
			String number = JOptionPane.showInputDialog("Enter Phone Number");
			addressBook.addBuddy(new BuddyInfo(name, address, number));
		}
		else if(e.getActionCommand().contentEquals("Remove")) {
			addressBook.remove(list.getSelectedIndex());
		}
	}

	public JList<BuddyInfo> getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public void setAddressBook(AddressBook addressBook) {
		this.addressBook = addressBook;
	}
}

