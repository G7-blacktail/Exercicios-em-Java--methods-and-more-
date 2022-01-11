package exerciciodeoperadores;

public class Operadores {

	public static void main(String[] args) {
		
		System.out.println("PrePos");
		prePos();
		System.out.println("Aritimético");
		aritimetico();
		System.out.println("Atricuição");
		atribuicao();
		System.out.println("Procedência");
		procedencia();
		
		
	}
	private static void prePos() {
		int x = 10;
		
		int i = ++x;
		int j = x--;
		int k = x;
		
		System.out.println("++x (10) = " + i);
		System.out.println("x-- (10) = " + j);
		System.out.println(k);
		
	}

	private static void aritimetico() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a+b;
		int r2 = c-a;
		int r3 = d*b;
		int r4 = e/a;
		int r5 = c%b;
		
		System.out.println("a + b = " + r1);
		System.out.println("c - a = " + r2);
		System.out.println("d * b = " + r3);
		System.out.println("e / a = " + r4);
		System.out.println("c % b = " + r5);
		
	}

	private static void atribuicao() {
		
		int I = 1500;
		short J = 25;
		long L = 500L;
		int K = 35;
		float F = 3.5F;
		double D = F;
		
		System.out.println("D " + D);
		
		I += 5; // I = I + 5;
		J -= 3;// J = J - 5;
		L *= 3;//L = L * 5
		K %= 2;// K = K % 2;
		D /= 2;// D = F / 2;
		
		System.out.println("+= " + I);
		System.out.println("-= " + J);
		System.out.println("*= " + L);
		System.out.println("%= " + K);
		System.out.println("/= " + D);
		
		
		
		
	}
	
	private static void procedencia() {
		
		int i = 10;
		int j = 20;
		int k = 30;
		
		int a = i++ +  --j * k;
				System.out.println("i++ = --j * K = " + a);
				System.out.println("i " + i);//resultado atrelado a nova variavel 11
				
		int b = k / --i % 3 + 1;
			System.out.println("b = " + b);
			System.out.println("i " + i);//resultado atrelado a nova variavel 10
			
				
		
		
			int c = 2;
			
			c *= i += 5;
			System.out.println("C *= i += 5 = " + c);
		
	}


	
	
}
