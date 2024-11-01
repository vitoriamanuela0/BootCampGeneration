package iniciais;


import java.util.Scanner;

public class Produto {
	

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			float n1, n2, n3, n4, produto1, produto2, diferenca;

			
			System.out.print("Entre com o valor 1: ");
			n1 = scanner.nextFloat();
			
			System.out.print("Entre com o valor 2: ");
			n2 = scanner.nextFloat();
			
			System.out.print("Entre com o valor 3: ");
			n3 = scanner.nextFloat();
			
			System.out.print("Entre com o valor 4: ");
			n4 = scanner.nextFloat();
			
			scanner.close();
			
			produto1 = (n1 * n2);
			produto2 = (n2 * n3);
			diferenca = (produto1 - produto2);
			
			System.out.print("A diferença entre do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: " + diferenca);
			
  
}
}