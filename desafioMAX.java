import java.util.Scanner;


public class desafioMAX {
	
	public static void main(String[] args) {
		
		int numSim = interrogatorio();
		classificaInterrogado(numSim);
	}
	
	public static void classificaInterrogado(int numSim) {
		if(numSim <= 1) {
			System.out.println("inocente");
		}else if(numSim == 2) {
			System.out.println("suspeito");
		} else if(numSim <= 4) {
			System.out.println("cumplice");
		} else if(numSim == 5) {
			System.out.println("assasino");
		}
	}
	
	public static int interrogatorio() {
		
		Scanner scanner = new Scanner(System.in);
		
		int numSim = 0;
		
		System.out.println("Telefonou para a vitima? 1-sim 0-nao: ");
		int pergunta1 = scanner.nextInt();
		if(pergunta1 == 1) {
			numSim += 1;
			
		}
		System.out.println("Esteve no local do crime? 1-sim 0-nao: ");
		int pergunta2 = scanner.nextInt();
		if(pergunta2 == 1) {
			numSim += 1;
			
		}
		System.out.println("Mora perto da vitima? 1-sim 0-nao: ");
		int pergunta3 = scanner.nextInt();
		if(pergunta3 == 1) {
			numSim += 1;
			
		}
		System.out.println("Devia para a vitima? 1-sim 0-nao: ");
		int pergunta4 = scanner.nextInt();
		if(pergunta4 == 1) {
			numSim += 1;
			
		}
		System.out.println("Ja trabalhou com a vitima? 1-sim 0-nao: ");
		int pergunta5 = scanner.nextInt();
		if(pergunta5 == 1) {
			numSim += 1;
		
		}
		return numSim;
	}
}
