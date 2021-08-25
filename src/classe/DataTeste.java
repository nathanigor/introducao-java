package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		data1.dia = 11;
		data1.mes = 11;
		data1.ano = 2011;
		
		System.out.printf("Dia: %s Mês: %s Ano: %s \n", data1.dia, data1.mes, data1.ano);
		System.out.println(data1.obterDataFormatada());
		
		data1.imprimirDataFormatada();

		Data data2 = new Data(06,07,2001);
		
		System.out.printf("Dia: %s Mês: %s Ano: %s \n", data2.dia, data2.mes, data2.ano);
		System.out.println(data2.obterDataFormatada());
		
		data2.imprimirDataFormatada();

		}

}
