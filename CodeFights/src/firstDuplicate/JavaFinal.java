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
public class JavaFinal {
    public static void main(String arg[]){
        int[] arreglo = {2, 1, 3, 5, 3, 2};
        FirstDuplicate fd = new FirstDuplicate();
        int salida = fd.method(arreglo);
        System.out.println(salida);
    }
}
