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
  System.out.println("El numero de casillas son "+arreglito.length);
        System.out.println("La A en bye es "+arreglito[0]);
        System.out.println("El hola mundo en bytes es:");
        //Usamos un for 
        for(int xx=0;xx<arreglito.length;xx++){
            System.out.print(arreglito[xx]);
        }
        //uSANDO EL CICLO FOR MEJORADO
        for(byte z:arreglito){
           System.out.print(z);
        }
    }
}
