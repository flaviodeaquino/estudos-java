package loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120 (5x4x3x2x1)
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = 1;
        
        System.out.println("Digite o número que você deseja o fatorial: ");
        int numero = scan .nextInt();

        for (int i = 1; i <= (numero); i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O valor de " + numero + "! é igual a " + fatorial);
    }
    
}
