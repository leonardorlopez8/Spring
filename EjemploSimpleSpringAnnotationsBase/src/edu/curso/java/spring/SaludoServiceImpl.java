package edu.curso.java.spring;

public class SaludoServiceImpl implements SaludoService {

	private String mensaje;

	@Override
	public String saludar() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
