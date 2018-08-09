/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayMaximalAdjacentDifference;

/**
 *
 * @author wii64
 */
public class ArrayMaximalAdjacentDifference {
    public ArrayMaximalAdjacentDifference(){
    }
    
    int arrayMaximalAdjacentDifference(int[] inputArray){
        int longitud = inputArray.length;
        int maximaDiferencia = 0;
        int resta;
        for (int i =0; i < longitud - 1; i++) {
            resta = inputArray[i] - inputArray[i+1];
            if(resta < 0 ){
                resta *= -1;
            }
            if(resta>maximaDiferencia)
                maximaDiferencia = resta;
        }
        return maximaDiferencia;
    }
}
