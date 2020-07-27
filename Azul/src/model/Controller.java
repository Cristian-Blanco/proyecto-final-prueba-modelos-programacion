package model;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		begin();
	}
	public static void begin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu menu=MainMenu.getInstance();
					if(menu!=null) {
						menu.setVisible(true);
					}else {
						JOptionPane.showInternalMessageDialog(menu, "Ha ocurrido un error");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
