package edu.curso.java.spring;

public class SaludoConstructorImpl implements SaludoService {
	private String mensaje;

	public SaludoConstructorImpl(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String saludar() {
		return mensaje;
	}

}
