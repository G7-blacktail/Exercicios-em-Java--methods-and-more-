package metodos;

import java.util.Scanner;

import exerciciosresolvidos.Calculadora;

public class ExecutarMetodos {

	public static void main(String[] args) {
		
		
		//aprimorar exemplo Hora do dia com Scanner
		
		
		System.out.println("Bem vindo ao teste de conhecimento");
		System.out.println("Coloque a hora do dia: ");
		Scanner scan = new Scanner(System.in);

		int horaUsuario;
		horaUsuario = scan.nextInt();//defini com a entrada do usuário a saida do método obterHora
		
		
		HoraDoDia.obterHora(horaUsuario);
		
		System.out.println("Finalizado exemplo da mensagem de data \n");
		System.out.println("Iniciar calculadora");
		
		
		//Operadores ou calculadora
		
		System.out.println("Digite o primeiro operando: ");
		double numero = scan.nextDouble();
		System.out.println("Digite o segundo operando ");
		double numero2 = scan.nextDouble();
		
		MinhaCalculadora.soma(numero, numero2);
		MinhaCalculadora.sub(numero, numero2);
		MinhaCalculadora.multi(numero, numero2);
		MinhaCalculadora.div(numero, numero2);
		MinhaCalculadora.sobra(numero, numero2);
		
		System.out.println("Fim do Exercicio de Calculadora \n");
		
		//Exercicio do emprestimo utilizando o scanner
		
		System.out.println("Vamos para o calculo de Emprestimo");
		System.out.println("Digite o valor a ser solicitado: ");
		
		double total = scan.nextDouble();
		
		Emprestimo.calcular((int) total, Emprestimo.getDuasParcelas());
		Emprestimo.calcular((int) total, Emprestimo.getTresParcelas());
		
		System.out.println("Fim do exercício");
;		
		
		
		scan.close();
	}

}
