/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wii64
 */
public class VariableName {
    public VariableName(){
    }
    
    public boolean variableName(String name){
        int longitud = name.length();
        boolean respuesta = true;
        
        switch(name.charAt(0)){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                respuesta = false;
        }
        if(respuesta){
            Pattern p = Pattern.compile("[^0-9a-zA-Z_]");
            Matcher m = p.matcher(name);
            //si contiene otra cosa aparte de numeros
            if(m.find()){
                respuesta = false;
            }
        }
        
        return respuesta;
    }
}
