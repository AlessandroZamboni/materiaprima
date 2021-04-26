package it.prova.materiaprima.dao;

import org.springframework.stereotype.Component;

import it.prova.materiaprima.model.MateriaPrima;

@Component
public class MateriaPrimaDAOImplMock implements MateriaPrimaDAO {

	@Override
	public MateriaPrima get(Long id) {
		for (MateriaPrima materiaPrimaItem : DbMock.MATERIE_PRIME) {
			if(materiaPrimaItem.getId() == id)
				return materiaPrimaItem;
		}
		return null;
	}

	@Override
	public void aggiorna(MateriaPrima input) {
		for (MateriaPrima materiaPrimaItem : DbMock.MATERIE_PRIME) {
			if(materiaPrimaItem.getId() == input.getId()) {
				materiaPrimaItem.setStatoMateria(input.getStatoMateria());
				materiaPrimaItem.setDescrizione(input.getDescrizione());
			}
		}
	}

}
