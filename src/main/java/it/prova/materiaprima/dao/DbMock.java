package it.prova.materiaprima.dao;

import java.util.ArrayList;
import java.util.List;

import it.prova.materiaprima.model.MateriaPrima;
import it.prova.materiaprima.model.StatoMateria;

public class DbMock {

	public static final List<MateriaPrima> MATERIE_PRIME = new ArrayList<>();
	
	static {
		MateriaPrima oro = new MateriaPrima(1L,"oro",StatoMateria.IN_INSERIMENTO);
		MateriaPrima argento = new MateriaPrima(2L,"argento",StatoMateria.IN_INSERIMENTO);
		MateriaPrima rame = new MateriaPrima(3L,"rame",StatoMateria.IN_INSERIMENTO);
		
		MATERIE_PRIME.add(oro);
		MATERIE_PRIME.add(argento);
		MATERIE_PRIME.add(rame);
	}
}
