package it.prova.materiaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.materiaprima.model.MateriaPrima;
import it.prova.materiaprima.model.StatoMateria;
import it.prova.materiaprima.spring.MyServiceFactory;

@Service
public class LavorazioneServiceImpl implements LavorazioneService {

	@Autowired
	private AssemblaggioService assemblaggioService;
	@Autowired
	private VerniciaturaService verniciaturaService;
	@Autowired
	private MessaInOperaService messaInOperaService;
	
	@Override
	public void inviaInLavorazione(MateriaPrima input) {
		input.setStatoMateria(StatoMateria.IN_LAVORAZIONE);
		MyServiceFactory.getMateriaPrimaService().aggiorna(input);
		System.out.println(input+" in lavorazione...");
		System.out.println("#############################");
		assemblaggioService.materiaInAssemblaggio(input);
		
		verniciaturaService.materiaInVerniciatura(input);
		
		messaInOperaService.materinaInMessaInOpera(input);
		System.out.println("#############################");
		input.setStatoMateria(StatoMateria.PRONTA);
		MyServiceFactory.getMateriaPrimaService().aggiorna(input);
		System.out.println("Materia: "+input.getStatoMateria());
	}

	public AssemblaggioService getAssemblaggioService() {
		return assemblaggioService;
	}

	public void setAssemblaggioService(AssemblaggioService assemblaggioService) {
		this.assemblaggioService = assemblaggioService;
	}

	public VerniciaturaService getVerniciaturaService() {
		return verniciaturaService;
	}

	public void setVerniciaturaService(VerniciaturaService verniciaturaService) {
		this.verniciaturaService = verniciaturaService;
	}

	public MessaInOperaService getMessaInOperaService() {
		return messaInOperaService;
	}

	public void setMessaInOperaService(MessaInOperaService messaInOperaService) {
		this.messaInOperaService = messaInOperaService;
	}

	
	
	
}
