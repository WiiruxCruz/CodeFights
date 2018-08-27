/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabeticShift;

/**
 *
 * @author wii64
 */
public class AlphabeticShift {
    public AlphabeticShift(){
    }
    
    public String alphabeticShift(String inputString){
        int longitud = inputString.length();
        String respuesta = "";
        char caracterActual;
        for (int i = 0; i < longitud; i++) {
            caracterActual = inputString.charAt(i);
            if(caracterActual == 'z'){
                caracterActual -= 26;
            }
            respuesta += Character.toString((char) (caracterActual + 1));
        }
        return respuesta;
    }
}
