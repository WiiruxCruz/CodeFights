/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstDuplicate;

/**
 *
 * @author wii64
 */
public class FirstDuplicate {
    public FirstDuplicate(){
    };
    int method(int arregloOriginal[]){
        int[] arregloAuxiliar = new int[arregloOriginal.length];
        int valor;
        int ultimoIndice = 2147483647;
        int resultado = -1;
        for(int i = 0; i<arregloOriginal.length; i++){
            valor = arregloOriginal[i];
            //es un duplicado
            if(arregloAuxiliar[valor] == 1){
                resultado = valor;
                //System.out.println("Encontré dupliado en: " + valor);
                break;
                /*
                //esta parte hay que revisarla
                if(i < ultimoIndice){
                    ultimoIndice = i;
                }
                else{
                    if(i > ultimoIndice)
                        break;
                }
                */
            }
            else{
                arregloAuxiliar[valor] = 1;
            }
            
        }
        
        return resultado;
    }
}
