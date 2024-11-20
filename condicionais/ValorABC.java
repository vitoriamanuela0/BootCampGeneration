package condicionais;


/*
 * Programa que pede para o usuário entrar com 3 valores inteiros (A, B e C), faz a soma do valor A e B e tem 3 condições de respostas a patir desse resultado.
 */


import java.util.Scanner;

public class ValorABC {

	public static void main(String[] args) {
		
// ---------------------------------------------------------------------------------------------------------------//
		Scanner scanner = new Scanner(System.in);
		
		int valorA, valorB, valorC, soma;
// ---------------------------------------------------------------------------------------------------------------//
		
		System.out.print("Digite o valor de A: ");
		valorA = scanner.nextInt();
		
		System.out.print("Digite o valor de B: ");
		valorB = scanner.nextInt();
		
		System.out.print("Digite o valor de C: ");
		valorC = scanner.nextInt();
		
		soma = (valorA + valorB);
		
// ---------------------------------------------------------------------------------------------------------------//		
		
		
		if (soma > valorC) {
			System.out.print("A soma do valor de A e B é maior que o valor de C.");
		}
		
		else if (soma == valorC) {
			System.out.print("A soma do valor de A e B é igual ao valor de C.");
		}
		
		else {
			System.out.print("'A soma do valor de A e B é menor que o valor de C.'");
		}

		// ---------------------------------------------------------------------------------------------------------------//
		
		scanner.close();
	}
}
