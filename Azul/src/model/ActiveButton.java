package model;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class ActiveButton extends JButton{
	private boolean state;
	private int row;
	public ActiveButton(int row) {
		super();
		state=false;
		setVisible(true);
		this.row=row;
	}
	
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void updateButton() {
		setVisible(this.isState());
	}
	
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void putTilesRighBoard(LeftBrick[][] rmbricks, String color) {
		
		addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int pos=0;
				String aux="";
				switch(color) {
					case "Yellow":
						for(int i=0;i<5;i++) {
							
							aux=rmbricks[getRow()][i].getTitle();
							if(aux.equalsIgnoreCase(color)){
								pos=i;
							}
							
						}
	
						rmbricks[getRow()][pos].setColour(Color.YELLOW);
						rmbricks[getRow()][pos].doBackgroundColor();
					break;
					case "Blue":
						for(int i=0;i<5;i++) {
							if(rmbricks[getRow()][i].getTitle().equalsIgnoreCase("Blue")){
								pos=i;
							}
						}
						rmbricks[getRow()][pos].setColour(Color.BLUE);
						rmbricks[getRow()][pos].doBackgroundColor();
	
					break;
					case "Green":
						for(int i=0;i<5;i++) {
							System.out.println(rmbricks[getRow()][i].getTitle());
							if(rmbricks[getRow()][i].getTitle().equalsIgnoreCase("Green")){
								pos=i;
								
							}
						}
						rmbricks[getRow()][pos].setColour(Color.GREEN);
						rmbricks[getRow()][pos].doBackgroundColor();
					break;
					case "Red":
						for(int i=0;i<5;i++) {

							if(rmbricks[getRow()][i].getTitle().equalsIgnoreCase("Red")){
								pos=i;
								
							}
							
						}
						rmbricks[getRow()][pos].setColour(Color.RED);
						rmbricks[getRow()][pos].doBackgroundColor();
					break;
					case "Black":
						for(int i=0;i<5;i++) {
							if(rmbricks[getRow()][i].getTitle().equalsIgnoreCase("Black")){
								pos=i;
								
							}
						}
						rmbricks[getRow()][pos].setColour(Color.BLACK);
						rmbricks[getRow()][pos].doBackgroundColor();
					break;
					
				}	
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});;	
	}
	
}
