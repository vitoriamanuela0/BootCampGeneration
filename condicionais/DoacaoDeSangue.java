package condicionais;

import java.util.Scanner;

public class DoacaoDeSangue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String nome;
        int idade;
        boolean primeiraDoacao;
        
// --------------------------------------------------------------------------------------------------------------//
        System.out.print("Qual o nome do doador? ");
        nome = scanner.nextLine();

        System.out.print("Qual a idade do doador? ");
        idade = scanner.nextInt();
// ---------------------------------------------------------------------------------------------------------------//
        
        if (idade < 18 && idade > 69) {
            System.out.println("Não autorizado. Possíveis causas: Menor de 18 anos ou maior de 69.");
            return;
        }

        if (idade >= 60 && idade <= 69) {
            System.out.print("Já doou sangue antes? (true/false): ");
            primeiraDoacao = scanner.nextBoolean();
            
            if (primeiraDoacao) {
                System.out.println(nome + ", você está apto para doar sangue.");
                                } 
            else {
                System.out.println(nome + ", não está apto para doar sangue. Motivo: deve ter doado antes.");
                 }
                                         }
         else {
            System.out.print("É sua primeira doação? (true/false): ");
            primeiraDoacao = scanner.nextBoolean();
            
            if (primeiraDoacao) {
                System.out.println(nome + ", você está apto para doar sangue.");
                                } 
            else {
                System.out.println(nome + ", você está apto para doar sangue.");
                 }
              }

        scanner.close();
    }
}
