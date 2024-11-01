package repeticao;

import java.util.Scanner;

public class NumInteiros {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
		
		int number1 = 0;
		int number2 = 0;
		
		
			
		System.out.println("Entre com o primeiro número : ");
		number1 = scanner.nextInt();
		
		System.out.println("Entre com o segundo número : ");
		number2 = scanner.nextInt();
		
		
		
		if (number1 > number2) {
			
			System.out.print("Intervalo inválido! Tente novamente.");
			return;
		} 
		
		for (int num = number1; num <= number2; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
	    
		}
		  scanner.close();
   }
}
}
