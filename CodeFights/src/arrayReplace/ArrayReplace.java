/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayReplace;

/**
 *
 * @author wii64
 */
public class ArrayReplace {
    public ArrayReplace(){
    }
    
    public int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem){
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == elemToReplace)
                inputArray[i] = substitutionElem;
        }
        
        return inputArray;
    }
    
}
