/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micuestioanrio;

import java.util.*;
public class ProbarCuestioanrio {
    public static void main(String[] args) {
        //Generamos cada opcion
        Opcion op1=new Opcion();
        op1.setTitulo("Popocatepetl");
        op1.setCorrecto(false);
        
        Opcion op2=new Opcion();
        op2.setTitulo("Iztaccihuatl");
        op2.setCorrecto(false);
        
        Opcion op3=new Opcion();
        op3.setTitulo("Pico de Orizaba");
        op3.setCorrecto(true);
        
        Opcion op4=new Opcion();
        op4.setTitulo("Nevado de Toluca");
        op4.setCorrecto(false);
        //Creamos el objeto Pregunta
        Pregunta p1=new Pregunta();
        p1.setTitulo("¿Cual es la montaña mas alta de México");
       //Primero generamos el List<Opcion>
       List<Opcion> opciones1=new ArrayList<>();
       //Llenamos el arreglo
       opciones1.add(op1);
       opciones1.add(op2);
       opciones1.add(op3);
       opciones1.add(op4);
       //Agregamos este List a nuestra pregunta
       p1.setOpciones(opciones1); 
       
       //MOstramos nuestra pregunta con ciclos for
       
        System.out.println(p1.getTitulo());
        for(Opcion o: p1.getOpciones()){
            System.out.println(o.getTitulo());
        }
       
        
    }
}
