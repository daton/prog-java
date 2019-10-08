/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author T101
 */
public class Conversor {
    
    public String convertir(String valor){
        StringBuilder builder=new StringBuilder();
        byte[] arreglo=valor.getBytes();
        for(byte b:arreglo){
            builder.append(b);
        }
        return builder.toString();
    }
    
}
