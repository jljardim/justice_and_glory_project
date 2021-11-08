package enums;

public enum Tipos_Guerreiro {
   
	SOLDADO("Soldado", 35),
	VIKING("Viking", 25),
	ARQUEIRO("Arqueiro", 20);
	
	private String guerreiro;
	private int pontosVida;
	
	private Tipos_Guerreiro(String guerreiro, int pontosVida) {
		this.guerreiro = guerreiro;
		this.pontosVida = pontosVida;
	}

	public String getGuerreiro() {
		return guerreiro;
	}

	public int getPontosVida() {
		return pontosVida;
	}
 
}
