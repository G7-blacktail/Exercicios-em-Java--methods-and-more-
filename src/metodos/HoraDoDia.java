package metodos;

public class HoraDoDia {
	
	public static void obterHora (int hora) {
	
	switch (hora){
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
		mensagemBomDia();
		break;
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		mensagemBoaTarde();
		break;
	case 18:
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
		mensagemBoaNoite();
		break;
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
		mensagemBoaMadrugada();
		break;
		
		default:
			System.out.println("Está hora é inválida");
		}

	}
	
	private static void mensagemBomDia() {
		System.out.println("Bom dia!");
	}
	
	private static void mensagemBoaTarde() {
		System.out.println("Boa tarde!");
	}
	
	private static void mensagemBoaNoite() {
		System.out.println("Boa noite!");
	}

	private static void mensagemBoaMadrugada() {
		System.out.println("Vá dormir, é de madrugada");
	}
}
