/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debermatrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author EDCP
 */
public class Ejercicios {
    
     Scanner leer= new Scanner (System.in); 
     MetodosGenerales a= new MetodosGenerales();
    
     /*Suma de los n primeros elementos de un vector */
    public void eje1(){
        System.out.println("Ingrese dimencion ");
        int n = leer.nextInt();
        int [] vec1= a.arregloRandom(n, 20);
        a.imprimirN(vec1);
        System.out.println("suma = " + a.sumaVector(vec1, n));
    
    }
    /*Escriba un programa que lea de la entrada un número y determine si es un número primo. 
*/
    public void eje2(){
    System.out.println("Ingrese un numero ");
        int n = leer.nextInt();
        
        if(a.esPrimo(n)){
            System.out.println("Es primo");}
        else{
            System.out.println("No es primo");
        }
        
    }
    /*Imprimir los números primos que hay desde 1 al 100 y almacenarlos en un array*/
    public void eje3(){
    
    int vec1[]= a.arregloOrdenado(100);
    int cont =0;
    int j=0;
    // Crea la dimencion e un arrglo nuevo
    for(int i=0;i<vec1.length;i++ ){
        if (a.esPrimo(vec1[i])){
            cont++;
        }
    }
    
    int vec2[]= new int [cont];
       for(int i=0;i<vec1.length-1;i++ ){
           int numero = vec1[i];
        if (a.esPrimo(numero)){
            vec2[j]=numero;
            j++;
        }
    }
       a.imprimirN(vec2);
    
    }
    /*Escriba un programa que sume todos los elementos de un array de enteros. Utilícelo para sumar el vector: 
     int[] a = {1, 2, 3, 4, 5, 6}; */

    public void eje4(){
    int[] vec = {1, 2, 3, 4, 5, 6}; 
        System.out.println("suma: " + a.sumaVector(vec, vec.length));
    
    }
    
    
    /*Hacer un programa que dados dos arrays determine si son iguales. Probarlo con los arrays
    [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2] 
    */
    public void eje5(){
    int[] vec1 = {1, 2, 3};
    int[] vec2 = {1, 2, 3};
    int[] vec3 = {1, 2, 3, 4};
    int[] vec4 = {1, 2, 2};
    boolean igual=false;
    //Primer caso
    if(igual=Arrays.equals(vec1,vec2)){
        System.out.println("Son Igulaes");    
    }
    else{System.out.println("No son iguales");}
    //Segundo caso
     if(igual=Arrays.equals(vec1,vec3)){
        System.out.println("son Igulaes");    
    }
    else{System.out.println("No son iguales");}
     //tercer caso
      if(igual=Arrays.equals(vec1,vec4)){
        System.out.println("son Igulaes");    
    }
    else{System.out.println("No son iguales");}
    
    
    }
    
    
    /*Escribir un programa que recoja de la entrada estándar dos arrays de enteros de tamaño 
    especificado por el usuario y los multiplique dos a dos, guardando el resultado en otro array e 
    imprimiendo los valores de este último array. */

    public void eje6(){
    
        System.out.println("Ingrese dimencion ");
        int n = leer.nextInt();
        int [] vec1= a.arregloNoRandom(n);
        System.out.println("Ingrese dimencion ");
        int m = leer.nextInt();
        int [] vec2= a.arregloNoRandom(m);
        int [] vec3= new int[m];
        if(m==n){
            for (int i=0;i <vec1.length;i++){
            vec3[i]=vec1[i]*vec2[i];
            
            }
            a.imprimirN(vec3);
            
        }else{System.out.println("Error");}
        
    }
/*Escriba un programa que lea de la entrada un número y utilice ese número para crear un array de 
enteros de ese tamaño. A continuación, el programa inicializará el array con los valores que el usuario 
introduzca por la entrada. Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ como 
indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2 producirán la siguiente salida: */
    public void eje7(){
    
     System.out.println("Ingrese dimencion ");
     int n = leer.nextInt();
     int [] vec1= a.arregloNoRandom(n);
     String car ="";
     System.out.println("Ingrese caracter");
     car=leer.next();
     String [] vec2= new String[n];
     a.imprimirN(vec1);
     for (int i=0;i <vec1.length;i++){
            vec2[i]=""; 
     }
     for (int i=0;i <vec1.length;i++){
            int numero= vec1[i] ;
            for(int j=0;j<numero;j++){
            vec2[i]+=car; 
            }
            
     }
    a.imprimirS(vec2);
    
    }
/*Declarar e inicializar una matriz de enteros de 2x3 e imprimirla.*/

    public void eje8(){
     int [][]mat= a.matrziRadom(2, 3);
     a.imprimirMatN(mat);  
    }
    
/*Escribir un programa que calcule el determinante de una matriz de 3x3. 
Pruébelo con la matriz [ [1,2,3], [4,5,6], [7,8,8] ] cuyo determinante es 3 
/*/    
    public void eje9(){
    int [][]mat ={{1,2,3},{4,5,6},{7,8,8}};
    a.imprimirMatN(mat);
        System.out.println("Determinate es :" + a.determinante(mat));
    }
    
/*Escribe un programa que dada una matriz de 3x3 realice las siguientes funciones: 
Calcule la media de todos los valores 
Calcule el valor mínimo y el máximo de todos los valores 
Sumar los valores en la diagonal descendente. 
Sumar los valores en la diagonal ascendente. 
Sumar los valores que están por encima de la diagonal descendente. 
Sumar los valores que están por debajo de la diagonal descendente. 
Probarlo con la matriz [ [1,2,3], [4,5,6], [7,8,9] ] */
    
    public void eje10(){
 
        int [][]mat ={{1,2,3},{4,5,6},{7,8,8}};
        System.out.println("Valor medio"+a.proMatrices(mat));
        System.out.println("diagonal desendente"+a.sumaDigA(mat));
        System.out.println("diagonal desendente"+a.sumaDig(mat));
        System.out.println("Suma Superior"+a.sumaInf(mat));
        System.out.println("Suma Inferior"+a.sumaSup(mat));
        
    
    
    }
    
/*
    
*/
    public void eje11(){}
    public void eje12(){}
    public void eje13(){}
      
    
    
    
    
    
    
    
    
    
}//fin
