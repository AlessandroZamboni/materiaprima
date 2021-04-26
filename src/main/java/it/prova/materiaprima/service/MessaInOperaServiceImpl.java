package it.prova.materiaprima.service;

import org.springframework.stereotype.Service;

import it.prova.materiaprima.model.MateriaPrima;
import it.prova.materiaprima.model.StatoMateria;
import it.prova.materiaprima.spring.MyServiceFactory;

@Service
public class MessaInOperaServiceImpl implements MessaInOperaService {

	@Override
	public void materinaInMessaInOpera(MateriaPrima input) {
		input.setStatoMateria(StatoMateria.IN_MESSA_IN_OPERA);
		MyServiceFactory.getMateriaPrimaService().aggiorna(input);
		System.out.println(input+ " in messa in opera...");
	}

}
