/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isCryptSolution;

/**
 *
 * @author wii64
 */
public class IsCryptSolution {
    public IsCryptSolution(){
    }
    
    public boolean isCryptSolution(String[] crypt, char[][] solution){
        double suma = 0;
        boolean respuesta = true;
        String[] numeros = {"","",""};//new String[3];
        for (int i = 0; i < 3; i++) {
        //for (String s : crypt) {
            //char[] aux= s.toCharArray();
            char[] aux = crypt[i].toCharArray();
            char caracterActual;
            for (int j = 0; j < aux.length; j++) {
                caracterActual = aux[j];
                for (int k = 0; k < solution.length; k++) {
                    //si son iguales entonces prepara la salida
                    //if (j == 0)
                    if(solution[k][0] == caracterActual){
                        numeros[i] += solution[k][1];
                    }
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Esto vale numeros en "+i+" : "+numeros[i]);
            if(numeros[i].length() != 1)
            if(numeros[i].charAt(0) - 48 ==0){
                respuesta = false;
                break;
            }
            else{
                suma += Double.parseDouble(numeros[i]);
            }
        }
        
        //revisar el ultimo numero
        if(numeros[2].length()!=1)
            if(numeros[2].charAt(0) - 48 == 0){
                respuesta = false;
            }
        
        if (respuesta){
            if (suma != Double.parseDouble(numeros[2])){
                respuesta = false;
            }
        }
        
        return respuesta;
    }

}
