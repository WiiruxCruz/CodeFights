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
class FirstNotRepeatingCharacter {
    public FirstNotRepeatingCharacter(){
    }

    char firstNotRepeatingCharacter(String s) {
        char respuesta;
        int longitud = s.length();
        int coincidencia;
        int indice = -1;
        char caracterActual;
        List<Integer> ar = new ArrayList<>();
        List<String> ar2 = new ArrayList<>();
        for(int i = 0; i<longitud;i++){
            caracterActual = s.charAt(i);
            //s.chartAt(i)
            coincidencia = ar2.indexOf(caracterActual+"");
            
            //no hay coincidencia, entonces agregalo
            if(coincidencia == -1){
                ar2.add(caracterActual+"");
                ar.add(1);
            }
            //ya existe, le suma la coincidencia
            else {
                ar.set(coincidencia, ar.get(coincidencia)+1);
            }
        }        
        //obten la primera coincidencia
        //coincidencia = ar.indexOf(1);
        
        for(int i = 0; i<ar2.size(); i++){
            if(ar.get(i) ==  1 ){
                indice = i;
                break;
            }
        }
        
        
        if(indice == -1){
            respuesta = '_';
        }
        else{
            respuesta = ar2.get(indice).charAt(0);
        }
        return respuesta;
    }
    
}
