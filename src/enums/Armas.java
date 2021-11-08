package enums;

public enum Armas {
	
       ARMAS_SOLDADO_1("Espada", 9),
       ARMAS_SOLDADO_2("Lanca", 7),
       ARMAS_SOLDADO_3("Adaga", 5),
       
       ARMAS_VIKING_1("Machado", 8),
       ARMAS_VIKING_2("Estilingue", 6),
       ARMAS_VIKING_3("FacaSeax", 4),
       
       ARMAS_ARQUEIRO_1("ArcoFecha", 7),
       ARMAS_ARQUEIRO_2("Espada", 6),
	   ARMAS_ARQUEIRO_3("Balestra", 5);
	
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
