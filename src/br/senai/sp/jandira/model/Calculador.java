package br.senai.sp.jandira.model;

public class Calculador {

	private int multiplicando, contador, resultado;

	public void setResultado(int multiplicando, int contador) {
		resultado = multiplicando * contador;

		this.contador = contador;
		this.multiplicando = multiplicando;
	}

	public void ConversorResultado() {
		String resultadoString = String.valueOf(resultado);
		String contadorString = String.valueOf(contador);
		String multiplicandoString = String.valueOf(multiplicando);

	}

	public int getResultado() {
		return resultado;
	}

//	public void montarTabela() {
//		
//		String[] tabuada = new String[contador];
//		
//		for(contador; c ) {
//			
//		}
//		

}
