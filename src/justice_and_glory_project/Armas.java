package justice_and_glory_project;

public enum Armas {
	
       ARMAS_GUERREIRO_1("Espada", 100),
       ARMAS_GUERREIRO_2("Lanca", 95),
       ARMAS_GUERREIRO_3("Adaga", 88),
       
       ARMAS_VIKING_1("Machado", 102),
       ARMAS_VIKING_2("Estilingue", 98),
       ARMAS_VIKING_3("FacaSeax", 90),
       
       ARMAS_ARQUEIRO_1("ArcoFecha", 110),
       ARMAS_ARQUEIRO_2("Espada", 95),
	   ARMAS_ARQUEIRO_3("Balestra", 89);
	
	private String armas;
	private int poder;
	
	private Armas(String armas, int poder) {
		this.armas = armas;
		this.poder  = poder;
	}
	
	public String getArmas() {
		return armas;
	}
	
	public int getPoder() {
		return poder;
	}
}
