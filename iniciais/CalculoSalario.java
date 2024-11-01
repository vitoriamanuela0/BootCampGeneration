package iniciais;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float salarioBruto = 0.0f;
        float adicionalNoturno = 0.0f;
        float descontos = 0.0f;
        float horaExtra = 0.0f;
        float salarioLiquido = 0.0f;

		
		System.out.print("Entre com o salário bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.print("Entre com o adicionalNoturno bruto: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.print("Entre com as Horas extras bruto: ");
		horaExtra = scanner.nextFloat();
		
		

		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - descontos;
		
		System.out.print(salarioLiquido);
		
	}

}
