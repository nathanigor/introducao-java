package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data() {
		
	}
	
	String obterDataFormatada() {
		return("" + dia + "/" + mes +  "/" + ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
