package condicionais;

import java.util.Scanner;

   public class CalculdadoraSwitch {

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
        
        
        switch (operacao) {
        case 1:
        	System.out.print("Seu resultado é: " + (num1 + num2));
            break;
        
        case 2:
        	System.out.print("Seu resultado é: " + (num1 - num2));
        	break;
        case 3:
        	System.out.print("Seu resultado é: " + (num1 * num2));
        	break;
        case 4:
        	System.out.print("Seu resultado é: " + (num1 / num2));
        	break;
        }
        	
       
       scanner.close();
}

}
