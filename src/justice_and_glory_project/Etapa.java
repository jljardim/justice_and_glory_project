package justice_and_glory_project;

public class Etapa {
	private String textoEtapa;
    private String opcaoEtapa;
    private String opcaoEtapa1;
    private String opcaoEtapa2;
    private String opcaoEtapa3;
    
//    public Etapa(String textoEtapa, String opcaoEtapa1, String opcaoEtapa2, String opcaoEtapa3) {
//		this.textoEtapa = textoEtapa;
//		this.opcaoEtapa1 = opcaoEtapa1;
//		this.opcaoEtapa2 = opcaoEtapa2;
//		this.opcaoEtapa3 = opcaoEtapa3;
//	}
    
//    public Etapa(String textoEtapa) {
//       this.textoEtapa = textoEtapa;
//    }
    
//    public Etapa() {
//    	
//    }
    
   
    public String getOpcaoEtapa1() {
		return opcaoEtapa1;
	}

	public void setOpcaoEtapa1(String opcaoEtapa1) {
		this.opcaoEtapa1 = opcaoEtapa1;
	}

	public String getOpcaoEtapa2() {
		return opcaoEtapa2;
	}

	public void setOpcaoEtapa2(String opcaoEtapa2) {
		this.opcaoEtapa2 = opcaoEtapa2;
	}

	public String getOpcaoEtapa3() {
		return opcaoEtapa3;
	}

	public void setOpcaoEtapa3(String opcaoEtapa3) {
		this.opcaoEtapa3 = opcaoEtapa3;
	}

	public boolean verificaEntrada(String entrada) {
    	if (entrada.equalsIgnoreCase(opcaoEtapa)) {
    		return true;
    	}
    	return false;
    }

	public String getTextoEtapa() {
		return textoEtapa;
	}

	public void setTextoEtapa(String textoEtapa) {
		this.textoEtapa = textoEtapa;
	}

	public String getOpcaoEtapa() {
		return opcaoEtapa;
	}

	public void setOpcaoEtapa(String opcaoEtapa) {
		this.opcaoEtapa = opcaoEtapa;
	}
	
}
