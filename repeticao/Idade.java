package repeticao;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade = 0;
		int menor21 = 0;
		int maior50 = 0;
		
		System.out.println("Entre com as idades (programa encerra quando entrar com idade negativa): ");
	    
	    while (true) {
	    	
		    idade = scanner.nextInt();
	    	
	    	if (idade < 0) {
	    		System.out.println("Fim! Idade nagativa");
	    		break;
	    	}
	    	
	    	else if (idade < 21) {
	    		menor21 ++;
	    	}
	    	
	    	else if (idade > 50) {
	    		maior50++;
	    	}
	    }
	    
	    System.out.println("A quantidade de pessoas com menos de 21 anos é de: " + menor21);
	    System.out.println("A quantidade de pessoas com mais de 50 anos é de: " + maior50);

		scanner.close();
	}

}
