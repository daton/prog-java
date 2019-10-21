/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micuestioanrio;

import java.util.*;
public class Cuestionario {
    int numeroPreguntas;
    private List<Pregunta> preguntas;

    public Cuestionario() {
        //La funcion de un constructor es darles a los atributo
        //un valor de defecto antes de que tu le asignes uno con su
        //metodo set
       // numeroPreguntas=500;
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
       
       //Empieza la pregunta 2
       
       Opcion op21=new Opcion();
        op21.setTitulo("Atlantico");
        op21.setCorrecto(false);
        
        Opcion op22=new Opcion();
        op22.setTitulo("Artico");
        op22.setCorrecto(false);
        
        Opcion op23=new Opcion();
        op23.setTitulo("Antartico");
        op23.setCorrecto(false);
        
        Opcion op24=new Opcion();
        op24.setTitulo("Pacifico");
        op24.setCorrecto(true);
        //Creamos el objeto Pregunta
        Pregunta p2=new Pregunta();
        p2.setTitulo("¿Cual es el océano más grande?");
       //Primero generamos el List<Opcion>
       List<Opcion> opciones2=new ArrayList<>();
       //Llenamos el arreglo
       opciones2.add(op21);
       opciones2.add(op22);
       opciones2.add(op23);
       opciones2.add(op24);
       //Agregamos este List a nuestra pregunta
       p2.setOpciones(opciones2); 
       
       //Termina la pregunta 2
       
       //Creamos un objeto de tipo Cuestionario
      
       //Generamos un Listado de perguntas
       List<Pregunta> preguntas=new ArrayList<>();
       //Agregamos a este listado las dos preguntas, p1, p2
       preguntas.add(p1);
       preguntas.add(p2);
       this.preguntas=preguntas;
       
    }
    
   

    
    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * @param preguntas the preguntas to set
     */
    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
