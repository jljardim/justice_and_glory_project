package justice_and_glory_project;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("OLÁ JOGADOR PRONTO PARA SUA MISSÃO?");
		System.out.println("\n");
		System.out.println("Digite [1] para iniciar ou [2] para sair do jogo");
		
		for(int i = 0;i <= 2; i++) {
			
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		opcao = entrada.nextInt();
		
		if (opcao == 1) {
			
		System.out.println("Seja bem vindo(a) á BATALHA FINAL");
		
		System.out.println("Escolha a dificuldade que você quer jogar");
		
		System.out.println("Digite [1] para facil, [2] para normal e [3] para dificil");
		
		int dificuldade;
		
		dificuldade = entrada.nextInt();
		
		Dificuldade nivel = new Dificuldade();
		
		if(dificuldade  == 1) {
		System.out.println("OK você quer jogar no nivel: " + nivel.getFacil().toUpperCase());
		
		}else if(dificuldade == 2) {
		System.out.println("OK você quer jogar no nivel: " + nivel.getNormal().toUpperCase());
		
		}else if (dificuldade == 3) {
		System.out.println("OK você quer jogar no nivel: " + nivel.getDificil().toUpperCase());
		
		}else {
			System.out.println("Opção invalida começe o jogo outra vez");
		}
			
		
	}else if(opcao == 2){
		System.out.println("Te vejo na Proxima");
		break;
	}else {
		System.out.println("Opção invalida Digite [1] para iniciar ou [2] para sair do jogo ");
	}
  }
}
}
