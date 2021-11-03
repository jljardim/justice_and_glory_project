package justice_and_glory_project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Principal {
	
	//public List armasGuerreiro;
	
	public List<Etapa> etapas;
	
	public static void main(String[] args) {
		
		List<String> dificuldade = new ArrayList<String>();
		dificuldade.add(Nivel.FACIL.toString());
		dificuldade.add(Nivel.NORMAL.toString());
		dificuldade.add(Nivel.DIFICIL.toString());
		
		List<String> opcaoPersonagens = new ArrayList<String>();
		opcaoPersonagens.add(Personagens.GUERREIRO.toString());
		opcaoPersonagens.add(Personagens.VIKING.toString());
		opcaoPersonagens.add(Personagens.ARQUEIRO.toString());
		
		List<String> armasGuerreiro = new ArrayList<String>();
		armasGuerreiro.add(Armas.ARMAS_GUERREIRO_1.getArmas());
		armasGuerreiro.add(Armas.ARMAS_GUERREIRO_2.getArmas());
		armasGuerreiro.add(Armas.ARMAS_GUERREIRO_3.getArmas());
		
		List<String> armasViking = new ArrayList<String>();
		armasViking.add(Armas.ARMAS_VIKING_1.getArmas());
		armasViking.add(Armas.ARMAS_VIKING_2.getArmas());
		armasViking.add(Armas.ARMAS_VIKING_3.getArmas());
		
		List<String> armasArqueiro = new ArrayList<String>();
		armasArqueiro.add(Armas.ARMAS_ARQUEIRO_1.getArmas());
		armasArqueiro.add(Armas.ARMAS_ARQUEIRO_2.getArmas());
		armasArqueiro.add(Armas.ARMAS_ARQUEIRO_3.getArmas());
		
//		Etapa etapa1 = new Etapa();
//		etapa1.setTextoEtapa("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: ");
//		etapa1.setOpcaoEtapa("");
		
		System.out.println("Bem vindo(a) á BATALHA FINAL! \n");
		
		System.out.println("Escolha seu nível de dificuldade: \n" + dificuldade);
		Scanner scanner = new Scanner(System.in);
		String nivel = scanner.nextLine();
		
		if(nivel.equalsIgnoreCase("facil") || 
		   nivel.equalsIgnoreCase("normal") ||
		   nivel.equalsIgnoreCase("dificil")) {
		  System.out.println("Informe seu nome.");
		  }
		  
		  Scanner scannerNome = new Scanner(System.in);
		  String nome = scannerNome.nextLine();
		
		  System.out.println("Informe seu sexo.");
		  Scanner scannerSexo = new Scanner(System.in);
		  String sexo = scannerSexo.nextLine();
		  
		  System.out.println("Escolha sua classe de combate: \n" + opcaoPersonagens);
		  
		  Scanner personagem = new Scanner(System.in);
		  String nomePersonagem = personagem.nextLine();
		  
		  if(nomePersonagem.equalsIgnoreCase("Guerreiro")) {
			  System.out.println("Escolha uma arma: \n" + armasGuerreiro);
		  }else if(nomePersonagem.equalsIgnoreCase("Viking")) {
			  System.out.println("Escolha uma arma: \n" + armasViking);
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro")) {
			  System.out.println("Escolha uma arma: \n" + armasArqueiro);
		  }
		  Scanner armaPersonagem = new Scanner(System.in);
		  String armaSelecionada = armaPersonagem.nextLine();
		  
		  
		  System.out.println("\n-----------INFORMAÇÔES DO JOGADOR-----------");
		  System.out.println("Level: " + nivel + "\n" +
		   "Nome: " + nome + "\n" +
		   "Sexo: " + sexo + "\n" +
		   "Classe de combate: " + nomePersonagem + "\n" +
		   "Arma: " + armaSelecionada);
		  
		   if(nomePersonagem.equalsIgnoreCase("Guerreiro") &&
				  armaSelecionada.equalsIgnoreCase("Espada")) {
			  System.out.println("Pontos de vida: " + Personagens.GUERREIRO.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_GUERREIRO_1.getPoder());
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Guerreiro") &&
				  armaSelecionada.equalsIgnoreCase("Lanca")) {
			  System.out.println("Pontos de vida: " + Personagens.GUERREIRO.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_GUERREIRO_2.getPoder());
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Guerreiro") &&
				  armaSelecionada.equalsIgnoreCase("Adaga")) {
			  System.out.println("Pontos de vida: " + Personagens.GUERREIRO.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_GUERREIRO_3.getPoder()); 
			  
		  } else if(nomePersonagem.equalsIgnoreCase("Viking") &&
				  armaSelecionada.equalsIgnoreCase("Machado")) {
			  System.out.println("Pontos de vida: " + Personagens.VIKING.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_VIKING_1.getPoder());
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Viking") &&
				  armaSelecionada.equalsIgnoreCase("Estilingue")) {
			  System.out.println("Pontos de vida: " + Personagens.VIKING.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_VIKING_2.getPoder());
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Viking") &&
				  armaSelecionada.equalsIgnoreCase("FacaSeax")) {
			  System.out.println("Pontos de vida: " + Personagens.VIKING.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_VIKING_3.getPoder()); 
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro") &&
				  armaSelecionada.equalsIgnoreCase("ArcoFecha")) {
			  System.out.println("Pontos de vida: " + Personagens.ARQUEIRO.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_ARQUEIRO_1.getPoder());
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro") &&
				  armaSelecionada.equalsIgnoreCase("Espada")) {
			  System.out.println("Pontos de vida: " + Personagens.ARQUEIRO.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_ARQUEIRO_2.getPoder());
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro") &&
				  armaSelecionada.equalsIgnoreCase("Balestra")) {
			  System.out.println("Pontos de vida: " + Personagens.ARQUEIRO.getSaldo());
			  System.out.println("Poder de ataque: " + Armas.ARMAS_ARQUEIRO_3.getPoder());  
		  }
		  
		  System.out.println("--------------------------------------------- \n");
		  
		  System.out.println("Tudo pronto vamos ao jogo! \n");
		  
		  System.out.println(Roteiro.INTRODUCAO.getTexto());
		
		}
	}
