/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amendTheSentence;

/**
 *
 * @author wii64
 * NOTAS
 * int a = 'Z'; //65 A, 90 Z
        char b = (char)65+32; //+32 convierte en minusculas
        
        String c = "Salida";
        a = c.charAt(1);
        System.out.println(c.substring(1));
        System.out.println("Esto es a:"+a);
        //Invoca Garbage Collector, solo se indica no significa que se aplique inmediatamente, eso lo decide la JVM
        System.gc();
        /*
        String[] crypt={"SEND","MORE","MONEY"};
        char[][] solution = {{'O','0'},{'M','1'},{'Y','2'},{'E','5'},{'N','6'},{'D','7'},{'R','8'},{'S','9'}};
        boolean respuesta;
        
        IsCryptSolution ics = new IsCryptSolution();
        respuesta = ics.isCryptSolution(crypt, solution);
        
        System.out.println(respuesta);
 */
public class AmendTheSentence {
    public AmendTheSentence(){
    }
    
    String amendTheSentence(String s) {
        String salida="";
        int caracter;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) < 91){ //es mayuscula
                caracter = s.charAt(i) + 32;
                salida+= " "+ (char) caracter;
            }
            else{
                salida+= s.charAt(i);
            }
        }
        if(salida.charAt(0)==' ')
            return salida.substring(1);
        else
            return salida;
    }

}
