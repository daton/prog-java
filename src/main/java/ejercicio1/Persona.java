/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Persona {
   private float peso;
   private float altura;

    /**
     * @return Este metodo te retorna el peso 
     *que ajustaste con su metodo set
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso ESte metodo recibe como argumento
     * un flotante que es el peso de la persona
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return Este metodo te regresa la altura de la
     * persona ingresada
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura Este metodo ajusta el valor
     * que quieras que tenga la persona como altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
