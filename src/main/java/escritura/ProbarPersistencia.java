/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan_
 */
public class ProbarPersistencia {
    
    public static void main(String[] args) {
        try {
            //Crear el alumno
            Alumno alumno=new Alumno("topo", "topo@gmail.com", 23);
//Crear el objeto que guarda, es decir el modelo
PersistenciaAlumno p=new PersistenciaAlumno();
//Guardamos
p.guardar(alumno);
            System.out.println("Guardado con exito");
        } catch (Exception ex) {
            System.out.println("Algo malo paso "+ex.getMessage());
        }
    }
}
