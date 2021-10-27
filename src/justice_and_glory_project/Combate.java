package justice_and_glory_project;

import java.util.Scanner;

public class Combate {
	public static void main(String[] args) {
		System.out.println("Incio");
		System.out.println("Digite [1] para iniciar ou [2] para sair do jogo");
		int opcao;
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextInt();
		if (opcao = 1) {
		System.out.println("Vamos ao Jogo");
	}else {
		System.out.println("Te vejo na Proxima");
	}
}
}
