/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;


public class Pruebitas2 {
    public static void main(String[] args) {
        // Rectangulos
        Rectangulo r1=new Rectangulo();
        r1.b=6;
        r1.h=5;
        Rectangulo r2=new Rectangulo();
        r2.b=3;
        r2.h=1.8f;
        
        Circulo c1=new Circulo();
        c1.r=4;
        Circulo c2=new Circulo();
        c2.r=1;
        Circulo c3=new Circulo();
        c3.r=6.4f;
        
        Triangulo t1=new Triangulo();
        t1.b=7;
        t1.h=2.8f;
        
        Triangulo t2=new Triangulo();
        t2.b=3;
        t2.h=1.5f;
        
        Triangulo t3=new Triangulo();
        t3.b=9;
        t3.h=6.8f;
        //Un arreglo es un objeto  que reune elementos
        // de una misma familia, por ejemplo:numeros, frutas, alumnos, etc.
        //Vamos a generar una familia de enteros, es decir un arreglo de
        //numeros:
        int []x={4,12,67,-5};
        String []mensaje={"hola", "como", "estas"};
        
        System.out.println("El arreglo x es de tamaño "+x.length);
        System.out.println("El arreglo mensaje es de tamaño "+mensaje.length);
        
        
    }
}
