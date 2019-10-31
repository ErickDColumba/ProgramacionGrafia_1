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
public class MetodosGenerales {
    Scanner leer= new Scanner (System.in); 
    // suma los N primeros elemantos de un arreglo
    public int sumaVector(int arreglo [], int n){
    
        int suma=0;
        for (int i =0;i<=arreglo.length-1;i++){
         
            suma += arreglo [i];
        }
        return suma;
    }
    
    // Crea un vector ramdom
    public int[]arregloRandom(int n,int m){
    
    int [] vector = new int [n];
        for (int i =0; i<=vector.length-1;i++){
            vector [i]= (int)(Math.random()*m)+1;//llena el arreglo con numero ramdom
        }
    return vector;
    }
    
    //crea un vetor no ramdom
    
    
     public int[]arregloNoRandom(int n){
     
     int dato=0;
     int [] vector = new int [n];
        for (int i =0; i<=vector.length-1;i++){
            System.out.println("Ingrese dato"+(i+1));
            dato= leer.nextInt();
            vector [i]= (int)dato;
        }
    return vector;
    }
       //crea un vetor no ramdom
    
    
     public int[]arregloOrdenado(int n){
      
     int dato=0;
     int [] vector = new int [n];
        for (int i =0; i<=vector.length-1;i++){
            dato+=1; 
            vector [i]= (int)dato;
        }
    return vector;
    }
    
     //metodo que verifica si un numro es primo
 public  boolean esPrimo(int numero){
  int contador = 2;
  boolean primo=true;
 
  if(numero!=1){
  while ((primo) && (contador!=numero)){
    if (numero % contador == 0)
      primo = false;
    contador++;
  }
  
  }
  return primo;
}
 
 
 //ordena lso datos de un arreglo 
 
 
 public int [] burbuja (int [] vec){
 int [] vecOr=vec; 
 int aux=0;
     for (int i=0;i<vec.length;i++){
     
         for (int j=0;j<vec.length-1;j++){
         if (vec[j] > vec[j+1]){
         aux = vec[j];
         vec[j]= vec[j+1];
         vec[j+1]=aux;
         }
             
         }
         
     }
 vecOr=vec; 
 return vecOr;
     
 
 }
     
     
 // imprimir arreglo numerico 
    
    public void imprimirN(int []arreglo){
        System.out.println("El Arreglo es:");
    for (int i = 0 ; i<= arreglo.length-1;i++){
        System.out.println(""+arreglo[i]);
    }
    
    // Impirme un arrglo de caracteres
    }
     public void imprimirS(String []arreglo){
        System.out.println("El Arreglo es:");
    for (int i = 0 ; i<= arreglo.length-1;i++){
        System.out.println(""+arreglo[i]);
    } 
        
    }
     
     //crea una matriz 
     
     public int [][] matrziNoRadom(int n , int m){
       
         
     int [][]mat= new int[n][m];
     for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                System.out.printf("Ingrese componente:"+i+":"+j);
                mat[i][j]=leer.nextInt();
            }
        }
         
     return mat;
     }
     
         //crea una matriz 
     
     public int [][] matrziRadom(int n , int m){
       
         
     int [][]mat= new int[n][m];
     for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                
                mat[i][j]=(int)(Math.random()*20)+1 ;
            }
        }
         
     return mat;
     }
    
     
     //Imprime una matriz numerica
     public void imprimirMatN(int[][]mat) {
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
     
     //calcula el dterminadte de un amatriz 
     public double determinante(int[][] matriz)
{
    double det;
    if(matriz.length==2)
    {
        det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        return det;
    }
    double suma=0;
    for(int i=0; i<matriz.length; i++){
    int[][] nm=new int[matriz.length-1][matriz.length-1];
        for(int j=0; j<matriz.length; j++){
            if(j!=i){
                for(int k=1; k<matriz.length; k++){
                int indice=-1;
                if(j<i)
                indice=j;
                else if(j>i)
                indice=j-1;
                nm[indice][k-1]=matriz[j][k];
                }
            }
        }
        if(i%2==0)
        suma+=matriz[i][0] * determinante(nm);
        else
        suma-=matriz[i][0] * determinante(nm);
    }
    return suma;
}
         
     
     public double proMatrices(int [][] mat){
     double promedio=0;
     int cont=0;
     for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
             promedio+=mat[i][j];
             cont++;
            }
            
        }
     promedio = promedio/ cont;
     return promedio;
     
     }
      
     public int sumaDig(int [][]mat){
     int suma=0;
      for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
            if (i==j){
            suma+=mat[i][j];
            }
            }
            
        }
     return suma;
     }
     
     
     public int sumaDigA(int [][]mat){
     int suma=0;
   
      for(int i=0;i<mat.length;i++) {
        
            for(int j=0;j<mat[i].length;j++) {
             
            if ((i+j)==(mat.length-1)){
             
                suma+=mat[i][j];
            }   
            }
            
        }
     return suma;
     }
     
      public int sumaSup(int [][]mat){
     int suma=0;
   
      for(int i=0;i<mat.length;i++) {
        
            for(int j=0;j<mat[i].length;j++) {
             
            if ((i+j)>(mat.length-1)){
             
                suma+=mat[i][j];
            }   
            }
            
        }
     return suma;
     }
     
      public int sumaInf(int [][]mat){
     int suma=0;
   
      for(int i=0;i<mat.length;i++) {
        
            for(int j=0;j<mat[i].length;j++) {
             
            if ((i+j)<(mat.length-1)){
             
                suma+=mat[i][j];
            }   
            }
            
        }
     return suma;
     }
      
     
     

        
    
    
}//fin
