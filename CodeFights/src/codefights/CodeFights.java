/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefights;

import sudoku2.Sudoku2;

/**
 *
 * @author wii64
 */
public class CodeFights { 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] sudoku=  {{'.','.','.','.','.','.','5','.','.'}, 
 {'.','.','.','.','.','.','.','.','.'}, 
 {'.','.','.','.','.','.','.','.','.'}, 
 {'9','3','.','.','2','.','4','.','.'}, 
 {'.','.','7','.','.','.','3','.','.'}, 
 {'.','.','.','.','.','.','.','.','.'}, 
 {'.','.','.','3','4','.','.','.','.'}, 
 {'.','.','.','.','.','3','.','.','.'}, 
 {'.','.','.','.','.','5','2','.','.'}};
    ;
        boolean respuesta;
        Sudoku2 s2 = new Sudoku2();
        respuesta = s2.sudoku2(sudoku);
        
        System.out.println(respuesta);
        
    }
    
}
