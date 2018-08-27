/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author wii64
 */
public class Minesweeper {

    public Minesweeper() {
    }

    public int[][] minesweeper(boolean[][] matrix) {
        int filas = matrix.length;
        int columnas = matrix[0].length;

        boolean restarFila = false;
        boolean sumarFila = false;
        boolean restarColumna = false;
        boolean sumarColumna = false;

        int[][] respuesta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {

            if (i > 0) {
                restarFila = true;
            } else {
                restarFila = false;
            }
            //estamos en el borde, no podemos buscar una fila despues
            if (i == filas - 1) {
                sumarFila = false;
            } else {
                sumarFila = true;
            }
            for (int j = 0; j < columnas; j++) {
                //Estamos en la celda actual

                //podemos buscar una fila antes
                //Podemos buscar una columna antes
                if (j > 0) {
                    restarColumna = true;
                } else {
                    restarColumna = false;
                }
                //estamos en el borde, no podemos buscar una columna despues
                if (j == columnas - 1) {
                    sumarColumna = false;
                } else {
                    sumarColumna = true;
                }

                respuesta[i][j] = buscarMinas(matrix, i, j, sumarFila, restarFila, sumarColumna, restarColumna);
            }
        }
        return respuesta;
    }

    public int cuentaMinas(boolean[][] matrix, int filaActual, int restaFila, int sumaFila, int columnaActual, int restaColumna, int sumaColumna) {
        int cuentaBanderas = 0;
        for (int i = filaActual - restaFila; i <= filaActual + sumaFila; i++) {
            for (int j = columnaActual - restaColumna; j <= columnaActual + sumaColumna; j++) {
                //si tiene true suma 1
                if (matrix[i][j]) {
                    cuentaBanderas++;
                }
            }
        }
        return cuentaBanderas;
    }

    public int buscarMinas(boolean[][] matrix, int filaActual, int columnaActual,
            boolean sumarFila, boolean restarFila, boolean sumarColumna, boolean restarColumna) {
        int cuentaBanderas = 0;
        int sumaFila = 0;
        int restaFila = 0;
        int sumaColumna = 0;
        int restaColumna = 0;
        //busco en la fila de arriba y abajo
        if (sumarFila && restarFila) {
            sumaFila = 1;
            restaFila = 1;
            //NO esta en ningun borde
            if (sumarColumna && restarColumna) {
                sumaColumna = 1;
                restaColumna = 1;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);

            } else if (sumarColumna && !restarColumna) {
                sumaColumna = 1;
                restaColumna = 0;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            } else if (!sumarColumna && restarColumna) {
                sumaColumna = 0;
                restaColumna = 1;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            }
        } else if (sumarFila && !restarFila) {
            sumaFila = 1;
            restaFila = 0;
            if (sumarColumna && restarColumna) {
                sumaColumna = 1;
                restaColumna = 1;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            } else if (sumarColumna && !restarColumna) {
                sumaColumna = 1;
                restaColumna = 0;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            } else if (!sumarColumna && restarColumna) {
                sumaColumna = 0;
                restaColumna = 1;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            }
        } else if (!sumarFila && restarFila) {
            sumaFila = 0;
            restaFila = 1;
            if (sumarColumna && restarColumna) {
                sumaColumna = 1;
                restaColumna = 1;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            } else if (sumarColumna && !restarColumna) {
                sumaColumna = 1;
                restaColumna = 0;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            } else if (!sumarColumna && restarColumna) {
                sumaColumna = 0;
                restaColumna = 1;
                cuentaBanderas += cuentaMinas(matrix, filaActual, restaFila, sumaFila, columnaActual, restaColumna, sumaColumna);
            }
        }

        //Restarle su propia mina
        if (matrix[filaActual][columnaActual]) {
            cuentaBanderas--;
        }

        return cuentaBanderas;
    }

}
