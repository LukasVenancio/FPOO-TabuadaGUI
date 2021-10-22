package br.senai.sp.jandira.model;

public class Calculador {
	
	private int multiplicando, contador, resultado;
	
	public void setResultado(int multiplicando, int contador) {
		resultado = multiplicando * contador;	
	}
	
	public int getResultado() {
		return resultado;
	}

	public int getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}


}
