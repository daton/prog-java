/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable3;

import java.util.*;


public class ProbarPregunta {
    
    public static void main(String[] args) {
        //Generamos las opciones
        Opcion op1=new Opcion();
        op1.setTitulo("Popocatepetl");
        op1.setCorrecta(false);
        
        Opcion op2=new Opcion();
        op2.setTitulo("Pico de Orizaba");
        op2.setCorrecta(false);
        
        Opcion op3=new Opcion();
        op3.setTitulo("Everest");
        op3.setCorrecta(true);
        
        Opcion op4=new Opcion();
        op4.setTitulo("Aconcahua");
        op4.setCorrecta(false);
        //Las agregamos a un list
        List<Opcion> opciones=new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        //Generamos la pregunta:
        Pregunta p1=new Pregunta();
        p1.setTitulo("Cual es la montaña mas alta del mundo?");
        p1.setOpciones(opciones);
        //Mostramos la pregunta
        System.out.println(p1.getTitulo());
        for(Opcion o:opciones){
            System.out.println(o.getTitulo());
        }
    }
}
