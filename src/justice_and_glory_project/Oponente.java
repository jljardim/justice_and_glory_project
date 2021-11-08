package justice_and_glory_project;

import java.util.Collection;

public class Oponente {
	
	private String nome;
    private String arma;
    private int danosCausados;
    private int pontosVida;
    
	
     public Oponente(String nome, String arma, int danosCausados, int pontosVida ) {
		this.nome = nome;
		this.arma = arma;
		this.danosCausados = danosCausados;
		this.pontosVida = pontosVida;
		
	}
     
     public Oponente() {
    	 
     }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public int getPontosVida() {
		return pontosVida;
	}

	public void setPontosVida(int pontosVida) {
		this.pontosVida = pontosVida;
	}

	public int getDanosCausados() {
		return danosCausados;
	}

	public void setDanosCausados(int danosCausados) {
		this.danosCausados = danosCausados;
	}
     
}
