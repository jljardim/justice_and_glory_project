package justice_and_glory_project;

import java.util.Scanner;

import enums.Armas;
import enums.Nivel;
import enums.Roteiro;
import enums.Tipos_Guerreiro;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Principal {
	 // private Scanner scan;
	//public List armasGuerreiro;
	
	
	public List<Jogador> jogador;
	public static void main(String[] args) {
		
		int danoDaArma = 0;
		int pontosDeVida = 0;
		//int danoArmaViking = 0;
		//int danoArmaArqueiro = 0;
		
		
		String enumFacil = Nivel.FACIL.getNivel();
		String enumNormal = Nivel.NORMAL.getNivel();
		String enumDificil = Nivel.DIFICIL.getNivel();
		
		List<String> dificuldade = new ArrayList<String>();
		dificuldade.add(enumFacil);
		dificuldade.add(enumNormal);
		dificuldade.add(enumDificil);
		
		List<String> opcaoPersonagens = new ArrayList<String>();
		opcaoPersonagens.add(Tipos_Guerreiro.SOLDADO.getGuerreiro());
		opcaoPersonagens.add(Tipos_Guerreiro.VIKING.getGuerreiro());
		opcaoPersonagens.add(Tipos_Guerreiro.ARQUEIRO.getGuerreiro());
		
		List<String> armasSoldado = new ArrayList<String>();
		armasSoldado.add(Armas.ARMAS_SOLDADO_1.getArmas());
		armasSoldado.add(Armas.ARMAS_SOLDADO_2.getArmas());
		armasSoldado.add(Armas.ARMAS_SOLDADO_3.getArmas());
		
		List<String> armasViking = new ArrayList<String>();
		armasViking.add(Armas.ARMAS_VIKING_1.getArmas());
		armasViking.add(Armas.ARMAS_VIKING_2.getArmas());
		armasViking.add(Armas.ARMAS_VIKING_3.getArmas());
		
		List<String> armasArqueiro = new ArrayList<String>();
		armasArqueiro.add(Armas.ARMAS_ARQUEIRO_1.getArmas());
		armasArqueiro.add(Armas.ARMAS_ARQUEIRO_2.getArmas());
		armasArqueiro.add(Armas.ARMAS_ARQUEIRO_3.getArmas());
		
////		Etapa etapa1 = new Etapa();
////		etapa1.setTextoEtapa("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: ");
////		etapa1.setOpcaoEtapa("");
//		
////		Etapa etapa1 = new Etapa();
////		etapa1.getOpcoes().add("Esquerda");
////		etapa1.getOpcoes().add("Direita");
		
		System.out.println("Bem vindo(a) á BATALHA FINAL! \n");

	    System.out.println("Escolha seu nível de dificuldade: \n" + dificuldade);
	    Scanner scanner = new Scanner(System.in);
	    String nivel = scanner.nextLine();
	    
	    if(nivel.equalsIgnoreCase(enumFacil) || nivel.equalsIgnoreCase(enumNormal) ||
	    		 nivel.equalsIgnoreCase(enumDificil)) {
	    	
	    }else {
	    	System.exit(0);
	    	
	    }

		  System.out.println("Informe seu nome.");
	
		  Scanner scannerNome = new Scanner(System.in);
		  String nome = scannerNome.nextLine();
		  if(nome.trim().equals("")) {
			  System.exit(0);
		  }
		
		  System.out.println("Informe seu sexo.");
		  Scanner scannerSexo = new Scanner(System.in);
		  String sexo = scannerSexo.nextLine();
		  if(sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")) {
			  
		  }else {
			  System.exit(0);
		  }
		  
		  System.out.println("Escolha sua classe de combate: \n" + opcaoPersonagens);
		  
		  Scanner personagem = new Scanner(System.in);
		  String nomePersonagem = personagem.nextLine();
		  
		  if(nomePersonagem.equalsIgnoreCase("Soldado")) {
			  pontosDeVida = Tipos_Guerreiro.SOLDADO.getPontosVida();
		  }else if(nomePersonagem.equalsIgnoreCase("Viking")) {
			  pontosDeVida = Tipos_Guerreiro.VIKING.getPontosVida();
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro")){
			  pontosDeVida = Tipos_Guerreiro.ARQUEIRO.getPontosVida();
		  }
		  
		  if(nomePersonagem.equalsIgnoreCase("Soldado")) {
			  System.out.println("Escolha uma arma: \n" + armasSoldado);
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
		  
		   if(nomePersonagem.equalsIgnoreCase("Soldado") &&
				  armaSelecionada.equalsIgnoreCase("Espada")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.SOLDADO.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_SOLDADO_1.getPoder());
			  danoDaArma = Armas.ARMAS_SOLDADO_1.getPoder();
			  //System.out.println("");
			  pontosDeVida = Tipos_Guerreiro.SOLDADO.getPontosVida();
			  //System.out.println("Pontos de vida: " + pontosDeVida); 
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Soldado") &&
				  armaSelecionada.equalsIgnoreCase("Lanca")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.SOLDADO.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_SOLDADO_2.getPoder());
			  danoDaArma = Armas.ARMAS_SOLDADO_2.getPoder();
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Soldado") &&
				  armaSelecionada.equalsIgnoreCase("Adaga")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.SOLDADO.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_SOLDADO_3.getPoder()); 
			  danoDaArma = Armas.ARMAS_SOLDADO_3.getPoder();
			  
		  } else if(nomePersonagem.equalsIgnoreCase("Viking") &&
				  armaSelecionada.equalsIgnoreCase("Machado")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.VIKING.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_VIKING_1.getPoder());
			  danoDaArma = Armas.ARMAS_VIKING_1.getPoder();
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Viking") &&
				  armaSelecionada.equalsIgnoreCase("Estilingue")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.VIKING.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_VIKING_2.getPoder());
			  danoDaArma = Armas.ARMAS_VIKING_2.getPoder();
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Viking") &&
				  armaSelecionada.equalsIgnoreCase("FacaSeax")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.VIKING.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_VIKING_3.getPoder()); 
			  danoDaArma = Armas.ARMAS_VIKING_3.getPoder();
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro") &&
				  armaSelecionada.equalsIgnoreCase("ArcoFecha")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.ARQUEIRO.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_ARQUEIRO_1.getPoder());
			  danoDaArma = Armas.ARMAS_ARQUEIRO_1.getPoder();
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro") &&
				  armaSelecionada.equalsIgnoreCase("Espada")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.ARQUEIRO.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_ARQUEIRO_2.getPoder());
			  danoDaArma = Armas.ARMAS_ARQUEIRO_2.getPoder();
			  
		  }else if(nomePersonagem.equalsIgnoreCase("Arqueiro") &&
				  armaSelecionada.equalsIgnoreCase("Balestra")) {
			  System.out.println("Pontos de vida: " + Tipos_Guerreiro.ARQUEIRO.getPontosVida());
			  System.out.println("Danos Causados: " + Armas.ARMAS_ARQUEIRO_3.getPoder());
			  danoDaArma = Armas.ARMAS_ARQUEIRO_3.getPoder();
		  }
		  
		  System.out.println("--------------------------------------------- \n");
		  
		  
		   Jogador play = new Jogador(nomePersonagem, armaSelecionada, danoDaArma, pontosDeVida);
		   String nomeGuerreiro = play.getNome();
		   String nomeArma = play.getArma();
		   int danoArma = play.getDanosCausados();
		   int vida = play.getPontosVida();
		   
//		   System.out.println("tipo guerreiro: " + nomeGuerreiro + "\n" +
//		   "Arma do guerreiro: " + nomeArma + "\n" +
//			"Dano causado: " + danoArma + "\n" +
//		   "Pontos de vida: " + vida);
		  
		  System.out.println("Tudo pronto vamos ao jogo! \n");
		  
		  System.out.println(Roteiro.INTRODUCAO.getTexto());
		  
		  System.out.println("Escolha o que te motiva a invadir a caverna do inimigoe derrota-lo.\n");
		  System.out.println("'VINGANÇA' ou 'GLORIA'? ");
		  Scanner scan = new Scanner(System.in);
		  String motivacao = scan.nextLine();
		  
		  if(motivacao.equalsIgnoreCase("Vingança")) {
			  System.out.println(Roteiro.VINGANCA.getTexto());
		  }else {
			  System.out.println(Roteiro.GLORIA.getTexto());
		  }
		  
		  System.out.println(Roteiro.PARTE2.getTexto());
		  System.out.println("Escolha entre seguir em: 'SEGUIR' ou DESISTIR'");
		  Scanner dec = new Scanner(System.in);
		  String decisao = dec.nextLine();
		  
		  if(decisao.equalsIgnoreCase("Seguir")) {
			  System.out.println(Roteiro.SEGUIR.getTexto());
			  
		  }else if(decisao.equalsIgnoreCase("Desistir")){
			  System.out.println(Roteiro.DESISTIR.getTexto());
			  System.exit(0);
		  }
		  
		  Scanner caminho = new Scanner(System.in);
		  String decisaoTrajeto = caminho.nextLine();
		  
		  if(decisaoTrajeto.equalsIgnoreCase("Andando")) {
			  Random random = new Random();
			  int totalDanos = random.nextInt(6)+ 1;
			  int resultado = pontosDeVida - totalDanos;
			  pontosDeVida = resultado;
			  System.out.println("Seu Saldo de vida atual é: " + pontosDeVida);
		  }
		  
		}
	

	// A chave abaixo corresponde as chave de fechamento da classe.
	}
