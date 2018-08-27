/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleOfNumbers;

/**
 *
 * @author wii64
 */
public class CircleOfNumbers {
    public CircleOfNumbers(){
    }
    
    public int circleOfNumbers(int n, int firstNumber){
        return (firstNumber + n/2)%n;
    }
}
