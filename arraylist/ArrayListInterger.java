package arraylist;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class ArrayListInterger {

			public static void main(String[] args) {
				
//  ----------------------------------------------------------------------------------------------------------

				Scanner scanner = new Scanner(System.in);
				int busca = 0;
				
//  ----------------------------------------------------------------------------------------------------------

				System.out.println("");
				
				ArrayList<Integer> numeros = new ArrayList<Integer>();
				
				numeros.add(15);
				numeros.add(29);
				numeros.add(11);
				numeros.add(25);
				numeros.add(13);
				numeros.add(11);
				numeros.add(10);
				numeros.add(17);
				numeros.add(24);
				numeros.add(7);
				
//  ----------------------------------------------------------------------------------------------------------

				System.out.println("Entre com um número inteiro e veja se ele já está na lista: ");
				busca = scanner.nextInt();
				scanner.close();
//  ----------------------------------------------------------------------------------------------------------
				
				for (int i = 0; i < numeros.size(); i++) {
					
                    //  ----------------------------------------------------------------------------------------------------------

                    if (numeros.get(i) == busca) 
                    {
						System.out.println("O número " + busca + " está na lista. Na posição " + (i+1));
						System.out.println("\n");
						
                    //  ----------------------------------------------------------------------------------------------------------
						
						System.out.println("Os números eram: " + numeros);
						System.out.println("\n");
						
                     //  ----------------------------------------------------------------------------------------------------------
						
						Collections.sort(numeros);
					 	System.out.println("Os números em ordem decrescente: " + numeros);
                     }
                    //  ----------------------------------------------------------------------------------------------------------

				      else if (numeros.get(i) != busca) {
				    	 System.out.print("Tente novamente.");
				           }
				                                           }
//  ----------------------------------------------------------------------------------------------------------

	}

}
  