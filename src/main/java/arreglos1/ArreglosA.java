/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos1;


public class ArreglosA {
    
    public static void main(String[] args) {
        //a) Todos los arreglos son tratados como objetos
        int x;
        int y[]=new int[3];
        System.out.println(y[0]);
        
        //Regla B)
        //Inicializar explicitamente
        int[]z={12,-40,5};
        
        //Inicialización implicita
        int[]w=new int[3];
        //En este caso ya despues se llena el arreglo como
        //sigue
        w[0]=12;
        w[1]=5;
        w[2]=9;
        //C) Debemos cuidar que el arrglo no se salga de limites
        //porque si no es asi, se nos aparecce el diablo!!
        System.out.println(w[3]);
        
    }
}
