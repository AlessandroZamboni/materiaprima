package it.prova.materiaprima.service;

import org.springframework.stereotype.Service;

import it.prova.materiaprima.model.MateriaPrima;
import it.prova.materiaprima.model.StatoMateria;
import it.prova.materiaprima.spring.MyServiceFactory;

@Service
public class AssemblaggioServiceImpl implements AssemblaggioService {

	public void materiaInAssemblaggio(MateriaPrima input) {
		input.setStatoMateria(StatoMateria.IN_ASSEMBLAGGIO);
		MyServiceFactory.getMateriaPrimaService().aggiorna(input);
		System.out.println(input+ " in assemblaggio...");
	}
}
