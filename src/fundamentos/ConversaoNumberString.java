package fundamentos;

public class ConversaoNumberString {
	public static void main(String[] args) {
		//Conversão com um tipo literal com funções de classe
		Integer num1 = 1000;
		System.out.println(num1.toString());
		
		//Conversão com um tipo literal sem funções de classe
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
	}

}
