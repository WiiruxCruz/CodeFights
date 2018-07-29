/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstNotRepeatingCharacter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wii64
 */
public class JavaFinal {
    public static void main(String arg[]){
        //Restriccion: debe iterar 1 vez
        //String s = "abacabad";
        String s = "abacabaabacaba";
        char respuesta;
        FirstNotRepeatingCharacter fnrc = new FirstNotRepeatingCharacter();
        respuesta = fnrc.firstNotRepeatingCharacter(s);
        
        System.out.println(respuesta);
        
        //int valorCaracter = ' ';
        //System.out.println(valorCaracter);
    }
}
