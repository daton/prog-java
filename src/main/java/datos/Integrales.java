/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;


public class Integrales {
    public static void main(String[] args) {
        //Integrales
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        //Vamos a probar que todo se lee de derecha a izquierda
        //cuando hay asignaciones "="
       // b=s;
        s=b;
      //  i=l;
      //  s=i;
      //  b=l;
        l=i;
        s=b;
       //Veremos el mas importante de lso refernciados
       //El String
       String cadena="TE AMO";
       //Vamos a convertir a un arreglo de bytes
       
       byte arreglito[]=cadena.getBytes();

      
        //uSANDO EL CICLO FOR MEJORADO
        for(byte z:arreglito){
           System.out.print(z);
        }
    }
}
