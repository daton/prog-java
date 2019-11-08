/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchecked;

/**
 *
 * @author juan_
 */
public class ExcepcioneUnckecked {
    public static void main(String[] args) {
        //declaramos un arreglo
        int x[]={3,-5,2};
      //Imprimimos el elemento con indice 2
        System.out.println("antes");
      //  System.out.println(x[3]);
        System.out.println("despues");
        //Esta excepcion es comun y es mala!!
        float a=2;
        int b=0;
        int c=1;
        System.out.println("antes de division");
        System.out.println(a/b);
        System.out.println("despues de la excpcion");
        
        //Otra excepcion de esta familia es
        //la siguiente es super comun esta
       int valor=Integer.parseInt("jaja");
         System.out.println(  valor*2);
        
    }
}
