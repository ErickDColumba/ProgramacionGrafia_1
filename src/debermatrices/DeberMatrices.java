/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debermatrices;

import java.util.Scanner;

/**
 *
 * @author EDCP
 */
public class DeberMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer= new Scanner (System.in);  
        Ejercicios a = new Ejercicios();
        System.out.println("Ingrese ejercicio que desea Ejecutar ");
        int op=0;
        op = leer.nextInt();
        switch (op){
            case 1:
                  a.eje1();
            break;
             case 2:
                  a.eje2();
            break;
             case 3:
                  a.eje3();
            break;
             case 4:
                  a.eje4();
            break;
             case 5:
                  a.eje5();
            break;
            case 6:
                  a.eje6();
            break;
            case 7:
                  a.eje7();
            break;
            case 8:
                  a.eje8();
            break;
            case 9:
                  a.eje9();
            break;
             case 10:
                  a.eje10();
            break;
            case 11:
                  a.eje11();
            break;
            case 12:
                  a.eje12();
            break;
            case 13:
                  a.eje13();
            break;
            
                
        }
        
        
        
    }
    
}
