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
public class Circulo extends Poligono{
    float r;
    @Override
    public float calcularArea() {
        float area=2*3.1416f*r;
        return area;
    }

    @Override
    public String obtenerNombre() {
        return "Yo soy un circulo";
    }
    
}
