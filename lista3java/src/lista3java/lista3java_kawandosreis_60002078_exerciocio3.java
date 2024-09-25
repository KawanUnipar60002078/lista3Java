/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3java;

import java.util.Scanner;

/**
 *
 * @author kawan
 */
public class lista3java_kawandosreis_60002078_exerciocio3 {

    public static void main(String[] args) {
        int cont1;
        int cont2;
        Scanner s = new Scanner(System.in);
        System.out.println("informe 1 numero ");
        cont1 = s.nextInt();
        System.out.println("informe outro numero");
        cont2 = s.nextInt();
        System.out.println("numeros entre "+ cont1 +" e " +  cont2 +" sao ");
        if (cont1 < cont2){
        cont1++;
        
        }else{
        cont1--;
       
        }
        while (cont1 < cont2) {
            
            System.out.println(cont1);
            cont1++;
            
        }

        while (cont1 > cont2) {

            System.out.println("numeros entre num 1 e num 2 sao " + cont1);
            cont1--;

        }

    }
}
