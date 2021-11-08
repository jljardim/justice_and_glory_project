package enums;

public enum Tipos_Oponente {
	LIDER("Lider", "Foice", 8, 18),
	ARMEIRO("Armeiro", "Faca",  3, 11),
	ALQUIMISTA("Alquimista", "Poção",  2, 8);
	
	private String oponente;
	private String arma;
	private int dano;
	private int pontosDeVida;
	
	private Tipos_Oponente(String oponente, String arma, int dano, int pontosDeVida) {
		this.oponente = oponente;
		this.arma = arma;
		this.dano  = dano;
		this.pontosDeVida  = pontosDeVida;
	}

	public String getArma() {
		return arma;
	}


	public int getPontosDeVida() {
		return pontosDeVida;
	}


	public String getOponente() {
		return oponente;
	}

	public int getDano() {
		return dano;
	}
}
