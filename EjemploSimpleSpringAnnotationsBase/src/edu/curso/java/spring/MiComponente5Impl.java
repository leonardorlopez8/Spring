package edu.curso.java.spring;

import org.springframework.stereotype.Component;

@Component ("miComponente5")
public class MiComponente5Impl implements MiComponente4{
	
	public MiComponente5Impl() {
		System.out.println("Creando el MiComponente5Impl...");
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, ojo qeu soy el MiComponente4Impl ");
	}
}
