/*sot
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kawan
 */
public class lista3java_kawandosreis_60002078_exerciocio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);
        int nu1, nu2;
        do {
            System.out.println("informe um numero");

            nu1 = s.nextInt();
            nu2 = nu1;
            int certa = num;
            if (nu1 < num) {
                System.out.println("digite um numero maior");
            } else if (nu1 == num) {
                System.out.println("voce acertou");
            } else {
                System.out.println("digite um numero menor");
            }

        } while (nu1 != num);

    }
}
