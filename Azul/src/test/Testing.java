package test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class Testing {

	public static void main(String[] args) {
		List<Integer> labelList = new ArrayList<>();
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
	}

}
