//package com.freeways.medical.model;
//
//import java.util.Date;
//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//
//@Entity
//@Table(name = "Patient")
//public class Patient {
//	@Id
//    @GeneratedValue
//	private Integer id;
//	@Column(name="nom", nullable = false)
//	private String nom;
//	@Column(name="prenom", nullable = false)
//	private String prenom;
//	@Column(name="adresse", nullable = false)
//	private String adresse;
//	@Column(name="date_naissance", nullable = false)
//	private Date dateNaiss;
//	@Column(name="num_tel", nullable = false)
//	private Integer numTel;
//	@Column(name="cin", nullable = true)
//	private Integer cin;
//	
//	
//	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
//	@JsonIgnore
//	private List<Consultation> consultations;
//
//	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//
//	public String getPrenom() {
//		return prenom;
//	}
//
//	public void setPrenom(String prenom) {
//		this.prenom = prenom;
//	}
//
//	public String getAdresse() {
//		return adresse;
//	}
//
//	public void setAdresse(String adresse) {
//		this.adresse = adresse;
//	}
//
//	public Date getDateNaiss() {
//		return dateNaiss;
//	}
//
//	public void setDateNaiss(Date dateNaiss) {
//		this.dateNaiss = dateNaiss;
//	}
//
//	public Integer getNumTel() {
//		return numTel;
//	}
//
//	public void setNumTel(Integer numTel) {
//		this.numTel = numTel;
//	}
//
//	public Integer getCin() {
//		return cin;
//	}
//
//	public void setCin(Integer cin) {
//		this.cin = cin;
//	}
//
////	public List<Consultation> getConsultations() {
////		return consultations;
////	}
////
////	public void setConsultations(List<Consultation> consultations) {
////		this.consultations = consultations;
////	}
//
//	@Override
//	public String toString() {
//		return "Patient [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", dateNaiss="
//				+ dateNaiss + ", numTel=" + numTel + ", Cin=" + cin + ", consultations="  + "]";
//	}
//
//	public Patient(Integer id, String nom, String prenom, String adresse, Date dateNaiss, Integer numTel, Integer cin,
//			List<Consultation> consultations) {
//		super();
//		this.id = id;
//		this.nom = nom;
//		this.prenom = prenom;
//		this.adresse = adresse;
//		this.dateNaiss = dateNaiss;
//		this.numTel = numTel;
//		this.cin = cin;
//		//this.consultations = consultations;
//	}
//	
//	public Patient() {
//		super();
//	}	
//}