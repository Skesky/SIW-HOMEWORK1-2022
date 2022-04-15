package it.uniroma3.siw.model;

import javax.persistence.*;

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String ragioneSociale;
	
	@Column(nullable = false)
	private String numeroTelefono;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	//FETCH: e' necessario avere un cascade perche' ogni societa' avere un indirizzo
	private Indirizzo indirizzoSede;
	
	
	

}
