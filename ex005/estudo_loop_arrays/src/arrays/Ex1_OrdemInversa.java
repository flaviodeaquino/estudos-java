package arrays;

/*
 * Ordene um vetor
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        // Ordenar vetor
        for (int i = 0; i <= 4; i++) {
            for (int j = i+1; j <= 5; j++) {
                if (vetor[i] > vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println("O vetor ordenado:");
        for (int i = 0; i <= 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        
        // Inverter vetor

        int[] vetor2 = {-5, -6, 15, 50, 8, 4};

        System.out.print("\nVetor original: ");
        int count = 0;
        while (count < (vetor2.length)) {
            System.out.print(vetor2[count] + " ");
            count++;
        }

        System.out.print("\nVetor invertido: ");
        for (int i = (vetor2.length - 1); i >=0; i--) {
            System.out.print(vetor2[i] + " ");
        }





        
    }    
}
