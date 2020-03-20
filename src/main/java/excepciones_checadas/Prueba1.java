
package excepciones_checadas;

import java.io.*;
public class Prueba1 {
    public static void main(String[] args) {
        File f=new File("archivaldo");
        //Vamos a indicar que sacaremos informaccion
        //hacia el extrior de esta clase
        try{
        FileOutputStream fos=new FileOutputStream(f);
        //En la siguiente expresion vamos a agrear contenido
        // al archivo
        ObjectOutputStream oos=new ObjectOutputStream(fos);
       //Escribimos el archivo con informacion
       oos.writeObject("Hola mundo!!");
            System.out.println("Todo ocurrio de forma correcta");
        }catch(Exception e){
            System.out.println("Este se ejecuta si se lanza la excepcion");
        }
        
    }
}
