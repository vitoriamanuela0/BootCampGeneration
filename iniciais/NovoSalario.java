package iniciais;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário atual: ");
        float salario = scanner.nextFloat();

        System.out.print("Digite o abono: ");
        float abono = scanner.nextFloat();

        float novoSalario = salario + abono;

        System.out.println("Seu novo salário é: R$" + novoSalario + ".");

        scanner.close();
	}

}
