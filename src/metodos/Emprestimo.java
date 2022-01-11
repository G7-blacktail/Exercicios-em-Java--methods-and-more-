package metodos;

public class Emprestimo {

		public static int getDuasParcelas() {
			return 2;
		}
		
		public static int getTresParcelas() {
			return 3;
		}
		
		public static double taxaDuasParcelas() {
			return 0.5;
		}
		
		public static double taxaTresParcelas() {
			return 7.6;
		}
		


	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
				double valorFinal = valor + (valor * taxaDuasParcelas());
				
				System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
				
		}else if (parcelas == 3) {
				double valorFinal = valor + (valor * taxaTresParcelas());
				System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
		}else {
			System.out.println("Quantidade de parcelas não aceita");
		}
	}
	
}
