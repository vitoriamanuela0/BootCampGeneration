package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class arraylistString {

	public static void main(String[] args) {
		
	//  ----------------------------------------------------------------------------------------------------------

		Scanner scanner = new Scanner(System.in);
		
	//  ----------------------------------------------------------------------------------------------------------

		System.out.println("Entre com as 5 cores(uma por vez): ");
		
		ArrayList<String> cores = new ArrayList<String>();
		
	//  ----------------------------------------------------------------------------------------------------------

		for(int i = 0; i < 5; i++) {
			
			String cor = scanner.nextLine();
			cores.add(cor);
		                            }
		
	//  ----------------------------------------------------------------------------------------------------------
		
		System.out.println("As cores inseridas foram: " + cores);
		System.out.println("\n");
		
	//  ----------------------------------------------------------------------------------------------------------
	
		Collections.sort(cores);
		
		System.out.println("As cores em ordem alfabética ficam: " + cores);
		
	//  ----------------------------------------------------------------------------------------------------------

		scanner.close();
	}
	//  ----------------------------------------------------------------------------------------------------------

}
