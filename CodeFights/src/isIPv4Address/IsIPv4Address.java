/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isIPv4Address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wii64
 */
public class IsIPv4Address {
    public IsIPv4Address(){
    }
    
    public boolean isIPv4Address(String inputString) {
        boolean respuesta = true;
        int numTemp = -1;
        String[] numeros = inputString.split("[.]"); //regresa 4
        if(numeros.length == 4) {
            for (String aux : numeros) {
                //valida si es un numero de 3 digitos maximo
                if(aux.length()<4 && aux.length()>0){

                    Pattern p = Pattern.compile("[a-zA-Z]");
                    Matcher m = p.matcher(aux);
                    //si contiene otra cosa aparte de numeros
                    if(m.find()){
                        respuesta = false;
                        break;
                    }
                    else{
                        //es un string de max 3 caracteres y minimo de 1, un numero seguro falta la conversion
                        numTemp = Integer.parseInt(aux);
                        //numero invalido
                        if(numTemp < 0 || numTemp > 255){
                            respuesta = false;
                            break;
                        }
                    }
                }
                else{
                    respuesta = false;
                    break;
                }
            }
        }
        else {
            respuesta = false;
        }
        return respuesta;
    }
}
