package edu.curso.java.spring;

public class Componente2Impl implements Componente2 {

	private String texto;

	public Componente2Impl() {
		System.out.println("Comp2Impl >>>>>> Creando componente 2");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		System.out.println("Comp2Impl >>>>>> Seteando texto " + texto);
		this.texto = texto;
	}
}
