/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutables2;
import java.util.*;
public class ProbarMutables2 {
    public static void main(String[] args) {
        //Vamos a generar un arreglo mutable
        String s1="Naranja";
        String s2="Fresa";
        String s3="Manzana";
        String s4="Fresa";
        //Generamos el arreglo utabl que contendra las 
        //Frutas anteriores
        Set<String> frutas=new HashSet<>();
        //Las agregamos al arreglo con su metodo add
        frutas.add(s1);
        frutas.add(s2);
        frutas.add(s3);
        frutas.add(s4);
        
        //Las iteramos con un ciclo for mejorado
        for(String s:frutas){
            System.out.println(s);
        }
        
        //Otro mas de tipo numerico
        Set<Integer> enteros=new HashSet<>();
        //agregamos lagunos numeros
        enteros.add(4);
        enteros.add(-5);
        enteros.add(123);
        
        //Iteramos con un ciclo for
        for(Integer valor:enteros){
            System.out.println(valor);
        }
        
        Random ran=new Random();
     int generado=   ran.nextInt(6);
        System.out.println("generado "+generado);
        
        
    }
 
}
