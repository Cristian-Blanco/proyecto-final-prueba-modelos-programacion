package model;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextField;

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
	/*
	 * public void putTilesRighBoard(LeftBrick[][] rmbricks, String color)
	 */
	
	public void putTilesRighBoard(int sessionID, JTextField txtTurn, int playerSize) {
		
		addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				switch(playerSize) {
				case 2:
					if(sessionID==0) {
						txtTurn.setText(String.valueOf("1"));
						Tester.turn=1;
					}else if(sessionID==1) {
						txtTurn.setText(String.valueOf("0"));
						Tester.turn=0;
					}
					break;
				case 3:
					if(sessionID==0) {
						txtTurn.setText(String.valueOf("1"));
						Tester.turn=1;
					}else if(sessionID==1) {
						txtTurn.setText(String.valueOf("2"));
						Tester.turn=2;
					}
					else if(sessionID==2) {
						txtTurn.setText(String.valueOf("0"));
						Tester.turn=0;
					}
					break;
				case 4:
					if(sessionID==0) {
						System.out.println(txtTurn.getText());
						txtTurn.setText(String.valueOf("1"));
						Tester.turn=1;
					}else if(sessionID==1) {
						txtTurn.setText(String.valueOf("2"));
						Tester.turn=2;
					}
					else if(sessionID==2) {
						txtTurn.setText(String.valueOf("3"));
						Tester.turn=3;
					}
					else if(sessionID==3) {
						txtTurn.setText(String.valueOf("0"));
						Tester.turn=0;
					}
					break;
				}
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
		
		/*addMouseListener(new MouseListener(){
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
						rmbricks[getRow()][pos].setEnabled(false);
					break;
					case "Blue":
						for(int i=0;i<5;i++) {
							if(rmbricks[getRow()][i].getTitle().equalsIgnoreCase("Blue")){
								pos=i;
							}
						}
						rmbricks[getRow()][pos].setColour(Color.BLUE);
						rmbricks[getRow()][pos].doBackgroundColor();
						rmbricks[getRow()][pos].setEnabled(false);
	
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
						rmbricks[getRow()][pos].setEnabled(false);
					break;
					case "Red":
						for(int i=0;i<5;i++) {

							if(rmbricks[getRow()][i].getTitle().equalsIgnoreCase("Red")){
								pos=i;
								
							}
							
						}
						rmbricks[getRow()][pos].setColour(Color.RED);
						rmbricks[getRow()][pos].doBackgroundColor();
						rmbricks[getRow()][pos].setEnabled(false);
					break;
					case "Black":
						for(int i=0;i<5;i++) {
							if(rmbricks[getRow()][i].getTitle().equalsIgnoreCase("Black")){
								pos=i;
								
							}
						}
						rmbricks[getRow()][pos].setColour(Color.BLACK);
						rmbricks[getRow()][pos].doBackgroundColor();
						rmbricks[getRow()][pos].setEnabled(false);
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
			
		});	*/
	}
	
}
