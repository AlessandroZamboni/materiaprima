package it.prova.materiaprima.model;

public class MateriaPrima {

	private Long id;
	private String descrizione;
	private StatoMateria statoMateria;
	
	public MateriaPrima() {}

	public MateriaPrima(Long id, String descrizione, StatoMateria statoMateria) {
		this.id = id;
		this.descrizione = descrizione;
		this.statoMateria = statoMateria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public StatoMateria getStatoMateria() {
		return statoMateria;
	}

	public void setStatoMateria(StatoMateria statoMateria) {
		this.statoMateria = statoMateria;
	}

	@Override
	public String toString() {
		return descrizione;
	}
	
	
	
}
