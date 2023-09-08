package edu.curso.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
@Component("madonna")
@Scope("prototype")
public class MiComponente3Impl implements MiComponente3 {

	@Autowired
	@Qualifier("miComponente5")
	private MiComponente4 miComponente4;
	
	public MiComponente3Impl() {
		System.out.println("Creando un MiComponente3Impl...");
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, soy el compomente MiComponente3Impl...");
		miComponente4.saludar();
	}
	

}
*/