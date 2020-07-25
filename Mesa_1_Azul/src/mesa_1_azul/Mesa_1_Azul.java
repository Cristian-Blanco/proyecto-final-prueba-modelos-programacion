/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesa_1_azul;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Mesa_1_Azul {
    
    static Scanner read = new Scanner(System.in);
    static int matriz[][] = new int[5][5];
    static int suma = 0;
    
    public static void main(String[] args) {
        int num = 0;
        while(num !=6 ){
            num = menuColor();
            System.out.println(insertar(num));
            System.out.println(suma);//falta el get se confundio con set
            int terminar = terminar();
            if(terminar == 1){
                System.out.println("JUEGO TERMINADO");
                num = 6;
            }
        }
        
    }
    
   public static void getSuma(int valor){
       suma = suma + valor;
   }
      
   public static int terminar(){
       int terminar = 0;
       for(int i=0; i<5; i++){
           if(matriz[i][0] != 0 && matriz[i][1] != 0 && matriz[i][2] != 0 && matriz[i][3] != 0 && matriz[i][4] != 0){
               terminar = 1;
           }
       }
       return terminar;      
   }
     
   public static String insertar(int color){
       if(color==1){
            if( matriz[0][0] == 0 || matriz[1][1] == 0 || matriz[2][2] == 0 || matriz[3][3] == 0 || matriz[4][4] == 0){
                int entra = 1;
                while(entra == 1){
                    int numero = menuFila();
                    if(numero == 1 && matriz[0][0]==0){ matriz[0][0]=1; sumaFila(0,0); sumaColumna(0,0); getSuma(1); entra = 0;}
                    else if(numero == 2 && matriz[1][1]==0){ matriz[1][1]=1;sumaFila(1,1); sumaColumna(1,1); getSuma(1); entra = 0;}
                    else if(numero == 3 && matriz[2][2]==0){ matriz[2][2]=1;sumaFila(2,2); sumaColumna(2,2); getSuma(1); entra = 0;}
                    else if(numero == 4 && matriz[3][3]==0){ matriz[3][3]=1;sumaFila(3,3); sumaColumna(3,3); getSuma(1); entra = 0;}
                    else if(numero == 5 && matriz[4][4]==0){ matriz[4][4]=1;sumaFila(4,4); sumaColumna(4,4); getSuma(1); entra = 0;}
                    else if(numero == 0){ entra = 0;}
                    else{System.out.println("el color ya esta");}
                }
                return "insertado";
            }
            else{return "El color ya esta completo"; }
        }
       if(color==2){
            if( matriz[0][1] == 0 || matriz[1][2] == 0 || matriz[2][3] == 0 || matriz[3][4] == 0 || matriz[4][0] == 0){
                int entra = 1;
                while(entra == 1){
                    int numero = menuFila();
                    if(numero == 1 && matriz[0][1]==0){ matriz[0][1]=1; sumaFila(0,1); sumaColumna(0,1); getSuma(1); entra = 0;}
                    else if(numero == 2 && matriz[1][2]==0){ matriz[1][2]=1; sumaFila(1,2); sumaColumna(1,2); getSuma(1); entra = 0;}
                    else if(numero == 3 && matriz[2][3]==0){ matriz[2][3]=1; sumaFila(2,3); sumaColumna(2,3); getSuma(1); entra = 0;}
                    else if(numero == 4 && matriz[3][4]==0){ matriz[3][4]=1; sumaFila(3,4); sumaColumna(3,4); getSuma(1); entra = 0;}
                    else if(numero == 5 && matriz[4][0]==0){ matriz[4][0]=1; sumaFila(4,0); sumaColumna(4,0); getSuma(1); entra = 0;}
                    else if(numero == 0){ entra = 0;}
                    else{System.out.println("el color ya esta");}
                }
                return "insertado";
            }
            else{return "El color ya esta completo"; }
        }
       if(color==3){
            if( matriz[0][2] == 0 || matriz[1][3] == 0 || matriz[2][4] == 0 || matriz[3][0] == 0 || matriz[4][1] == 0){
                int entra = 1;
                while(entra == 1){
                    int numero = menuFila();
                    if(numero == 1 && matriz[0][2]==0){ matriz[0][2]=1; sumaFila(0,2); sumaColumna(0,2); getSuma(1); entra = 0;}
                    else if(numero == 2 && matriz[1][3]==0){ matriz[1][3]=1; sumaFila(1,3); sumaColumna(1,3); getSuma(1); entra = 0;}
                    else if(numero == 3 && matriz[2][4]==0){ matriz[2][4]=1; sumaFila(2,4); sumaColumna(2,4); getSuma(1); entra = 0;}
                    else if(numero == 4 && matriz[3][0]==0){ matriz[3][0]=1; sumaFila(3,0); sumaColumna(3,0); getSuma(1); entra = 0;}
                    else if(numero == 5 && matriz[4][1]==0){ matriz[4][1]=1; sumaFila(4,1); sumaColumna(4,1); getSuma(1); entra = 0;}
                    else if(numero == 0){ entra = 0;}
                    else{System.out.println("el color ya esta");}
                }
                return "insertado";
            }
            else{return "El color ya esta completo"; }
        }
       if(color==4){
            if( matriz[0][3] == 0 || matriz[1][4] == 0 || matriz[2][0] == 0 || matriz[3][1] == 0 || matriz[4][2] == 0){
                int entra = 1;
                while(entra == 1){
                    int numero = menuFila();
                    if(numero == 1 && matriz[0][3]==0){ matriz[0][3]=1; sumaFila(0,3); sumaColumna(0,3); getSuma(1); entra = 0;}
                    else if(numero == 2 && matriz[1][4]==0){ matriz[1][4]=1; sumaFila(1,4); sumaColumna(1,4); getSuma(1); entra = 0;}
                    else if(numero == 3 && matriz[2][0]==0){ matriz[2][0]=1; sumaFila(2,0); sumaColumna(2,0); getSuma(1); entra = 0;}
                    else if(numero == 4 && matriz[3][1]==0){ matriz[3][1]=1; sumaFila(3,1); sumaColumna(3,1); getSuma(1); entra = 0;}
                    else if(numero == 5 && matriz[4][2]==0){ matriz[4][2]=1; sumaFila(4,2); sumaColumna(4,2); getSuma(1); entra = 0;}
                    else if(numero == 0){ entra = 0;}
                    else{System.out.println("el color ya esta");}
                }
                return "insertado";
            }
            else{return "El color ya esta completo"; }
        }
       if(color==5){
            if( matriz[0][4] == 0 || matriz[1][0] == 0 || matriz[2][1] == 0 || matriz[3][2] == 0 || matriz[4][3] == 0){
                int entra = 1;
                while(entra == 1){
                    int numero = menuFila();
                    if(numero == 1 && matriz[0][4]==0){ matriz[0][4]=1; sumaFila(0,4); sumaColumna(0,4); getSuma(1);entra = 0;}
                    else if(numero == 2 && matriz[1][0]==0){ matriz[1][0]=1; sumaFila(1,0); sumaColumna(1,0); getSuma(1); entra = 0;}
                    else if(numero == 3 && matriz[2][1]==0){ matriz[2][1]=1; sumaFila(2,1); sumaColumna(2,1); getSuma(1); entra = 0;}
                    else if(numero == 4 && matriz[3][2]==0){ matriz[3][2]=1; sumaFila(3,2); sumaColumna(3,2); getSuma(1); entra = 0;}
                    else if(numero == 5 && matriz[4][3]==0){ matriz[4][3]=1; sumaFila(4,3); sumaColumna(4,3); getSuma(1); entra = 0;}
                    else{System.out.println("el color ya esta");}
                }
                return "insertado";
            }
            else{return "El color ya esta completo"; }
        }
       else{
           return "no insertado";
       }
   }
    public static int menuFila(){
        System.out.println("Que Fila deseas utilizar");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.print("Que deseas: ");
        return read.nextInt();
   }
    
    public static int menuColor(){
        System.out.println("Que color deseas utilizar");
        System.out.println("1.Azul");
        System.out.println("2.Amarillo");
        System.out.println("3.Rojo");
        System.out.println("4.Negro");
        System.out.println("5.Verde");
        System.out.println("6.Salir");
        System.out.print("Que deseas: ");
        return read.nextInt();
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
