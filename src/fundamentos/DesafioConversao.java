package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro sal�rio: \n");
		double salario1 = teclado.nextDouble();

		System.out.printf("Digite o segundo sal�rio: \n");
		
		double salario2 = teclado.nextDouble();
		
		double media = (salario1 + salario2)/2;
		
		System.out.printf("A m�dia do sal�rio �: R$: %s", media);
		
		teclado.close();
		

	}
}
