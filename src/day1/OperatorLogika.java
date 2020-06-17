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
public class OperatorLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int NilaiBener = 6;
        int nilaiTebakan;
        boolean status;
        
        System.out.print("masukan nilai tebakan anda : ");
        nilaiTebakan= in.nextInt();
        System.out.println("nilai tebakan anda : "+nilaiTebakan);
        status = (nilaiTebakan == NilaiBener);
        System.out.println("ststus tebakan anada "+status);
        
        //aljabar boolean
        System.out.print("nilai antara 6 dan 10 : ");
        nilaiTebakan= in.nextInt();
        status = (nilaiTebakan>6) && (nilaiTebakan<10);
        System.out.println("status nilai "+status);
    }
    
}
