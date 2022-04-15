package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private java.time.LocalDate dataInizio;
	
	@Column(nullable = false)
	private java.time.Period durata;
	
	@OneToOne
	private Docente docente;
	
	@OneToMany(mappedBy = "corsi", fetch = FetchType.EAGER)
	//FETCH: nell'ottica un un ente che eroga corsi di formazione potrebbe essere utili attuare una politica di fecth eager per i corsi
	List<Allievo> allievi;
	
	
	
	
}
