/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author juan_
 */
public class OperacionesAritmeticas {
   private Numeros numeros;
   
   
   public float sumar(){
       float suma=numeros.getX()+numeros.getY();
       return suma;
   }

  
    public Numeros getNumeros() {
        return numeros;
    }

   
    public void setNumeros(Numeros numeros) {
        this.numeros = numeros;
    }
   
}
