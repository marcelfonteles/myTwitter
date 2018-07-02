import java.util.Scanner;
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
			
			int tela = scanner.nextInt();

		}
	}
	

}
