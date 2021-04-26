package it.prova.materiaprima.test;

import it.prova.materiaprima.model.MateriaPrima;
import it.prova.materiaprima.service.LavorazioneService;
import it.prova.materiaprima.service.MateriaPrimaService;
import it.prova.materiaprima.spring.MyServiceFactory;

public class MateriaPrimaTest {
	
	public static void main(String[] args) {
		LavorazioneService lavorazioneService = MyServiceFactory.getLavorazioneService();
		MateriaPrimaService materiaPrimaService = MyServiceFactory.getMateriaPrimaService();
	
		MateriaPrima test = materiaPrimaService.get(1L);
		
		lavorazioneService.inviaInLavorazione(test);
	}

}
