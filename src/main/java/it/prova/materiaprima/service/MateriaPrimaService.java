package it.prova.materiaprima.service;

import it.prova.materiaprima.model.MateriaPrima;

public interface MateriaPrimaService {

	public MateriaPrima get(Long id);
	
	public void aggiorna(MateriaPrima input);
}
