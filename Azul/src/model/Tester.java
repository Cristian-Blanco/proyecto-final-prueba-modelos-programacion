package model;

import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;

public class Tester {

	private JFrame frame;
	public static int players;
	public static int turn=0;
	private JTextField textField;
	public static ArrayList<PllayerBoard> player = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tester window = new Tester();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tester() {
		textField = new JTextField();
		frame = new JFrame();
		frame.setBounds(100, 100, 1320, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		textField.setBounds(595, 0, 116, 22);
		textField.setText(String.valueOf(0));
		textField.setEditable(false);
		
		
		PllayerBoard boardTestA = new PllayerBoard(this.getTextField(),0,4);
		boardTestA.setBounds(35, 35, 494, 252);
		player.add(boardTestA);
		frame.getContentPane().add(boardTestA);
		PllayerBoard boardTestB = new PllayerBoard(this.getTextField(),1,4);
		boardTestB.setBounds(780, 35, 494, 252);
		player.add(boardTestB);
		frame.getContentPane().add(boardTestB);
		PllayerBoard boardTestC = new PllayerBoard(this.getTextField(),2,4);
		boardTestC.setBounds(35, 350, 494, 252);
		player.add(boardTestC);
		frame.getContentPane().add(boardTestC);
		PllayerBoard boardTestD = new PllayerBoard(this.getTextField(),3,4);
		boardTestD.setBounds(780, 350, 494, 252);
		player.add(boardTestD);
		frame.getContentPane().add(boardTestD);
		System.out.println(player.size());
		initalizeButton();
		
		
		
		frame.getContentPane().add(textField);
		
		textField.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				switch(player.size()) {
				case 2:
					/*
					 * 
					 * 
					 * 
					 */
					break;
				case 3:
					/*
					 * 
					 * 
					 * 
					 */
					break;
				case 4:
					if(turn==0) {
						System.out.println(turn);

						boardTestA.getMapButton().get(0).setEnabled(false);
						boardTestB.getMapButton().get(0).setEnabled(true);

					}else if(turn==1) {
						for(Component component : player.get(1).getComponents()) {
							component.setEnabled(false);
						}
						for(Component component : player.get(2).getComponents()) {
							component.setEnabled(true);
						}
					}else if(turn==2) {
						for(Component component : player.get(2).getComponents()) {
							component.setEnabled(false);
						}
						for(Component component : player.get(3).getComponents()) {
							component.setEnabled(true);
						}
						
					}else if(turn==3) {
						for(Component component : player.get(3).getComponents()) {
							component.setEnabled(false);
						}
						for(Component component : player.get(0).getComponents()) {
							component.setEnabled(true);
						}
						
					}
					break;
					
				}
			
				
				
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				switch(player.size()) {
				case 2:
					/*
					 * 
					 * 
					 * 
					 */
					break;
				case 3:
					/*
					 * 
					 * 
					 * 
					 */
					break;
				case 4:
					if(turn==0) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for(int i=0;i<5;i++) {
							player.get(0).getMapButton().get(i).setEnabled(false);
						}
						player.get(0).getTextField().setEnabled(false);
						for(int i=0;i<5;i++) {
							player.get(1).getMapButton().get(i).setEnabled(true);
						}
						player.get(1).getTextField().setEnabled(true);
					}else if(turn==1) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for(int i=0;i<5;i++) {
							player.get(1).getMapButton().get(i).setEnabled(false);
						}
						player.get(1).getTextField().setEnabled(false);
						for(int i=0;i<5;i++) {
							player.get(2).getMapButton().get(i).setEnabled(true);
						}
						player.get(2).getTextField().setEnabled(true);
					}else if(turn==2) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for(int i=0;i<5;i++) {
							player.get(2).getMapButton().get(i).setEnabled(false);
						}
						player.get(2).getTextField().setEnabled(false);
						for(int i=0;i<5;i++) {
							player.get(3).getMapButton().get(i).setEnabled(true);
						}
						player.get(3).getTextField().setEnabled(true);
						
					}else if(turn==3) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for(int i=0;i<5;i++) {
							player.get(3).getMapButton().get(i).setEnabled(false);
						}
						player.get(3).getTextField().setEnabled(false);
						for(int i=0;i<5;i++) {
							player.get(0).getMapButton().get(i).setEnabled(true);
						}
						player.get(0).getTextField().setEnabled(true);
						
					}
					break;
					
				}
				
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				switch(player.size()) {
				case 2:
					/*
					 * 
					 * 
					 * 
					 */
					break;
				case 3:
					/*
					 * 
					 * 
					 * 
					 */
					break;
				case 4:
					if(turn==0) {
						System.out.println(turn);

						boardTestA.getMapButton().get(0).setEnabled(false);
						boardTestB.getMapButton().get(0).setEnabled(true);

					}else if(turn==1) {
						for(Component component : player.get(1).getComponents()) {
							component.setEnabled(false);
						}
						for(Component component : player.get(2).getComponents()) {
							component.setEnabled(true);
						}
					}else if(turn==2) {
						for(Component component : player.get(2).getComponents()) {
							component.setEnabled(false);
						}
						for(Component component : player.get(3).getComponents()) {
							component.setEnabled(true);
						}
						
					}else if(turn==3) {
						for(Component component : player.get(3).getComponents()) {
							component.setEnabled(false);
						}
						for(Component component : player.get(0).getComponents()) {
							component.setEnabled(true);
						}
						
					}
					break;
					
				}
				
			}

		});
		
		Tester.players=4;
	
	}
	
	public void initalizeButton() {
		for(int i=1;i<4;i++) {
			for(int j=0;j<player.get(i).getMapButton().size();j++) {
				player.get(i).getMapButton().get(j).setEnabled(false);
			}
		}
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
}
