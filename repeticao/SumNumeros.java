package repeticao;

import java.util.Scanner;

public class SumNumeros {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

				int numero;
				int sumNumero = 0;

		

		do {
			System.out.print("Entre com números inteiros (número 0 encerra o programa): ");
		    numero = scanner.nextInt();

		if (numero > 0) {
			sumNumero += numero;
		
		} 
	} while (numero != 0);
	
	System.out.print("A soma dos números posistivos é de: " + sumNumero);
		       
	scanner.close();
	}

}
