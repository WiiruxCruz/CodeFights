/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku2;

/**
 *
 * @author wii64
 */
public class Sudoku2 {
    public Sudoku2(){
    }
    
    public boolean sudoku2(char[][] grid){
        
        //System.out.println("Test");
        boolean respuesta;
        respuesta = validacionHorizontal(grid);
        //System.out.println("Esto vale respuesta: "+respuesta);
        
        if (respuesta){
            
            respuesta = validacionVertical(grid);
            if(respuesta){
                respuesta = obtener3x3(grid);
            }
        }
        
        return respuesta;
    }
    
    public boolean validacionHorizontal(char[][] grid){
        boolean posibleValido = true;
        char caracterActual;
        int numero;
        int[][] matrizAuxiliar = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                caracterActual = grid[i][j];
                if(caracterActual!='.'){
                    //entonces es un numero
                    numero = caracterActual - 48 - 1;
                    if(matrizAuxiliar[i][numero] == 1){
                        posibleValido = false;
                        break;
                    }
                    
                    matrizAuxiliar[i][numero] = 1;
                }
            }
            //para salir del ciclo
            if (!posibleValido) {
                break;
            }
        }
        //System.out.println("Esto regresa validacionHorizontal: "+posibleValido);
        return posibleValido;
    }
    
    public boolean validacionVertical(char[][] grid){
        boolean posibleValido = true;
        char caracterActual;
        int numero;
        int[][] matrizAuxiliar = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                caracterActual = grid[j][i];
                if(caracterActual!='.'){
                    //entonces es un numero
                    numero = caracterActual - 48 - 1;
                    if(matrizAuxiliar[i][numero] == 1){
                        posibleValido = false;
                        break;
                    }
                    
                    matrizAuxiliar[i][numero] = 1;
                }
            }
            //para salir del ciclo
            if (!posibleValido) {
                break;
            }
        }
        //System.out.println("Esto regresa validacionVertical: "+posibleValido);
        return posibleValido;
    }
    
    public boolean obtener3x3(char[][] grid){
        char[][] matrizTemporal3x3 = new char[3][3];
        boolean posibleValido = true;
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
            
                matrizTemporal3x3[0][0] = grid[i][j];
                matrizTemporal3x3[0][1] = grid[i][j + 1];
                matrizTemporal3x3[0][2] = grid[i][j + 2];
                
                matrizTemporal3x3[1][0] = grid[i + 1][j];
                matrizTemporal3x3[1][1] = grid[i + 1][j + 1];
                matrizTemporal3x3[1][2] = grid[i + 1][j + 2];
                
                matrizTemporal3x3[2][0] = grid[i + 2][j];
                matrizTemporal3x3[2][1] = grid[i + 2][j + 1];
                matrizTemporal3x3[2][2] = grid[i + 2][j + 2];
                
                posibleValido = validacion3x3(matrizTemporal3x3);
                
                //Si es falso
                if(!posibleValido){
                    break;
                }
            }
            
            
            
            if(!posibleValido){
                break;
            }
            
            
        }
        return posibleValido;
    }
    
    public boolean validacion3x3(char[][] grid){
        boolean posibleValido = true;
        char caracterActual;
        int numero;
        int[] arregloAuxiliar = new int[9];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                caracterActual = grid[i][j];
                if(caracterActual!='.'){
                    //entonces es un numero
                    numero = caracterActual - 48 - 1;
                    if(arregloAuxiliar[numero] == 1){
                        posibleValido = false;
                        break;
                    }

                    arregloAuxiliar[numero] = 1;
                }
            }
            //para salir del ciclo
            if (!posibleValido) {
                break;
            }
        }
        
        //System.out.println("Esto regresa validacionHorizontal: "+posibleValido);
        return posibleValido;
    }
}
