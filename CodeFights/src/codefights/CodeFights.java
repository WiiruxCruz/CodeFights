/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefights;

import alphabeticShift.AlphabeticShift;
import isIPv4Address.IsIPv4Address;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minesweeper.Minesweeper;



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
        //String ip = "192.168.0.1a";
        AlphabeticShift as = new AlphabeticShift();
        
        String respuesta = as.alphabeticShift("abcdez");
        
        System.out.println(respuesta);
        
        System.out.println((int)'a');
    }
    
}
