/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessBoardCellColor;

/**
 *
 * @author wii64
 */
public class ChessBoardCellColor {
    public ChessBoardCellColor(){
    }
    
    public boolean chessBoardCellColor(String cell1, String cell2) {
    int valor11 = cell1.charAt(0)%2;
    int valor12 = cell1.charAt(1)%2;
    
    int valor21 = cell2.charAt(0)%2;
    int valor22 = cell2.charAt(1)%2;
    
    return (valor11+valor12)%2 == (valor21+valor22)%2;
    }
}
