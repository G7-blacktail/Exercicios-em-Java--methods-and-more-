package exerciciosresolvidos;

public class Main {

	public static void main(String[] args) {


		//Calculadora
		Calculadora.soma(3, 6);
		Calculadora.sub(2, 1.5);
		Calculadora.multi(10, 7.5);
		Calculadora.div(100, 35);
		
		//mensagem
		System.out.println("Exercicio mensagem");
		Mensagem.obterMensaem(9);
		Mensagem.obterMensaem(14);
		Mensagem.obterMensaem(1);
		
		//emprestimo
		System.out.println("Exercício empréstimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);


	}
	
	

}
