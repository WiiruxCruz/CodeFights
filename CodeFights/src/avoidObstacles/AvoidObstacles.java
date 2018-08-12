/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avoidObstacles;

/**
 *
 * @author wii64
 */
public class AvoidObstacles {

    public AvoidObstacles() {
    }

    public int avoidObstacles(int[] inputArray) {
        int longitud = inputArray.length;
        int solucion = 2;
        boolean finSolucion = false;
        while (!finSolucion) {
            for (int i = 0; i < longitud; i++) {
                if (inputArray[i] % solucion == 0) {
                    solucion++;
                    finSolucion = false;
                    break;
                } else {
                    finSolucion = true;
                }
            }
        }
        return solucion;

    }
}
