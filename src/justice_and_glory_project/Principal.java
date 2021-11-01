package justice_and_glory_project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public List<Etapa> etapas;
	
	public static void main(String[] args) {
	
		Etapa etapa1 = new Etapa("Bem vindo(a) á BATALHA FINAL!\n");
		
		Etapa etapa2 = new Etapa("Escolha um nivel de dificuldade. FACIL, NORMAL, DIFICIL.", "FACIL",
				"NORMAL","DIFICIL");
		
		Etapa etapa3 = new Etapa("Informe seu nome e sexo. FACIL, NORMAL, DIFICIL.", "JEFERSON",
				"MASCULINO","FEMININO");
		
		Etapa etapa4 = new Etapa("Escolha uma classe de combate. GUERREIRO, VIKING, ESTUDANTE.", "GUERREIRO",
				"VIKING","ESTUDANTE");
        
        List<Etapa> etapas = new ArrayList<Etapa>();
        etapas.add(etapa1);
        etapas.add(etapa2);
        etapas.add(etapa3);
        etapas.add(etapa4);
        
       //System.out.println("Bem vindo(a) á BATALHA FINAL!\n");
        
        int etapaAtual = 1;
        System.out.println(etapas.get(0).getTextoEtapa());
        System.out.println(etapas.get(1).getTextoEtapa());
        Scanner scannerDif = new Scanner(System.in);
        String dificuldade = scannerDif.nextLine();
        if(dificuldade.equalsIgnoreCase(etapas.get(etapaAtual).getOpcaoEtapa1())||
           dificuldade.equalsIgnoreCase(etapas.get(etapaAtual).getOpcaoEtapa2()) ||
           dificuldade.equalsIgnoreCase(etapas.get(etapaAtual).getOpcaoEtapa3())) {
        	
        	etapaAtual = 2;
        	//System.out.println(etapaAtual);
        	System.out.println(etapas.get(etapaAtual).getTextoEtapa());
        	System.out.println("\n");
        	System.out.println("------------INFORMAÇÕES DO JOGADOR-------------");
        	System.out.println("Nome: " + "Jeferson" + "\n" +
        	"Sexo: " + "Masculino" + "\n" +
        	"Dificuldade: " + dificuldade + "\n" +
        	"Classe de combate: " + "Guerreiro");
        	System.out.println("------------------------------------------------");
        }
//		System.out.println("OLÁ JOGADOR PRONTO PARA SUA MISSÃO? \n");
//		System.out.println("Digite [1] para iniciar ou [2] para sair do jogo \n");
//		
//		int opcao;
//				
//	    Scanner entrada = new Scanner(System.in);
//				
//		opcao = entrada.nextInt();
//			
//		if (opcao == 1) {
//			
//		System.out.println("Seja bem vindo(a) á BATALHA FINAL \n");
//		}else if(opcao == 2){
//		System.out.println("Te vejo na Proxima");
//		System.exit(0);
//		}else {
//		System.out.println("Opção invalida começe novamente.");
//		System.exit(0);
//		}
//		
//		System.out.println("Escolha a dificuldade que você quer jogar \n");
//		
//		System.out.println("Digite [1] para facil, [2] para normal e [3] para dificil");
//		
//		int dificuldade;
//		
//		Scanner entrada2 = new Scanner(System.in);
//		
//		dificuldade = entrada2.nextInt();
//		
//		Dificuldade nivel = new Dificuldade();
//		
//		if(dificuldade  == 1) {
//		System.out.println("OK você quer jogar no nivel: " + nivel.getFacil().toUpperCase());
//		
//		}else if(dificuldade == 2) {
//		System.out.println("OK você quer jogar no nivel: " + nivel.getNormal().toUpperCase());
//		
//		}else if (dificuldade == 3) {
//		System.out.println("OK você quer jogar no nivel: " + nivel.getDificil().toUpperCase());
//		
//		}else {
//			System.out.println("Opção invalida começe o jogo outra vez");
//		}
//			
//		}
	}
}
