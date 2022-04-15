package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private java.time.LocalDate dataDiNascita;
	
	@Column(nullable = false)
	private String luogoDiNascita;
	
	@Column(nullable = false)
	private String partitaIva;
	
	@OneToMany(mappedBy = "docente")
	List<Corso> corsi;

}
