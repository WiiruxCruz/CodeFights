/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areSimilar;

/**
 *
 * @author wii64
 */
public class AreSimilar {
    public AreSimilar(){
    }
    
    public boolean areSimilar(int[] a, int[] b){
        boolean respuesta = true;
        int longitud = a.length;
        int aux;
        int cambios = 0;
        //longitud de 3 minimo
        //if(longitud > 1){
            
            for (int i = 0; i < longitud; i++) {
                if(a[i] == b[i]){
                }
                //son diferentes
                else {
                    //hubo un cambio antes y posiblemente haya otro, si se da o no, no interesa
                    if(cambios == 1){
                        respuesta = false;
                        break;
                    }
                    else{
                        for (int j = i+1; j < longitud; j++) {
                            if(a[i]==b[j]){
                                if(a[j]==b[j]) //Ese par es similar, omitelo y busca otro candidato
                                {}
                                else{
                                    aux = b[i];
                                    b[i] = b[j];
                                    b[j] = aux;
                                    cambios++;

                                    if(cambios>1){
                                        respuesta = false;
                                        break;
                                    }
                                    break;
                                }
                            }
                            //son diferentes
                            else{
                                if(j == longitud-1){
                                    respuesta = false; //Se acabaron los numeros
                                    break;
                                }
                            }
                        }
                    }
                }
                
                if(!respuesta)
                    break;
            }
            //dudoso
            if(respuesta && cambios < 2){
                if(a[longitud-1] != b[longitud-1])
                    respuesta = false;
            }
            
        //}
        
        return respuesta;
    }
}
