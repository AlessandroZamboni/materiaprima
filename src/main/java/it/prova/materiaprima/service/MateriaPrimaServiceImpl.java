package it.prova.materiaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.materiaprima.dao.MateriaPrimaDAO;
import it.prova.materiaprima.model.MateriaPrima;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService {

	@Autowired
	MateriaPrimaDAO materiaPrimaDAO;

	@Override
	public MateriaPrima get(Long id) {
		return materiaPrimaDAO.get(id);
	}

	@Override
	public void aggiorna(MateriaPrima input) {
		materiaPrimaDAO.aggiorna(input);		
	}
	
}
