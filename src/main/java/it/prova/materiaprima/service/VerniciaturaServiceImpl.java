package it.prova.materiaprima.service;

import org.springframework.stereotype.Service;

import it.prova.materiaprima.model.MateriaPrima;
import it.prova.materiaprima.model.StatoMateria;
import it.prova.materiaprima.spring.MyServiceFactory;

@Service
public class VerniciaturaServiceImpl implements VerniciaturaService {

	public void materiaInVerniciatura(MateriaPrima input) {
		input.setStatoMateria(StatoMateria.IN_VERNICIATURA);
		MyServiceFactory.getMateriaPrimaService().aggiorna(input);
		System.out.println(input+ " in verniciatura..");
	}
}
