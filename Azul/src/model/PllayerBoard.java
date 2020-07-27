package model;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;

public class PllayerBoard extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PllayerBoard() {
		setLayout(null);
		setBounds(0, 0, 494, 252);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 234, 180);
		add(panel);
		panel.setLayout(null);
		
		ArrayList<JLabel> labelList = new ArrayList<>();
		int indexB=1;
		for(int i=0;i<15;i++) {
			labelList.add(new JLabel(String.valueOf(i)));
		}
		int limit=0;
		int lblX=195;
		int lblY=0;
		JLabel[][] labelArray = new JLabel[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<indexB;j++) {
				labelArray[i][j]=labelList.get(limit);
				labelArray[i][j].setBounds(lblX, lblY, 39, 36);
				labelArray[i][j].setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
				panel.add(labelArray[i][j]);
				limit++;
				lblX=lblX-39;
			}
			lblX=195;
			lblY=lblY+36;
			indexB++;
		}
		
		/*
		 * List<Integer> labelList = new ArrayList<>();
		int indexA=0;
		int indexB=1;
		for(int i=0;i<15;i++) {
			labelList.add(i);
		}
		int limit=0;
		
		int[][] labelArray = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<indexB;j++) {
				labelArray[i][j]=labelList.get(limit);
				limit++;
				
			}
			indexB++;
		}
		System.out.println(limit);

		indexB=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=indexB;j++) {
				System.out.println(labelArray[i][j]);
			}
			indexB++;
		}
		 */

		
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(156, 0, 39, 36);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(117, 36, 39, 36);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(78, 72, 39, 36);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(39, 108, 39, 36);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(0, 144, 39, 36);
		panel.add(btnNewButton_4);
		

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(284, 13, 195, 180);
		add(panel_1);
		panel_1.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel_1.add(lblNewLabel_6);
		
		JLabel label = new JLabel("New label");
		panel_1.add(label);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("New label");
		panel_1.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		panel_1.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("New label");
		panel_1.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("New label");
		panel_1.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("New label");
		panel_1.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("New label");
		panel_1.add(lblNewLabel_28);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(12, 206, 317, 31);
		add(panel_2);
		
		textField = new JTextField();
		textField.setBounds(363, 206, 116, 31);
		add(textField);
		textField.setColumns(10);

	}
}
