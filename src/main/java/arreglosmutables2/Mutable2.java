/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosmutables2;

import java.util.*;
public class Mutable2 {
    public static void main(String[] args) {
        //Arreglos mutables desordenados que no aceptan repeticion
        Set<Integer> enteros=new HashSet<>();
        //Para agregar elementos al arreglo usamos el metodo add
        enteros.add(5);
        enteros.add(-2);
        enteros.add(6);
        enteros.add(5);
        //Para saber el número de elementos invocamos su metodo size
        System.out.println("Elementos son:"+enteros.size());
        
        //La siguiente clase sirve para generar un numero aleatorio
        //en cierto rango que tu le indiques
        Random r=new Random();
        int valor=r.nextInt(5);
        System.out.println("El valor generado es "+valor);
        
    }
}
