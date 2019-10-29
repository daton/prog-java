/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutables2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author T101
 */
public class ValoresAleatorios {
    public static void main(String[] args) {
        Set<Integer> valores=new HashSet<>();
        int iteracion=0;
        while(valores.size()<6){
            Random r=new Random();
            int generado=r.nextInt(10);
            valores.add(generado);
            iteracion++;
        }
        //Comprobamos
        System.out.println("Veces que se ejecuto el while:"+iteracion);
        for(Integer v:valores){
            System.out.println(v);
        }
        
        
        
    }
}
