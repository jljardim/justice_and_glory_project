package justice_and_glory_project;

import java.util.Scanner;

public class Combate {
	public static void main(String[] args) {
		System.out.println("Incio");
		System.out.println("Digite [1] para iniciar ou [2] para sair do jogo");
		Scanner entrada = new Scanner(System.in);
		String opcaoInicio = entrada.nextLine();
		System.out.println(opcaoInicio);
	}
}
