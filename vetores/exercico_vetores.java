package vetores;

import java.util.Scanner;

public class ExercicoVetores {
    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);
        int numeros[] ={10, 11, 29, 25, 17, 24, 13, 3, 29, 46};
        int posicao;
        int numeroProcurado;

        System.out.print("Digite o número que deseja encontrar: ");
        numeroProcurado = scanner.nextInt();
        
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O número " + numeroProcurado + " está localizado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("Não foi encontrado!");
        }

        scanner.close();
    }
}
