package metodos;

public class ExercicioInicial {

	public static void main(String[] args) {

		System.out.println("Soma");
		 soma();
		 System.out.println("Subtra��o");
		 sub();
		 System.out.println("Multiplica��o");
		 multi();
		 System.out.println("Divis�o");
		 div();
		
		/*int numb1 = 10;
		int numb2 = 20;
		int numb3 = numb1 + numb2;
		
		int soma = numb1 + numb2;
		int sub = numb2 - numb3;
		int multi = numb1 * numb3;
		int div = numb2 / numb3;
		
		System.out.println("Resultado da soma = " + soma);
		System.out.println("Resultado da subtra��o = " + sub);
		System.out.println("Resultado da multiplica��o = " + multi);
		System.out.println("Resultado da divis�o = " + div); */
		
		
		

	}

	private static void soma() {
		
		int numb1 = 10;
		int numb2 = 20;
		
		
		int soma = numb1 + numb2;
			System.out.println("Resultado da soma = " + soma);	
		
	}
	
	private static void sub() {
		
		int numb1 = 52;
		int numb2 = 20;
		int sub = numb1 - numb2;

		System.out.println("Resultado da subtra��o = " + sub);
	}

	
	private static void multi() {
		
		int numb1 = 52;
		int numb2 = 20;
		int multi = numb1 * numb2;
		
		System.out.println("Resultado da multiplica��o = " + multi);
	}
	
	private static void div() {
		
		int num1 = 100;
		int num2 = 12;
		
		int div = num1 / num2;
		
		System.out.println("Resultado da divis�o = " + div);
	}
	

}
