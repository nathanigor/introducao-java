package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		// Conversão implícita 
		double a = 1;
		System.out.println(a);
		
		//Comversão explícita
		float b = (float) 1.1234567888888;
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}

}