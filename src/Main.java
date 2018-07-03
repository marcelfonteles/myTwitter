import java.util.Scanner;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Exceptions.*;
public class Main {
	/*
	 * Repositorio: método atualizar??
	 * alterar o nome
	 * alterar cpf
	 * alterar cnpj  
	 * */	
	
	
	public static void main(String[] args) {
		Repositorio repositorio = new Repositorio();
		MyTwitter twitter = new MyTwitter(repositorio);
		
		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean runningProgram = true;
		while (runningProgram) {
			System.out.println("################################################");
			System.out.println("O que deseja fazer?");
			System.out.println("0 - Criar Perfil.");
			System.out.println("1 - Cancelar Perfil.");
			System.out.println("2 - Tweetar.");
			System.out.println("3 - Ver Timeline.");
			System.out.println("4 - Ver Seus tweets");
			System.out.println("5 - Seguir Alguém.");
			System.out.println("6 - Ver Número de Seguidores.");
			System.out.println("7 - Ver Seguidores.");
			System.out.println("8 - Ver Seguidos.");
			System.out.println("9 - Todos os Perfis.");
			System.out.println("10 - Sair do Programa");
			System.out.println("################################################");
			System.out.print("Opção: ");
			int opcao = scanner.nextInt();
			System.out.println("################################################");
			
			
			switch (opcao) {
				case 0:
					try {
						System.out.print("Digite o nome do usuário: ");
						//String input = System.console().readLine();
						String input = scanner.next();
						Perfil perfil = new Perfil(input);
						twitter.criarPerfil(perfil);
					} catch(PEException exception) {
						System.out.println("Nome de usuário em uso.");
					} finally {
	
					}
					break;
				case 1:
					try {
						System.out.print("Digite o nome do usuário: ");
						String input = scanner.next();
						twitter.cancelarPerfil(input);
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(PDException exception) {
						System.out.println("Perfil já está desativado");
					} finally {
						
					}
					break;
				case 2:
					try {
						System.out.print("Digite o nome do usuário: ");
						String usuario = scanner.next();
						System.out.println("Digite a mensagem: ");
						String mensagem = br.readLine();
						twitter.tweetar(usuario, mensagem);
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(MFPException exception) {
						System.out.println("Mensagem fora do padrão.");
					} catch(IOException exception) {
						System.out.println("Não foi possível ler a mensagem");
					}
					break;
				case 3:
					try {
						System.out.print("Digite o nome do usuário: ");
						String usuario = scanner.next();
						Vector<Tweet> tweets = twitter.timeline(usuario);
						for (Tweet tweet : tweets) {
							System.out.println("Tweet de " + tweet.getUsuario() + ":");
							System.out.println(tweet.getMensagem());
						}
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(PDException exception) {
						System.out.println("Perfil já está desativado");
					}					
					break;
				case 4:
					try {
						System.out.print("Digite o nome do usuário: ");
						String usuario = scanner.next();
						Vector<Tweet> tweets = twitter.tweets(usuario);
						System.out.println("Seus tweets: ");
						for (Tweet tweet : tweets) {
							System.out.println(tweet.getMensagem());
						}
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(PDException exception) {
						System.out.println("Perfil já está desativado");
					}
					break;
				case 5:
					try {
						System.out.print("Nome do seguidor:");
						String seguidor = scanner.next();
						System.out.print("Nome do seguido:");
						String seguido = scanner.next();
						twitter.seguir(seguidor, seguido);
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(PDException exception) {
						System.out.println("Perfil já está desativado");
					} catch(SIException exception) {
						System.out.println("Você não pode seguir a você mesmo.");
					}
					break;
				case 6:
					try {
						System.out.print("Digite o nome do usuário: ");
						String usuario = scanner.next();
						int numero = twitter.numeroSeguidores(usuario);
						System.out.println(usuario + " tem " + numero + " seguidor(es)");
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(PDException exception) {
						System.out.println("Perfil já está desativado");
					}
					
					break;
				case 7:
					try {
						System.out.print("Digite o nome do usuário: ");
						String usuario = scanner.next();
						Vector<Perfil> seguidores = twitter.seguidores(usuario);
						int contSeguidor = 0;
						System.out.println("Seus seguidores: ");
						for (Perfil seguidor : seguidores) {
							contSeguidor++;
							System.out.println(contSeguidor + " - " + seguidor.getUsuario());
						} 
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(PDException exception) {
						System.out.println("Perfil já está desativado");
					}					
					break;
				case 8:
					try {
						System.out.print("Digite o nome do usuário: ");
						String usuario = scanner.next();
						Vector<Perfil> seguidos = twitter.seguidos(usuario);
						int contSeguidor = 0;
						System.out.println("Você segue: ");
						for (Perfil seguido : seguidos) {
							contSeguidor++;
							System.out.println(contSeguidor + " - " + seguido.getUsuario());
						} 
					} catch(PIException exception) {
						System.out.println("Perfil inexistente.");
					} catch(PDException exception) {
						System.out.println("Perfil já está desativado");
					}		
					break;
				case 9:
					repositorio.todosPerfis();
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
