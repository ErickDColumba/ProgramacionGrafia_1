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
public class MetGenerales {
 
    Scanner leer = new Scanner(System.in);
    public void imListSt (List a ){
        System.out.println("La lista es ");
        Iterator it=  a.iterator();
        while (it.hasNext()){
        String elemento = (String) it.next();
            System.out.println(""+elemento);   
        }    
    }
    
    public List NoRamdom(int n){
        
        List<Integer> lista = new ArrayList <>();
        
        for (int i=0 ; i <n;i++){
        System.out.println("Ingrese dato"+(i+1));
        Integer valor = leer.nextInt();
            lista.add(valor);
        }
        
        return lista;
    
    }
    
    public List Ordenada(int n){
        
        List<Integer> lista = new ArrayList <>();
        int a=1;
        for (int i=0 ; i <n;i++){
        Integer valor = a;
            lista.add(valor);
            a++;
        }
        
        return lista;
    
    }
    
    
    public Integer sumavec (List l){
    
    Integer suma=0;
        Iterator it=  l.iterator();
        while (it.hasNext()){
        Integer tem = (Integer)it.next();
        suma+=tem;
        }    
        
        return suma;
    }
    
    
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
    
    
    
    
    
}//fin
