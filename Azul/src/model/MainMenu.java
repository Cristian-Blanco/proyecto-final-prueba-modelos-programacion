package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private static MainMenu frame;


	private MainMenu() {
		super();
		initialize();
	}
	

	/**
	 * Create the frame.
	 */
	public void initialize() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		System.out.println("hola");
		JButton btnStart = new JButton("Start");
		btnStart.setBackground(new Color(173, 255, 47));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Board window = new Board();
				window.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnStart.setBounds(161, 181, 97, 25);
		contentPane.add(btnStart);
	}
	public static MainMenu getInstance() {
		if(frame==null) {
			frame=new MainMenu();
		}
		return frame;
	}


}
