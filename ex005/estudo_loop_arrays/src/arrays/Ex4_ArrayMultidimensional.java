package arrays;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matriz = new int[4][4];

        for(int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : Matriz) {
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaC'oluna + " ");
            }
            System.out.println();
        }
    }
    
}
