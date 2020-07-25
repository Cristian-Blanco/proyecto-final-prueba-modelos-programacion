/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Cristian
 */
public class Prueba {

    static int matriz[][] = new int[5][5];
    static int suma = 0;
    public static void main(String[] args) {
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[1][3] = 1;
        matriz[1][4] = 1;
        matriz[2][4] = 1;
        matriz[0][4] = 1;
        sumaFila(1,4);
        sumaColumna(1,4);
        System.out.println(suma);
    }
    
    public static void getSuma(int num){
        suma = suma + num;
    }
    
    public static void sumaFila(int x, int y){
        int anterior = 0;
        int superior = 0;
        int anterior_menor = 1;
        int superior_menor = 1;
        int entrada_derecha = 0;
        int entrada_izquierda = 0;
        for(int j = 1 ; j <= 4; j++){
            
            if( y+j > 4 ){
                if(matriz[x][y-anterior_menor] != 0 && matriz[x][y-anterior] != 0 && entrada_izquierda == 0){
                    getSuma(1);
                    anterior = anterior + 1;
                    anterior_menor = anterior_menor +1;
                }
                else{
                    entrada_izquierda = entrada_izquierda + 1;
                }
            }
            if(y + j <= 4){
                if(matriz[x][y+superior_menor] != 0 && matriz[x][y+superior] != 0 && entrada_derecha == 0){
                    getSuma(1);
                    superior = superior + 1;
                    superior_menor = superior_menor +1;
                }
                else{
                    entrada_izquierda = entrada_izquierda + 1;
                }
            }
        }

    }
    
    public static void sumaColumna(int x, int y){
        int anterior = 0;
        int superior = 0;
        int anterior_menor = 1;
        int superior_menor = 1;
        int entrada_derecha = 0;
        int entrada_izquierda = 0;
        for(int i = 1 ; i <= 4; i++){
            
            if( x+i > 4 ){
                if(matriz[x-anterior_menor][y] != 0 && matriz[x-anterior][y] != 0 && entrada_izquierda == 0){
                    System.out.println("entro porque es maayor a cuatro");
                    getSuma(1);
                    anterior = anterior + 1;
                    anterior_menor = anterior_menor +1;
                } 
                else{
                    entrada_izquierda = entrada_izquierda + 1;
                }
            }
            if(x + i <= 4){
                if(matriz[x+superior_menor][y] != 0 && matriz[x+superior][y] != 0 && entrada_derecha == 0){
                    System.out.println("Entro porque es menor o igual a cuatro");
                    getSuma(1);
                    superior = superior + 1;
                    superior_menor = superior_menor +1;
                }
                else{
                    entrada_derecha = entrada_derecha + 1;
                }
            }
        }

    }
    
}
