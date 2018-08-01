/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefights;

import isCryptSolution.IsCryptSolution;

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
        String[] crypt={"SEND","MORE","MONEY"};
        char[][] solution = {{'O','0'},{'M','1'},{'Y','2'},{'E','5'},{'N','6'},{'D','7'},{'R','8'},{'S','9'}};
        boolean respuesta;
        
        IsCryptSolution ics = new IsCryptSolution();
        respuesta = ics.isCryptSolution(crypt, solution);
        
        System.out.println(respuesta);
        
    }
    
}
