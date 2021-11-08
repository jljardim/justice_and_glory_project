package enums;

public enum Nivel {
     FACIL("FACIL"),
     NORMAL("NORMAL"),
     DIFICIL("DIFICIL");
	
	private String nivel;
	
	private Nivel(String nivel) {
		this.nivel = nivel;

	}

	public String getNivel() {
		return nivel;
	}

}
