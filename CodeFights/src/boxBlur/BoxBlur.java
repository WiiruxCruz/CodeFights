/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxBlur;

/**
 *
 * @author wii64
 */
public class BoxBlur {

    public BoxBlur() {
    }

    public int[][] boxBlur(int[][] image) {
        int filas = image.length;
        int columnas = image[0].length;
        int limiteXfila = columnas - 2;
        int sumaTemporal = 0;
        int posicionFila = 0;
        int posicionColumna = 0;
        int[][] respuesta = new int[filas - 2][columnas - 2];
        for (int i = 0; i < filas - 2; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaTemporal += image[i][j];
                sumaTemporal += image[i + 1][j];
                sumaTemporal += image[i + 2][j];
                //evalua el cuadrado de 3x3
                if ((j + 1) >= 3) {
                    respuesta[posicionFila][posicionColumna] = sumaTemporal / 9;
                    posicionColumna++;
                    //es el ultimo cuadrado a evaluar en la fila actual
                    if (posicionColumna == limiteXfila) {
                        posicionFila++;
                        posicionColumna = 0;
                    }
                    //no es necesario recalcular todo el cuadrado, solo restar la que fue la primera fila
                    sumaTemporal -= image[i][j - 2];
                    sumaTemporal -= image[i + 1][j - 2];
                    sumaTemporal -= image[i + 2][j - 2];
                }

            }
            //Es necesario reinicar la cuenta porque es una nueva fila
            sumaTemporal = 0;

        }
        return respuesta;
    }
}
