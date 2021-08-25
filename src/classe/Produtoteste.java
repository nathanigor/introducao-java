package classe;

public class Produtoteste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		p1.nome = "Celuar";
		p1.preco = 2000.00;
		Produto.desconto = 0.25;
		double precoFinal1 = p1.precoComDesconto();
		System.out.printf("Preço final: R$%.2f. \n", precoFinal1);
		System.out.println("-------------------------------------");

		Produto p2 = p1;
		p2.preco = 1;
		double precoFinal2 = p2.precoComDesconto();
		System.out.printf("Preço final: R$%.2f. \n", p1.preco);

		System.out.printf("Preço final: R$%.2f.", p2.preco);
	}

}
