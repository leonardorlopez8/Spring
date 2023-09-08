package edu.curso.java.spring;

public class Componente2Impl implements Componente2 {

	private Componente1 componente1;
	
	//creamos un metodo
	@Override
	public void hacerAlgoEnComponente2() {
		System.out.println("Ejecutando hacerAlgoEnComponente2 en Componente2Impl");
	    componente1.haceralgoEnComponente1();
	}
	
	public Componente1 getComponente1() {
		return componente1;
	}

	public void setComponente1(Componente1 componente1) {
		System.out.println("Ejecutando el setComponente1.........");
		this.componente1 = componente1;
	}

	public Componente2Impl() {
		System.out.println("Creando un nuevo Componente2Impl");
	}
	

	
	
	
	
	
	/*
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
*/
}
