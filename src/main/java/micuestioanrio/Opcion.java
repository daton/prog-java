/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micuestioanrio;

//En este paquete estan los arreglos mutables (List) por eso lo 
//Tenemos que importar
import java.util.*;
public class Opcion {
  private String titulo;
private boolean correcto;  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

}
