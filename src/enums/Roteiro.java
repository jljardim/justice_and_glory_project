package enums;

public enum Roteiro {
    INTRODUCAO("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, \n"
    		+ "e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o.\r\n "
    		+ "Voc� olha para o portal � sua frente, e sabe que a partir desse \n"
    		+ "ponto, sua vida mudar� para sempre.\r\n"
    		+ "\r\n"
    		+ "Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. \n"
    		+ "Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil \n"
    		+ "do l�der maligno. Olha para seu equipamento de combate, j� danificado e \n"
    		+ "desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para \n"
    		+ "sempre esse mal.\r\n"
    		+ "Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe "
    		+ "at� aqui.\r\n"),
	
	VINGANCA("Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar\r\n"
			+ "para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo,\r\n"
			+ "quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel\r\n"
			+ "que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles\r\n"
			+ "que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. O maldito l�der\r\n"
			+ "finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua)."),
	
	GLORIA("Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os\r\n"
			+ "abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e\r\n"
			+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde\r\n"
			+ "j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir\r\n"
			+ "o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que ainda falta o �ltimo ato dessa\r\n"
			+ "hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.\r\n"
			+ ""),
	
	PARTE2("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas\r\n"
			+ "m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado.\r\n"
			+ "Voc� avan�a pelo portal.\r\n"
			+ "\r\n"
			+ "A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua\r\n"
			+ "frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir �\r\n"
			+ "'FRENTE', ou 'DESISTIR'.\r\n"
			+ ""),
	
	DESISTIR("DESISTIR: o medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio.\r\n"
			+ "Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.\r\n"
			+ "[------ AT� A PROXIMA ------]"),
	
	SEGUIR("SEGUIR: voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente\r\n"
			+ "uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta\r\n"
			+ "aberta.\r\n"
			+ "Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\r\n"
			+ "sobre como passar pela porta.\r\n"
			+ "[ANDANDO CUIDADOSAMENTE, CORRENDO, SALTANDO]. \n"
			+ "Escolha se vai: ['ANDANDO', 'CORRENDO', 'SALTANDO']"),
	
	SALTANDO("SALTANDO: Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior\r\n"
			+ "da sala.\r\n"),
	
	ANDANDO("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc�\r\n"
			+ "pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado\r\n"
			+ "em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se\r\n"
			+ "abre no teto atr�s de voc�, no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta\r\n"
			+ "para dentro da sala, por�m uma delas te acerta na perna."),
	
	CORRENDO("Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta,\r\n"
			+ "sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala,\r\n"
			+ "olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas\r\n"
			+ "batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta,\r\n"
			+ "voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\r\n"
			+ "mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.\r\n"
			+ "");
	
	
	
	private String texto;
	
	private Roteiro(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

}
