/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Random;

/**
 *
 * @author Yeison
 */
public class Codigo {
    public int[] obtenerNumeros() {
        
        int[] numeros = new int[12];
        int x = 0;
        
        while(x < 12) {
            Random r = new Random();
            int num = r.nextInt(6) + 1;
            int y = 0;
            
            for (int i = 0; i < 12; i++) {
                if(numeros[i] == num) {
                    y++;
                }
            }
            if(y < 2) {
                numeros[x] = num;
                x++;
            }            
        }        
        return numeros;
    }
}
