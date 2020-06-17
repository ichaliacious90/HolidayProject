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
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner (System.in);
        System.out.println("nama : ");
        input = in.nextLine();
        
        switch  (input) {
            case "rubiana" :
                System.out.println("kagak ada");
                break;
            case "ucup" :
                System.out.println("ada");
        }
    }
    
}
