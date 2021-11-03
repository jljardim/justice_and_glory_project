package justice_and_glory_project;

public enum Personagens {
    GUERREIRO("Pontos_vida", 100),
    VIKING("Pontos_vida", 100),
    ARQUEIRO("Pontos_vida", 100);
	
	private String vida;
	private int saldo;
	
	private Personagens(String vida, int saldo) {
		this.vida = vida;
		this.saldo  = saldo;
	}

	public String getVida() {
		return vida;
	}

	public int getSaldo() {
		return saldo;
	}

}
