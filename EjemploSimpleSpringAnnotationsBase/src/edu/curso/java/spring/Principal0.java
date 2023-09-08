package edu.curso.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal0 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SaludoService saludoSetter = (SaludoService) context.getBean("saludoService");
		System.out.println(saludoSetter.saludar());

		SaludoService saludoConstructor = (SaludoService) context.getBean("saludoServiceConstructor");
		System.out.println(saludoConstructor.saludar());
		
		SaludoService saludoAnnotation = (SaludoService) context.getBean("saludoServiceAnnotation"); 
		System.out.println(saludoAnnotation.saludar()); 
		
		
		
		
		/*
		 * AbstractApplicationContext appContext = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Componente2
		 * componente2 = (Componente2) appContext.getBean("componente2Impl");
		 * componente2.hacerAlgoEnComponente2();
		 */

		// MiComponente3 miComponente3Impl = (MiComponente3)
		// appContext.getBean("madonna");
		// miComponente3Impl.saludar();

		// MiComponente3 miComponente3Impl2 = (MiComponente3)
		// appContext.getBean("madonna");
		// miComponente3Impl2.saludar();

	}
}
