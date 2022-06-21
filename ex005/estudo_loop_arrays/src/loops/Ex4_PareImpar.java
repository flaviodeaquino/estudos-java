package loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares.
 */

public class Ex4_PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        String resposta = "S";

        do {
            
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) quantidadePar++;
            else quantidadeImpar++;
        
            System.out.println("Deseja continuar [S/N]?  ");
            resposta = scan.next().toUpperCase();

        } while (resposta.equals("S"));        
        
        System.out.println("A quantidade de números pares digitados foi: " + quantidadePar);
        System.out.println("A quantidade de números ímpares digitados foi: " + quantidadeImpar);
        
    }
}
