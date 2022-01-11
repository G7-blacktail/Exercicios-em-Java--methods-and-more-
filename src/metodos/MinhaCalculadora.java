package metodos;

public class MinhaCalculadora {
	
	public static void soma(double numero, double numero2) {
		
	double resultado = numero + numero2;
	  System.out.println("O resultado da soma é " + resultado);

		}
	
	public static void sub(double numero, double numero2) {
		double resultado = numero - numero2;
		System.out.println("O resultado da subtração é " + resultado);
	}
	
	public static void multi(double numero, double numero2) {
		double resultado = numero * numero2;
		System.out.println("O resultado da multiplicação é " + resultado);
	}
	
	public static void div(double numero, double numero2) {
		double resultado = numero / numero2;
		System.out.println("O resultado da divisão é " + resultado);
	}
	
	public static void sobra(double numero, double numero2) {
		double resultado = numero % numero2;
		System.out.println("O resultado da resto é " + resultado);
	}
}
