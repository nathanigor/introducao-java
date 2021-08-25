package desafioClasse;

public class Jantar {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Nathan", 88.00);
		
		Comida c1 = new Comida("Pizza", 0.2);
		
		p1.comer(c1);
		
		System.out.printf("%s pesa %s", p1.nome, p1.peso);
	}

}
