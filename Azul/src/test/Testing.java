package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JLabel;

public class Testing {

	public static void main(String[] args) {
		/*List<Integer> labelList = new ArrayList<>();
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
		}*/
		/*Integer [] vector = new Integer[5];
		Integer [] vectorA = new Integer[5];
		Integer [][] matrix = new Integer[5][5];
		
		int aux=1;
		int auxB=0;
		int auxC=0;
		for(int i=0;i<5;i++) {
			vector[i]=i;
		}
		vectorA=vector.clone();
		
		Collections.reverse(Arrays.asList(vector));
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matrix[i][j]=vectorA[j];
			}
		}	
	
		for(int i=1;i<5;i++) {
			
			for(int j=0;j<aux;j++) {
				matrix[i][j]=vector[auxC];
				auxC++;
			}
			for(int j=aux;j<5;j++) {
				matrix[i][j]=vectorA[auxB];
				auxB++;
			}
			
			aux++;
			auxB=0;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		/*
		 * for(int j=0;j<2;j++) {
			vectorA[j]=vector[vector.length-(j+1)];
			
		}
		
		for(int k=0;k<5;k++) {
			System.out.println(vectorA[k]);
		}
		 */
		int [] vector = new int[5];
		for(int i=0;i<5;i++) {
			vector[i]=i;
		}
		int aux=4;
		int auxA=0;
		int auxB=0;
		int [][] matrix = new int[5][5];
		for(int j=0;j<5;j++) {
			matrix[0][j]=vector[j];
		}	
		for(int i=1;i<5;i++) {
			for(int j=aux;j<5;j++) {
				matrix[i][auxA]=vector[j];
				auxA++;
			}
			for(int k=auxA;k<5;k++) {
				matrix[i][k]=vector[auxB];
				auxB++;
			}
			auxA=0;
			auxB=0;
			aux--;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
