/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

/**
 *
 * @author juan_
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RecobrarAlumno {
    public static void main(String[] args) {
        try {
            //Generamos un objeto de la clase persistencia
            PersistenciaAlumno p=new PersistenciaAlumno();
         //   Alumno a=   p.leer();
            System.out.println("Alumno "+p.leer().get(2).getNombre());
        } catch (Exception ex) {
            System.out.println("Algo malo paso "+ex.getMessage());
        }
    }
}
