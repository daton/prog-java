/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosmutables;
import java.util.*;


public class Primero {
    public static void main(String[] args) {
       //Primero vamos a ver los List
       List<String> nombres=new ArrayList<>();
       ArrayList<Integer> enteros=new ArrayList<>();
       nombres.add("Juan");
       nombres.add("Ana");
       nombres.add("Pedro");
       nombres.add("Juan");
       
       enteros.add(6);
       enteros.add(-23);
       enteros.add(0);
       enteros.add(5);
       //para obtener el tamaño de cada arreglo usamos el metodo size()
        System.out.println("Elementos del primer arreglo "+enteros.size());
        
        //Para iterarlo o recorrerlo usamos el ciclo for igual que en los otros
        for(String x:nombres){
            System.out.println(x);
        }
       
       
        
    }
}
