package model;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
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
		
		HashMap<Integer,ActiveButton> mapButton = new HashMap<>(); 
		
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
		int btnX=156;
		int btnY=0;
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
			ActiveButton keyButton = new ActiveButton(i);
			keyButton.setBounds(btnX, btnY, 39, 36);
			mapButton.put(i, keyButton);
			panel.add(mapButton.get(i));
			btnX-=39;
			btnY+=36;
			lblX=195;
			lblY=lblY+36;
			indexB++;
		}
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(284, 13, 195, 180);
		add(panel_1);
		panel_1.setLayout(null);      
		
		
		
		
		
		LeftBrick[] lbrick = new LeftBrick[5];
		
		for(int i=0;i<5;i++) {
			switch(i) {
				case 0:
					LeftBrick temp = new LeftBrick();
					temp.setColour(new Color(255, 255, 153));
					temp.setBackground(new Color(255, 255, 153));
					temp.setOpaque(true);
					temp.setTitle("Yellow");
					lbrick[i]=temp;

					break;
				case 1:
					LeftBrick tempA = new LeftBrick();
					tempA.setColour(new Color(102, 153, 255));
					tempA.setBackground(new Color(102, 153, 255));
					tempA.setOpaque(true);
					tempA.setTitle("Blue");
					lbrick[i]=tempA;
					break;
					
				case 2:
					LeftBrick tempB = new LeftBrick();
					tempB.setColour(new Color(102, 204, 153));
					tempB.setBackground(new Color(102, 204, 153));
					tempB.setOpaque(true);
					tempB.setTitle("Green");
					lbrick[i]=tempB;
					break;
					
				case 3:
					LeftBrick tempC = new LeftBrick();
					tempC.setColour(new Color(255, 153, 153));
					tempC.setBackground(new Color(255, 153, 153));
					tempC.setOpaque(true);
					tempC.setTitle("Red");
					lbrick[i]=tempC;
					break;
				case 4:		
					LeftBrick tempD = new LeftBrick();
					tempD.setColour(new Color(153, 153, 153));
					tempD.setBackground(new Color(153, 153, 153));
					tempD.setOpaque(true);
					tempD.setTitle("Black");
					lbrick[i]=tempD;
					break;
			}
		}
		LeftBrick[] lbrickA = lbrick.clone();
		LeftBrick [][] lbricksMatrix = new LeftBrick[5][5];
		int lblMx = 0;
		int lblMy = 0;
		for(int j=0;j<5;j++) {
			LeftBrick lb = new LeftBrick();
			lb=lbrickA[j].copy();
			lbricksMatrix[0][j]=lb;
			lbricksMatrix[0][j].setBounds(lblMx,lblMy,39,36);
			lbricksMatrix[0][j].doBackgroundColor();
			panel_1.add(lbricksMatrix[0][j]);
			lblMx=lblMx+39;
		}
		lblMx = 0;
		lblMy = 36;
		int aux=4;
		int auxA=0;
		int auxB=0;
		for(int i=1;i<5;i++) {
			for(int j=aux;j<5;j++) {
				LeftBrick lb = new LeftBrick();
				lb=lbrickA[j].copy();
				lbricksMatrix[i][auxA]=lb;
				lbricksMatrix[i][auxA].setBounds(lblMx,lblMy,39,36);
				lbricksMatrix[i][auxA].doBackgroundColor();
				panel_1.add(lbricksMatrix[i][auxA]);
				lblMx=lblMx+39;
				auxA++;
			}
			for(int k=auxA;k<5;k++) {
				LeftBrick lb = new LeftBrick();
				lb=lbrickA[auxB].copy();
				lbricksMatrix[i][k]=lb;
				lbricksMatrix[i][k].setBounds(lblMx,lblMy,39,36);
				lbricksMatrix[i][k].doBackgroundColor();
				panel_1.add(lbricksMatrix[i][k]);
				lblMx=lblMx+39;
				auxB++;
			}
			lblMy=lblMy+36;
			lblMx=0;
			auxA=0;
			auxB=0;
			aux--;
		}
		
		mapButton.get(0).putTilesRighBoard(lbricksMatrix, "Yellow");
		mapButton.get(1).putTilesRighBoard(lbricksMatrix, "Blue");
		mapButton.get(2).putTilesRighBoard(lbricksMatrix, "Green");
		mapButton.get(3).putTilesRighBoard(lbricksMatrix, "Red");
		mapButton.get(4).putTilesRighBoard(lbricksMatrix, "Black");
	


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
