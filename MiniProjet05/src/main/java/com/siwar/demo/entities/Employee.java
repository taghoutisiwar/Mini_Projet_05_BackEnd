package com.siwar.demo.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Double salaire;
	private Date dateRec;
	
	@ManyToOne
	private Team team;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String nom, String prenom, Double salaire, Date dateRec) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.dateRec = dateRec;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public Date getDateRec() {
		return dateRec;
	}

	public void setDateRec(Date dateRec) {
		this.dateRec = dateRec;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	
	
}
