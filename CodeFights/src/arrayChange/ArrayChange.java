/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayChange;

/**
 *
 * @author wii64
 */
public class ArrayChange {
    public ArrayChange(){
    }
    
    public int arrayChange(int[] inputArray){
        int longitud = inputArray.length;
        int respuesta = 0;
        int resta;
        for (int i = 0; i < longitud-1; i++) {
            int numero1 = inputArray[i];
            int numero2 = inputArray[i+1];
            if(numero2 <= numero1){
                resta = numero1 - numero2;
                if(resta < 0){
                    resta *= -1;
                }
                respuesta += resta + 1;
                inputArray[i+1] = numero1+1;
            }
            
        }
        return respuesta;
    }
}
