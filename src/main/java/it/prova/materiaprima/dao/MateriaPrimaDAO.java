package it.prova.materiaprima.dao;

import it.prova.materiaprima.model.MateriaPrima;

public interface MateriaPrimaDAO {

	public MateriaPrima get(Long id);
	
	public void aggiorna(MateriaPrima input);
	
}
