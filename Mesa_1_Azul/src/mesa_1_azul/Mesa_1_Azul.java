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
    
    public static void main(String[] args) {
        int num = 0;
        while(num !=6 ){
            num = menuColor();
            System.out.println(insertar(num));
            int terminar = terminar();
            if(terminar == 1){
                System.out.println("JUEGO TERMINADO");
                num = 6;
            }
        }
        
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
                    if(numero == 1 && matriz[0][0]==0){ matriz[0][0]=1; entra = 0;}
                    else if(numero == 2 && matriz[1][1]==0){ matriz[1][1]=1; entra = 0;}
                    else if(numero == 3 && matriz[2][2]==0){ matriz[2][2]=1;entra = 0;}
                    else if(numero == 4 && matriz[3][3]==0){ matriz[3][3]=1;entra = 0;}
                    else if(numero == 5 && matriz[4][4]==0){ matriz[4][4]=1;entra = 0;}
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
                    if(numero == 1 && matriz[0][1]==0){ matriz[0][1]=1; entra = 0;}
                    else if(numero == 2 && matriz[1][2]==0){ matriz[1][2]=1; entra = 0;}
                    else if(numero == 3 && matriz[2][3]==0){ matriz[2][3]=1; entra = 0;}
                    else if(numero == 4 && matriz[3][4]==0){ matriz[3][4]=1; entra = 0;}
                    else if(numero == 5 && matriz[4][0]==0){ matriz[4][0]=1; entra = 0;}
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
                    if(numero == 1 && matriz[0][2]==0){ matriz[0][2]=1;  entra = 0;}
                    else if(numero == 2 && matriz[1][3]==0){ matriz[1][3]=1; entra = 0;}
                    else if(numero == 3 && matriz[2][4]==0){ matriz[2][4]=1; entra = 0;}
                    else if(numero == 4 && matriz[3][0]==0){ matriz[3][0]=1; entra = 0;}
                    else if(numero == 5 && matriz[4][1]==0){ matriz[4][1]=1; entra = 0;}
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
                    if(numero == 1 && matriz[0][3]==0){ matriz[0][3]=1; entra = 0;}
                    else if(numero == 2 && matriz[1][4]==0){ matriz[1][4]=1;entra = 0;}
                    else if(numero == 3 && matriz[2][0]==0){ matriz[2][0]=1;entra = 0;}
                    else if(numero == 4 && matriz[3][1]==0){ matriz[3][1]=1;entra = 0;}
                    else if(numero == 5 && matriz[4][2]==0){ matriz[4][2]=1;entra = 0;}
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
                    if(numero == 1 && matriz[0][4]==0){ matriz[0][4]=1;  entra = 0;}
                    else if(numero == 2 && matriz[1][0]==0){ matriz[1][0]=1; entra = 0;}
                    else if(numero == 3 && matriz[2][1]==0){ matriz[2][1]=1; entra = 0;}
                    else if(numero == 4 && matriz[3][2]==0){ matriz[3][2]=1; entra = 0;}
                    else if(numero == 5 && matriz[4][3]==0){ matriz[4][3]=1; entra = 0;}
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
    
}
