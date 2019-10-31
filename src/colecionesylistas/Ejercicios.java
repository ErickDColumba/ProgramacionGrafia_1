/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecionesylistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author EDCP
 */
public class Ejercicios {
   
    Scanner leer = new Scanner(System.in);
    MetGenerales met= new MetGenerales();
/*Crea una lista que contenga los días de la semana.
*/    
    public void eje1(){
    
    List<String> listDias = new ArrayList<String>();
    listDias.add("Lunes");
    listDias.add("Martes");
    listDias.add("Mircoles");
    listDias.add("Jueves");
    listDias.add("Viernes");
    listDias.add("Sabado");
    listDias.add("Domingo");
    met.imList(listDias);
    }
    
    //public void eje2(){}
/*Crea un conjunto al que se le va a llamar jugadores. Inserta en el conjunto los jugadores del FC Barcelona.
Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.
Pista:for (String nombre : jugadores) {System.out.println(nombre);}
*/    
    
    public void eje2(){}
    
}
