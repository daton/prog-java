/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author juan_
 */
public class Pruebas {
    public static void main(String[] args) {
        //Vamos a probar si nuestro modelo es correcto
        //Forma numero 1 como polimorfismo es la mas
        //poderosa, mas adelante la veremos.
        Poligono p=new Rectangulo();
        //ESta tambien es correcta pero menos poderosa
        Rectangulo r=new Rectangulo();
        //Asignamos sus valores de base y altura
        r.b=4;
        r.h=3;
        //Imprimimos el resultado del calculo
        System.out.println("Tu resultado es "+r.calcularArea());
        //Creamos un corculo
        Circulo c=new Circulo();
        c.r=4;
        System.out.println("El circulo "+c.calcularArea());
        
         Triangulo t=new Triangulo();
         t.b=5;
         t.h=6;
         System.out.println("El area del riangulo es "+t.calcularArea());
        
               
    }
}
