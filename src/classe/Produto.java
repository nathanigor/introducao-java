package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	Produto(){
		
	}
	
	
	
	double precoComDesconto(double desconto) {
		double total = (preco * desconto) - preco;
		return(total);
	}
	
	double precoComDesconto() {
		double total = (preco * desconto) - preco;
		return(total);
	}


}
