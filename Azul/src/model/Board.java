package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import proxy.*;

public class Board extends JFrame{
	public List<JPanel> playerBoard = new ArrayList<>();
	private PlayerBoard player;
	private IVisible proxie = new VisibleProxy();
	private static Score puntaje = new Score();
	public Board() {
		super();
		initialize();
	}
	private void initialize() {
		setBounds(100, 100, 1320, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		addPanel(this.proxyComprobation());
		JButton btnFinish = new JButton("Continuar");
		btnFinish.setBounds(560, 595, 97, 25);
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				puntaje.setVisible(true);
				changeVisibility();
			}
		});
		getContentPane().add(btnFinish);
		
		
	}
	public void changeVisibility() {
		setVisible(false);
	}
	public int proxyComprobation() {
		boolean state=true;
		int size=0;
		while(true) {
			String ammount = JOptionPane.showInputDialog("Cuantos jugadores van a jugar?");
			size = Integer.parseInt(ammount);
			state=proxie.isVisible(size);
			if(state) {
				break;
			}
		}
		System.out.println(size);
		return size;
	}
	public void addPanel(int size) {
		int posx=35;
		int posy=35;
		JPanel panel;
		for(int i=0;i<size;i++) {
			panel = new JPanel();
			panel.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
			panel.setBounds(posx, posy, 494, 252);
			
			this.playerBoard.add(panel);
			add(playerBoard.get(i));
			if(i%2==0) {
				posx=780;
			}else {
				posx=35;
			}
			if(i==2 || i==1) {
				posy=370;
			}else {
				posy=35;
			}
			
		}
	}
	
}
