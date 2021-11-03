package justice_and_glory_project;

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
    		+ "at� aqui.\r\n");
	
	private String texto;
	
	private Roteiro(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

}
