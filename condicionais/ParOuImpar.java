package condicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número inteiro e descubra se é ímpar ou par, e positio ou negativo: ");
		numero = leia.nextInt();
		
		if (numero > 0) {
			System.out.print("O número " + numero + " é positivo ");
		}
		else {
			System.out.print("O número " + numero + " é negativo ");
		}
		
		if (numero % 2 == 0) {
			System.out.print("e par.");
		}
		
		else {
			System.out.print("e ímpar.");
		}
		leia.close();
		
	}

}
