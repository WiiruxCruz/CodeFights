/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefights;

import isIPv4Address.IsIPv4Address;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



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
        String ip = "255..255.255.255";
        boolean respuesta = true;
        IsIPv4Address ipv4 = new IsIPv4Address();
        /*
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(ip);
        System.out.println(m.find());
        */
        
        respuesta = ipv4.isIPv4Address(ip);
        
        System.out.println(respuesta);
        
        //String[] split = ip.split("."); //regresa 0
        
        
        /*
        System.out.println("Esto es longitud: "+split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        */
    }
    
}
