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
public class Rectangulo extends Poligono{

    float b;
    float h;
    @Override
    public float calcularArea() {
        float area=b*h;
        return area;
    }
    
}
