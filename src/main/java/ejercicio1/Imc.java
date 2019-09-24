/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Imc {
  private Persona persona;
public float calcular(){
float resultado=
  (persona.getPeso())/(persona.getAltura()*persona.getAltura());
    return resultado;
  }  

    /**
     * @return ESte metodo te regresa a la persona
     * que previamente ingresaste
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona Este metodo ajusta  el valor
     * de la persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
