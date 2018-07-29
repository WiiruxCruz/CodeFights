/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotateImage;

/**
 *
 * @author wii64
 */
public class RotateImage {
    public RotateImage(){
    }
    
    public int[][] rotateImage(int a[][]){
        int n = a[0].length;
        int aux = n - 1;
        int[][] respuesta = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n ; j++){
                respuesta[j][aux] = a[i][j];
            }
            aux--;
        }
        //System.out.println(a[1][2]);
        //System.out.println("Esto es a:"+n);
        //System.out.println(respuesta[0][0]);
        //System.out.println(respuesta[0][1]);
        //System.out.println(respuesta[0][2]);
        return respuesta;
    }
}
