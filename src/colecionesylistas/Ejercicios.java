/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecionesylistas;

import java.util.ArrayList;
import java.util.Iterator;
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
    
    List listDias = new ArrayList();
    listDias.add("Lunes");
    listDias.add("Martes");
    listDias.add("Mircoles");
    listDias.add("Jueves");
    listDias.add("Viernes");
    listDias.add("Sabado");
    listDias.add("Domingo");
    
    
    met.imListSt(listDias);
    }
    
    //public void eje2(){}
/*Crea un conjunto al que se le va a llamar jugadores. Inserta en el conjunto los jugadores del FC Barcelona.
Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.
Pista:for (String nombre : jugadores) {System.out.println(nombre);}
*/    
    
    public void eje2(){
    
    
    
    
    }
 /*Crea una clase colegio que almacene la nacionalidad de los alumnos de un colegio. La clase tendrá los siguientes métodos.
    addAlumno(String nacionalidad) añade la nacionalidad de un nuevo alumno
*/
  

public void eje3(){
    
    
    
    
    }   


/*Suma de los n primeros elementos de un vector 
*/
public void eje4(){
   List <Integer> lista = new ArrayList<>();
   System.out.println("Ingrese dimencion ");
   int n = leer.nextInt();
    
   lista=met.NoRamdom(n);
   System.out.println("suma:"+met.sumavec(lista));
}
  /*Escriba un programa que lea de la entrada un número y determine si es un número primo. 
*/
    public void eje5(){
    System.out.println("Ingrese un numero ");
        int n = leer.nextInt();
        
        if(met.esPrimo(n)){
            System.out.println("Es primo");}
        else{
            System.out.println("No es primo");
        }
        
    }
public void eje6(){
     List <Integer> lista1 = new ArrayList<>();
     List <Integer> lista2 = new ArrayList<>();
     lista1=met.Ordenada(100);
     for(int i=0;i<lista1.size();i++ ){
           int numero = (Integer)lista1.get(i);
        if (met.esPrimo(numero)){
            lista2.add(numero);
        }
    }
    System.out.println(""+lista2);
}
public void eje7(){}
public void eje8(){}
public void eje9(){}
public void eje10(){}
public void eje11(){}
public void eje12(){}



}//fin