package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class Board_beta {

	private JFrame frame;
	private boolean state=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board_beta window = new Board_beta();
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
	public Board_beta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1320, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel.setBounds(35, 35, 494, 252);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(44, 115, 97, 25);
		btnNewButton_4.setVisible(state);
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(780, 35, 494, 252);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(35, 350, 494, 252);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(780, 350, 494, 252);
		frame.getContentPane().add(panel_3);
		
		JButton btnFinish = new JButton("Continuar");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnFinish.setBounds(600, 590, 97, 25);
		frame.getContentPane().add(btnFinish);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(555, 35, 198, 506);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(5, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_5.add(btnNewButton_3);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.add(panel_13);
	}
}
