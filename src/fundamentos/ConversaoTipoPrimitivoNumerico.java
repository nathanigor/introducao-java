package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		// Convers�o impl�cita 
		double a = 1;
		System.out.println(a);
		
		//Comvers�o expl�cita
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