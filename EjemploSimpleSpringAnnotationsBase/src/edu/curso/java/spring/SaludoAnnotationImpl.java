package edu.curso.java.spring;

import org.springframework.beans.factory.annotation.Value;

public class SaludoAnnotationImpl implements SaludoService {
	@Value("¡Hola mediante anotación!")
	private String mensaje;

	@Override
	public String saludar() {
		return mensaje;
	}

}
