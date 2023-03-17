import java.util.Scanner;

public class desafio {

	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String jogador = "";
		int resultado = 0;
		
		while(true) {
			while(true) {
				System.out.println("Telefonou para a vitima? ");
				System.out.println("escreva 1 para sim e 2 para nao");
				int resposta = scanner.nextInt();
				if(resposta == 1) {
					resultado += 1; 
					break;
				} else if(resposta == 2) {
					break;
				} else {
					System.out.println("resposta invalida digite novamente!!!");
					
				}
			}
			
			while(true) {
				System.out.println("Esteve no local do crime? ");
				System.out.println("escreva 1 para sim e 2 para nao");
				int resposta = scanner.nextInt();
				if(resposta == 1) {
					resultado += 1; 
					break;
				} else if(resposta == 2) {
					break;
				} else {
					System.out.println("resposta invalida digite novamente!!!");
					
				}
			}
			while(true) {
				System.out.println("Mora perto da vitima? ");
				System.out.println("escreva 1 para sim e 2 para nao");
				int resposta = scanner.nextInt();
				if(resposta == 1) {
					resultado += 1; 
					break;
				} else if(resposta == 2) {
					break;
				} else {
					System.out.println("resposta invalida digite novamente!!!");
					
				}
			}
			while(true) {
				System.out.println("Devia para a vitima? ");
				System.out.println("escreva 1 para sim e 2 para nao");
				int resposta = scanner.nextInt();
				if(resposta == 1) {
					resultado += 1; 
					break;
				} else if(resposta == 2) {
					break;
				} else {
					System.out.println("resposta invalida digite novamente!!!");
					
				}
			}
			while(true) {
				System.out.println("Ja trabalhou com a vitima? ");
				System.out.println("escreva 1 para sim e 2 para nao");
				int resposta = scanner.nextInt();
				if(resposta == 1) {
					resultado += 1; 
					break;
				} else if(resposta == 2) {
					break;
				} else {
					System.out.println("resposta invalida digite novamente!!!");
					
				}
			}
			
		break;
		

	
	
	}
	
		if(resultado <= 1) {
			jogador = "inocente";
		} else if(resultado == 2) {
			jogador = "suspeito";
		} else if (resultado <= 4) {
			jogador = "cumplice";
		} else {
			jogador = "Assasino";
		}
		System.out.println("voce e: "+ jogador);
	}
} 
