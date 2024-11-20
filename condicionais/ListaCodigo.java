package condicionais;

import java.util.Scanner;

public class ListaCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		

		int codigo;
		int quantidade;
		String produto = "";
		float preco = 0.0f;
		
		
		System.out.print("Digite o código do produto (de 1 a 6): ");
		codigo = scanner.nextInt();
		
		System.out.print("Digite a quantidade: ");
		quantidade = scanner.nextInt();
		
		
		switch (codigo) {
        case 1:
            produto = "Cachorro Quente";
            preco = 10.00f;
            break;
        case 2:
            produto = "X-Salada";
            preco = 15.00f;
            break;
        case 3:
            produto = "X-Bacon";
            preco = 18.00f;
            break;
        case 4:
            produto = "Bauru";
            preco = 12.00f;
            break;
        case 5:
            produto = "Refrigerante";
            preco = 8.00f;
            break;
        case 6:
            produto = "Suco de Laranja";
            preco = 13.00f;
            break;
        default:
            System.out.println("Código inválido! Por favor, digite um código de 1 a 6.");
            
            
       
    }
		
		 float valorTotal = quantidade * preco;
		 
		    System.out.println("Produto: " + produto);
	        System.out.println("Quantidade: " + quantidade);
	        System.out.printf("Valor Total: R$ " + valorTotal);

	        
		 scanner.close();
	}
	

}
