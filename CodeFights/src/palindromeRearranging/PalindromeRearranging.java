/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeRearranging;

import java.util.ArrayList;

/**
 *
 * @author wii64
 */
public class PalindromeRearranging {
    public PalindromeRearranging(){
    }
    
    public boolean palindromeRearranging(String inputString){
        
        ArrayList<String> caracteres = new ArrayList<>();
        ArrayList<Integer> cuenta = new ArrayList<>();
        int longitud = inputString.length();
        char caracterActual;
        String caracterString;
        int indice = -1;
        boolean unicoImpar = false;
        boolean respuesta = true;
        for (int i = 0; i < longitud; i++) {
            caracterActual = inputString.charAt(i);
            
            //si lo contiene regresa diferente de -1
            caracterString = caracterActual + "";
            indice = caracteres.indexOf(caracterString);
            
            //no esta
            if(indice == -1){
                caracteres.add(caracterString);
                cuenta.add(1);
            }
            //ya hay uno
            else{
                cuenta.set(indice, cuenta.get(indice)+1);
            }
            
            
        }
        
        for (int i = 0; i < caracteres.size(); i++) {
            if(!unicoImpar){
                if(cuenta.get(i)%2 == 1 ){
                    unicoImpar = true;
                }
            }
            else{
                if(cuenta.get(i)%2 == 1){
                    respuesta = false;
                    break;
                }
            }
            
        }
        
        return respuesta;
    }
}
