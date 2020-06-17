/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author ADMIN
 */
public class NestedIf {
    public static void main(String[] args) {
        int a= 7;
        int b=10;
        
        System.out.println("awal program");
        
        if (a == 5) {
            if (b == 10) {
                System.out.println("ini adsalah aksi dimana a= 5 dan b = 10");   
            }
            else
                System.out.println(" aksi dimana a = 5, b bukan 10");
        }
        else 
            System.out.println(" maka a bukan 5 dan b bukan 10");
    }
    
}
