package model;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Tester {

	private JFrame frame;

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
		PllayerBoard boardTestA = new PllayerBoard();
		boardTestA.setBounds(35, 35, 494, 252);
		frame.getContentPane().add(boardTestA);
		PllayerBoard boardTestB = new PllayerBoard();
		boardTestB.setBounds(780, 35, 494, 252);
		frame.getContentPane().add(boardTestB);
		PllayerBoard boardTestC = new PllayerBoard();
		boardTestC.setBounds(35, 350, 494, 252);
		frame.getContentPane().add(boardTestC);
		PllayerBoard boardTestD = new PllayerBoard();
		boardTestD.setBounds(780, 350, 494, 252);
		frame.getContentPane().add(boardTestD);
	}

}
