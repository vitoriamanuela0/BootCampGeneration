package iniciais;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);
        
        float nota1, nota2, nota3, nota4, media;

        System.out.print("Entre com a nota 1: ");
        nota1 = scanner.nextFloat();

        System.out.print("Entre com a nota 2: ");
        nota2 = scanner.nextFloat();

        System.out.print("Entre com a nota 3: ");
        nota3 = scanner.nextFloat();

        System.out.print("Entre com a nota 4: ");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media das notas e de: " + media);

        scanner.close();
	}

}
