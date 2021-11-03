package justice_and_glory_project;

public enum Roteiro {
    INTRODUCAO("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, \n"
    		+ "e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.\r\n "
    		+ "Você olha para o portal à sua frente, e sabe que a partir desse \n"
    		+ "ponto, sua vida mudará para sempre.\r\n"
    		+ "\r\n"
    		+ "Memórias do caminho percorrido para chegar até aqui invadem sua mente. \n"
    		+ "Você se lembra de todos os inimigos já derrotados para alcançar o covil \n"
    		+ "do líder maligno. Olha para seu equipamento de combate, já danificado e \n"
    		+ "desgastado depois de tantas lutas. Você está a um passo de encerrar para \n"
    		+ "sempre esse mal.\r\n"
    		+ "Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe "
    		+ "até aqui.\r\n");
	
	private String texto;
	
	private Roteiro(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

}
