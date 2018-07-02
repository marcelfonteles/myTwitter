import java.util.Scanner;
import Exceptions.*;
public class Main {
	
	public static void main(String[] args) {
		Repositorio repositorio = new Repositorio();
		MyTwitter twitter = new MyTwitter(repositorio);
		
		Scanner scanner = new Scanner(System.in);
		
		boolean runningProgram = true;
		while (runningProgram) {
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Criar Perfil.");
			System.out.println("2 - Cancelar Perfil.");
			System.out.println("3 - Tweetar.");
			System.out.println("4 - Ver Timeline.");
			System.out.println("5 - Ver Seus tweets");
			System.out.println("6 - Seguir Alguém.");
			System.out.println("7 - Ver Número de Seguidores.");
			System.out.println("8 - Ver Seguidores.");
			System.out.println("9 - Ver Seguidos.");
			System.out.println("10 - Sair do Programa");
			System.out.print("Opção: ");
			int tela = scanner.nextInt();
			
			
			switch (tela) {
				case 0:
					try {
						System.out.print("Digite o nome do usuário: ");
						//String input = System.console().readLine();
						String input = scanner.next();
						System.out.println(input);
						Perfil perfil = new Perfil(input);
						twitter.criarPerfil(perfil);
					} catch(PEException exception) {
						System.out.println("Nome de usuário em uso.");
					} finally {
	
					}
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9: 
					break;
				case 10:
					runningProgram = false;
					break;
				default:
					System.out.println("Entrada Inválida");
					break;
					
			}
		}
		scanner.close();
	}
}
