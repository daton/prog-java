/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

//Este paquete sirve para generar persistencia sin bases de datos
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaAlumno {
    List<Alumno> alumnos;
    public PersistenciaAlumno(){
        alumnos=new ArrayList<>();
    }
    public void guardar(Alumno a)throws Exception{
        //Paso a)Generar el archivo físico de salida
        File file=new File("todos.alumnos");
        if(file.exists())alumnos=leer();
        //Paso b) Indicar el sentido de la información
        FileOutputStream fos=new FileOutputStream(file);
        //Paso c) Guardar la informcion consta de dos expresiones
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        alumnos.add(a);
        
        oos.writeObject(alumnos); 
  
        
    }
    
    //Vamos a leer en este caso, el alumno que previamente guardamos
    public List<Alumno> leer()throws  Exception{
         File file=new File("todos.alumnos");
         FileInputStream fis=new FileInputStream(file);
         ObjectInputStream oos=new ObjectInputStream(fis);
         //Recobramos el objeto
        alumnos= (List<Alumno>) oos.readObject();
         return alumnos;
    }
    
}
