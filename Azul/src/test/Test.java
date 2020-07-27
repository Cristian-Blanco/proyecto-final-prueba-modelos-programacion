package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Test {

	private JFrame frame;
	static boolean state=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel.setBounds(36, 36, 500, 330);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(98, 23, 40, 40);
		panel.add(btnNewButton);
		btnNewButton.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton_1.setBounds(88, 76, 50, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(33, 76, 50, 25);
		panel.add(btnNewButton_1_1);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel2.setBounds(36, 387, 500, 330);
		frame.getContentPane().add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel3.setBounds(574, 50, 278, 627);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		
		JPanel panel_1_0 = new JPanel();
		panel_1_0.setBounds(23, 13, 104, 93);
		panel3.add(panel_1_0);
		panel_1_0.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btn1 = new JButton("");
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				changeState(Test.state);
				btnNewButton.setVisible(Test.state);
				

			}
		});

		btn1.setBackground(Color.RED);
		panel_1_0.add(btn1);
		
		JButton btn2 = new JButton("");
		panel_1_0.add(btn2);
		
		JButton btn3 = new JButton("");
		panel_1_0.add(btn3);
		
		JButton btn4 = new JButton("");
		panel_1_0.add(btn4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(150, 13, 104, 93);
		panel3.add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(23, 134, 104, 93);
		panel3.add(panel_1_2);
		panel_1_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(150, 134, 104, 93);
		panel3.add(panel_1_3);
		panel_1_3.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(23, 251, 104, 93);
		panel3.add(panel_1_4);
		panel_1_4.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBounds(150, 251, 104, 93);
		panel3.add(panel_1_3_1);
		panel_1_3_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1_3_2 = new JPanel();
		panel_1_3_2.setBounds(23, 371, 104, 93);
		panel3.add(panel_1_3_2);
		panel_1_3_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1_3_3 = new JPanel();
		panel_1_3_3.setBounds(150, 371, 104, 93);
		panel3.add(panel_1_3_3);
		panel_1_3_3.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1_3_4 = new JPanel();
		panel_1_3_4.setBounds(23, 490, 104, 93);
		panel3.add(panel_1_3_4);
		panel_1_3_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel4.setBounds(881, 36, 140, 690);
		frame.getContentPane().add(panel4);
	}
	public void changeState(boolean state) {
		int op = JOptionPane.showConfirmDialog(null, "Seguro?");
		
		if(op==0) {
			Test.state=!Test.state;
		}
	}
}
