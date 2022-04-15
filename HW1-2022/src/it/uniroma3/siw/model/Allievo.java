package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Allievo {
	
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
	private String matricola;
	
	@Column(nullable = false)
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
	//FETCH: non e interessante recuoerare le informazioni di una societá osservando un allievo 
	//CASCADE: bosogna aggiornare anche la lista dagli allievi presenti in corsi
	private Societa  societa;
	
	@OneToMany
	private List<Corso> corsi;

}
