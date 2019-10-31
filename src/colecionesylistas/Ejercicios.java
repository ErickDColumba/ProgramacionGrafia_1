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
    /*Imprimir los números primos que hay desde 1 al 100 y almacenarlos en un array
*/
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

/*Escriba un programa que sume todos los elementos de un array de enteros. Utilícelo para sumar el vector: 
	int[] a = {1, 2, 3, 4, 5, 6}; 
*/

public void eje7(){

    List <Integer> lista1 = new ArrayList<>();
    lista1=met.Ordenada(6);
    System.out.println("suma:"+ met.sumavec(lista1));

}

/*Hacer un programa que dados dos arrays determine si son iguales. Probarlo con los arrays 
[1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2] 
*/
public void eje8(){
List <Integer> lista1 = new ArrayList<>();
 lista1=met.Ordenada(3);
 List <Integer> lista2 = new ArrayList<>();
 lista1=met.Ordenada(4);
 List <Integer> lista3 = new ArrayList<>();
 lista3.add(1);
 lista3.add(2);
 lista3.add(3);
}
/*Escribir un programa que recoja de la entrada estándar dos arrays de enteros de tamaño 
specificado por el usuario y los multiplique dos a dos, guardando el resultado en otro array e 
imprimiendo los valores de este último array. 
*/
public void eje9(){
List <Integer> lista1 = new ArrayList<>();
    System.out.println("Ingrese dimencion");
    int n = leer.nextInt();
 lista1=met.NoRamdom(n);
 List <Integer> lista2 = new ArrayList<>();
    System.out.println("Ingrese dimencion");
    int m = leer.nextInt();
 lista2=met.NoRamdom(m);
 
 List <Integer> lista3 = new ArrayList<>();
 if(m==n){
     Iterator it1=  lista1.iterator();
     Iterator it2=  lista2.iterator();
        while (it1.hasNext()){
        Integer tem1 = (Integer)it1.next();
        Integer tem2 = (Integer)it1.next();
        lista3.add((tem1*tem2));
        }    
 
 }else{System.out.println("Error");}
 
 
 
}/*Escriba un programa que lea de la entrada un número y utilice ese número para crear un array de
enteros de ese tamaño. A continuación, el programa inicializará el array con los valores que el 
usuario introduzca por la entrada. Finalmente, se deberá recorrer el array e imprimir tantos caracteres 
‘*’ como indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2 producirán la siguiente
salida: 
*/
public void eje10(){
List <Integer> lista1 = new ArrayList<>();
    System.out.println("Ingrese dimencion");
    int n = leer.nextInt();
    lista1=met.NoRamdom(n);
    System.out.println("Ingrese caracter");
    String car= leer.next();
List <String> lista2 = new ArrayList<>();

for (int i=0;i<lista1.size();i++){
    int numero = (Integer)lista1.get(i);
      for (int j=0;j<numero;j++){
            String cadena = " ";
            cadena +=car;
            lista2.add(cadena);
}
}
    System.out.println(""+lista2);


}
/*Declarar e inicializar una matriz de enteros de 2x3 e imprimirla.
*/
public void eje11(){}
/*Escribir un programa que calcule el determinante de una matriz de 3x3. 
Pruébelo con la matriz [ [1,2,3], [4,5,6], [7,8,8] ] cuyo determinante es 3 
*/
public void eje12(){}



}//fin