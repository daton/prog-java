/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;


public class Probar {
    public static void main(String[] args) {
        //Primero generamos el objeto Numeros
        Numeros n=new Numeros();
        //Ajustamos sus numeros con sus setters
        n.setX(10);
        n.setY(5);
        //Generamos el objeto operaciones aritmeticas
        OperacionesAritmeticas op=new OperacionesAritmeticas();
        //Asignamos el objeto numeros a las operecaciones
        op.setNumeros(n); 
        //Imprimimos el resultado
        System.out.println("La suma es "+op.sumar());
        
    }
}
