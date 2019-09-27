/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


public class Probar {
    public static void main(String[] args) {
        //Primero creamos una persona
        Persona p=new Persona();
        //Le ajustamos sus valores de peso y altura
        p.setPeso(80.2f); 
        p.setAltura(1.68f);
        //Generamos el objeto Imc
        Imc c=new Imc();
        //Le ajustamos la persona
        c.setPersona(p); 
        
        //Finalmenet calculamos el imc
        System.out.println("El imc es "+c.calcular());
        
        
    }
}
