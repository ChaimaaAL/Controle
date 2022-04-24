package com.example.controle.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity 
@Data   @AllArgsConstructor  @NoArgsConstructor

public class Livre {
	
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@Column(length = 50)
	private String titre;
	
	@NonNull
	@Column(updatable=false)
	private String maisonEdit;
	
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date dateSortie;
	
	@NonNull
	private String auteur;
	
	@NonNull
	private int nbrPage;
	
	@NonNull
	@Column(unique=true, updatable=false)
	private String ISBN;
	
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date dateConsult;
	
	@NonNull
	private boolean dispo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Livre(@NonNull String titre, @NonNull String maisonEdit, @NonNull Date dateSortie, @NonNull String auteur,
			@NonNull int nbrPage, @NonNull String iSBN, @NonNull Date dateConsult, @NonNull boolean dispo) {
		super();
		this.titre = titre;
		this.maisonEdit = maisonEdit;
		this.dateSortie = dateSortie;
		this.auteur = auteur;
		this.nbrPage = nbrPage;
		ISBN = iSBN;
		this.dateConsult = dateConsult;
		this.dispo = dispo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMaisonEdit() {
		return maisonEdit;
	}

	public void setMaisonEdit(String maisonEdit) {
		this.maisonEdit = maisonEdit;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrPage() {
		return nbrPage;
	}

	public void setNbrPage(int nbrPage) {
		this.nbrPage = nbrPage;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Date getDateConsult() {
		return dateConsult;
	}

	public void setDateConsult(Date dateConsult) {
		this.dateConsult = dateConsult;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public Livre() {
		super();
	}
}
