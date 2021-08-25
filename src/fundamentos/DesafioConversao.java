package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro salário: \n");
		double salario1 = teclado.nextDouble();

		System.out.printf("Digite o segundo salário: \n");
		
		double salario2 = teclado.nextDouble();
		
		double media = (salario1 + salario2)/2;
		
		System.out.printf("A média do salário é: R$: %s", media);
		
		teclado.close();
		

	}
}
