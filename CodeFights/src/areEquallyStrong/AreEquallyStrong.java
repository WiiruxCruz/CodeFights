/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areEquallyStrong;

/**
 *
 * @author wii64
 */
public class AreEquallyStrong {
    public AreEquallyStrong(){
    }
    
    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        boolean respuesta = false;
        if(yourLeft == friendsLeft && yourRight == friendsRight){
            respuesta = true;
        } else if (yourLeft == friendsRight && yourRight == friendsLeft){
            respuesta = true;
        }
        return respuesta;
    }
}
