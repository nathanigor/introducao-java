package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		/*	Mensagem no console com onde não se pula uma linha:
		System.out.print("Bom");
		System.out.print(" dia!!");
		*/
		
		/*	Mensagem no console com onde se pula uma linha:
		System.out.println("Bom");
		System.out.println("Dia!!!");
		*/
		
		/*	Mensagem formatada com símbolos:		
		System.out.printf("MegaSena: %d %d %d %d %d", 1,2,3,4,5);
		System.out.printf("Salário: R$: %.2f", 1160.33);
		*/
		
		//Capturar input no teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.printf("\nNome: %s\n cadastrado com sucesso\n\n", nome);
				
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.printf("\nIdade: %s\n cadastrado com sucesso", idade);
		
		teclado.close();

		
	}
}
