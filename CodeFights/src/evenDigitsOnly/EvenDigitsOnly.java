/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenDigitsOnly;

/**
 *
 * @author wii64
 */
public class EvenDigitsOnly {
    public EvenDigitsOnly(){
    }
    
    public boolean evenDigitsOnly(int n) {
        boolean respuesta = true;
        String numero = n+"";
        for(int i=0; i<numero.length(); i++){
            switch(numero.charAt(i)+""){
                case "1":
                case "3":
                case "5":
                case "7":
                case "9":
                    respuesta = false;
                    break;
            }
        }

        return respuesta;
    }

    
}
