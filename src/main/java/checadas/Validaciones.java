/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checadas;

/**
 *
 * @author juan_
 */
public class Validaciones {
    public static void validarMayor(int edad) throws MenorDeEdadException {
        if(edad<18)throw new MenorDeEdadException();
    }
}
