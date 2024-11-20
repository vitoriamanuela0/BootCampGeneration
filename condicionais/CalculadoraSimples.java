package condicionais;


		import java.util.Scanner;

		public class CalculadoraSimples {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        float num1, num2;
		        int operacao;
		        
		        System.out.print("Entre com o seu primeiro número: ");
		        num1 = scanner.nextFloat();
		        
		        System.out.print("Entre com o seu segundo número: ");
		        num2 = scanner.nextFloat();
		        
		        System.out.print("Escolha o número relacionado a operação que deseja realizar: ");
		        System.out.print("1 - Adição 2 - Subtração 3 - Multiplicação 4 - Divisão: ");
		        operacao = scanner.nextInt();
		        
		        if (operacao == 1) {
		        	System.out.print("Seu resultado é: " + (num1 + num2)); 
		        }
		        else if (operacao == 2) {
		        	System.out.print("Seu resultado é: " + (num1 - num2));
		        }
		        else if (operacao == 3) {
		        	System.out.print("Seu resultado é: " + (num1 * num2));
		        }
		        else if (operacao == 4) {
		        	if (num2 != 0) {
		        	System.out.print("Seu resultado é: " + (num1 / num2));
		        	
		        }else {
		        	System.out.print("Erro!");
		        }
		        	}
		        else {
		        	System.out.print("Número inválido. Tente novamente. ");
		        }
		        	
		       
		       scanner.close();
	}

}
