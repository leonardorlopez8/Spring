package edu.curso.java.spring;

public class Componente3TipoComponente2 implements Componente2 {

	@Override
	public String getTexto() {
		return "No voy a hacer nada... esto es un ejeeplo de cambio de componente sin tocar codigo!!!";
	}

	@Override
	public void setTexto(String texto) {
	}

}
