/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3java;

import java.util.Scanner;

/**
 *
 * @author kawan
 */
public class lista3java_kawandosreis_60002078_exerciocio1  {

 
 
    public static void main(String[] args) {
        int cont1;
        int cont2; Scanner s = new Scanner(System.in);
        System.out.println("informe 1 numero ");
        cont1 = s.nextInt();
        System.out.println("informe outro numero");
            cont2 = s.nextInt();
       while (cont1 < cont2) {            
            System.out.println("numeros entre num 1 e num 2 sao " + cont1);
                           cont1++;}
       
            while (cont1 > cont2){
                
                        System.out.println("numeros entre num 1 e num 2 sao " + cont1);
            cont1--;   
                
       }
        
        
        
        
        
        
        
    }
    
}
