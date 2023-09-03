package edu.curso.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//		Componente1 componente1 = (Componente1) appContext.getBean("componente1");
//		componente1.mostrarT();
		
		
		
		
		MiComponente3 miComponente3Impl = (MiComponente3) appContext.getBean("madonna");
		miComponente3Impl.saludar();
		
		MiComponente3 miComponente3Impl2 = (MiComponente3) appContext.getBean("madonna");
		miComponente3Impl2.saludar();
		
	}

}