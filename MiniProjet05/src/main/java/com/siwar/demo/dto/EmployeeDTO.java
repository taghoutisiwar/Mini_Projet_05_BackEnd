package com.siwar.demo.dto;

import java.util.Date;

import com.siwar.demo.entities.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDTO {
	private Long id;
	private String nom;
	private String prenom;
	private Double salaire;
	private Date dateRec;
	private Team team;
	private String nomEmployee ;
	
	
	public EmployeeDTO(Long id, String nom, String prenom, Double salaire, Date dateRec, Team team,
			String nomEmployee) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.dateRec = dateRec;
		this.team = team;
		this.nomEmployee = nomEmployee;
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


	public String getNomEmployee() {
		return nomEmployee;
	}


	public void setNomEmployee(String nomEmployee) {
		this.nomEmployee = nomEmployee;
	} 
	
	/*public static Object builder() {
	
	return null;
	}*/
	
	
}
