package fundamentos;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = "100";
		String valor2 = "200";
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.printf("Soma é igual a: %.2f", soma);
	}

}
