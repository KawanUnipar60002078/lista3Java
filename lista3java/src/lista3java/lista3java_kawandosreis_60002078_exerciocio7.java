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
public class lista3java_kawandosreis_60002078_exerciocio7 {
    public static void main(String[] args) {
        int valor;
        int soma = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("informe 0 para parar");
        do {
            System.out.println("informe um numero meltiplo de 3");
            valor = s.nextInt();

            if (valor >= 0 && valor <= 100) {
                if (valor % 2 == 1 && valor %3 == 0) {
                    soma = soma + valor;
                }
            }else{
                System.out.println("informe um valor valido");
            }
        } while (valor != 0);
        System.out.println("o valor da soma e" + soma );
        
        
    }

}
