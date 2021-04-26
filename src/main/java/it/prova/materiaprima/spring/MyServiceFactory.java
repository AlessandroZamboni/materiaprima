package it.prova.materiaprima.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.prova.materiaprima.service.LavorazioneService;
import it.prova.materiaprima.service.MateriaPrimaService;

public class MyServiceFactory {

	private static ApplicationContext ctx;

	static {
		try {
			ctx  = new AnnotationConfigApplicationContext(AppConfig.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static MateriaPrimaService getMateriaPrimaService() {
		return ctx.getBean(MateriaPrimaService.class);
	}
	
	public static LavorazioneService getLavorazioneService() {
		return ctx.getBean(LavorazioneService.class);
	}
}
