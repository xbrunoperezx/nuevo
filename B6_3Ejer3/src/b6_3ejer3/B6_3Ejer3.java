/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_3ejer3;
import java.util.*;
/**
 *
 * @author bruno
 */
public class B6_3Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado= new Scanner (System.in);
      
      int numero []=new int[11];
      int pedir=1;
      int acumu=0;
      int cont=0;
      
     
      
      do{
          System.out.println("escriba numero inferior");
          pedir=teclado.nextInt();
          pedir=error(pedir);// lo habia echo con void pero me daba luego error al meter -1 cambie a return y solucione el error ( podia ser que cogia el parametro -1 como pedir)
         
          numero[cont]=pedir;
           cont++;
       
          
      }while(pedir !=0 && cont<11);
          
          
        
      
      mostrar(numero);
      media(numero);
      
       
    }
    
    
    
    
    //metodo para comprobar error de introduccion de datos
    public static int error (int num){
     Scanner teclado= new Scanner (System.in);
      while(num<0){
         System.out.println("codigo erroneo");
         System.out.println("escriba bien el numero");
         num=teclado.nextInt();
     }
      return num;
    }
    //metodo para mostrar los nuemros que voy insertando y me muestre la posicion
    public static void mostrar(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.println("Posicion "+i+" del array: "+array[i]);
    }
    //metodo para calcular la media del array
    public static void media (int [] array){
        double acum=0;
    for (int i=0; i<array.length;i++){
    acum=acum+array[i];
    
    }
      System.out.println("la media es : "+ acum/array.length);
    }
    
     //metodo para hacerlo el array dentro del metodo 
    public static int[] meter(int[] array){
        Scanner teclado = new Scanner(System.in);
        int num;
        for(int i=0;i<array.length;i++){
            System.out.println("Escribe un numero");
            num=teclado.nextInt();
            array[i]=num;
        }
        return array;
    }
}
