package enums;

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
    		+ "até aqui.\r\n"),
	
	VINGANCA("Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\r\n"
			+ "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\r\n"
			+ "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\r\n"
			+ "que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\r\n"
			+ "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\r\n"
			+ "finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua)."),
	
	GLORIA("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços\r\n"
			+ "abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\r\n"
			+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\r\n"
			+ "já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\r\n"
			+ "o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\r\n"
			+ "história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.\r\n"
			+ ""),
	
	PARTE2("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas\r\n"
			+ "mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.\r\n"
			+ "Você avança pelo portal.\r\n"
			+ "\r\n"
			+ "A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua\r\n"
			+ "frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à\r\n"
			+ "'FRENTE', ou 'DESISTIR'.\r\n"
			+ ""),
	
	DESISTIR("DESISTIR: o medo invade o seu coração e você sente que ainda não está à altura do desafio.\r\n"
			+ "Você se volta para a noite lá fora e corre em direção à segurança.\r\n"
			+ "[------ ATÉ A PROXIMA ------]"),
	
	SEGUIR("SEGUIR: você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente\r\n"
			+ "uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta\r\n"
			+ "aberta.\r\n"
			+ "Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\r\n"
			+ "sobre como passar pela porta.\r\n"
			+ "[ANDANDO CUIDADOSAMENTE, CORRENDO, SALTANDO]. \n"
			+ "Escolha se vai: ['ANDANDO', 'CORRENDO', 'SALTANDO']"),
	
	SALTANDO("SALTANDO: Você se concentra e pula em direção à luz, saltando de antes da porta até o interior\r\n"
			+ "da sala.\r\n"),
	
	ANDANDO("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você\r\n"
			+ "pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado\r\n"
			+ "em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se\r\n"
			+ "abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta\r\n"
			+ "para dentro da sala, porém uma delas te acerta na perna."),
	
	CORRENDO("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,\r\n"
			+ "sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,\r\n"
			+ "olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas\r\n"
			+ "batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta,\r\n"
			+ "você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\r\n"
			+ "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.\r\n"
			+ "");
	
	
	
	private String texto;
	
	private Roteiro(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

}
