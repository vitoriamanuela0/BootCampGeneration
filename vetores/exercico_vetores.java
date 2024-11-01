package vetores;

import java.util.Scanner;

public class exercico_vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];

        // 1. Preenchendo o vetor com números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < number.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            number[i] = scanner.nextInt();
        }

        // 2. Pedindo ao usuário um número para pesquisar
        System.out.print("Digite um número para pesquisar no vetor: ");
        int numeroPesquisado = scanner.nextInt();

        // 3. Pesquisando o número no vetor
        boolean encontrado = false;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == numeroPesquisado) {
                System.out.println("O número " + numeroPesquisado + " foi encontrado na posição: " + i);
                encontrado = true;
                break; // Para o loop assim que encontra
            }
        }

        // 4. Mensagem caso não seja encontrado
        if (!encontrado) {
            System.out.println("Não foi encontrado!");
        }

        scanner.close(); // Fecha o scanner
    }
}
