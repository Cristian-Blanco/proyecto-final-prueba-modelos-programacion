package model;

import javax.swing.JPanel;

public class PlayerBoard extends JPanel{
	private int ID;
	
	public PlayerBoard(int ID) {
		this.ID=ID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	

}
