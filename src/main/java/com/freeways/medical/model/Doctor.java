//package com.freeways.medical.model;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name = "Doctor")
//public class Doctor {
//	@Id
//    @GeneratedValue
//	private Integer id;
//	@Column(name="nom", nullable = false)
//	private String nom;
//	@Column(name="prenom", nullable = false)
//	private String prenom;
//	@Column(name="adresse_cabinet", nullable = false)
//	private String adresseCabinet;
//	@Column(name="num_cabinet", nullable = false)
//	private Integer numCabinet;
//	@Column(name="numm_personnel", nullable = false)
//	private Integer numPersonnel;
//
//    @NotBlank
//    @Size(max = 50)
//    @Email
//    private String email;
// 
//    @NotBlank
//    @Size(min=6, max = 100)
//    private String password;
//    
//    
//    
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "user_roles", 
//      joinColumns = @JoinColumn(name = "doctor_id"), 
//      inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
//    private Set<Role> roles = new HashSet<>();
//  
//	
//	
//    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<Consultation> consultations;
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
//	public String getAdresseCabinet() {
//		return adresseCabinet;
//	}
//
//	public void setAdresseCabinet(String adresseCabinet) {
//		this.adresseCabinet = adresseCabinet;
//	}
//
//	public Integer getNumCabinet() {
//		return numCabinet;
//	}
//
//	public void setNumCabinet(Integer numCabinet) {
//		this.numCabinet = numCabinet;
//	}
//
//	public Integer getNumPersonnel() {
//		return numPersonnel;
//	}
//
//	public void setNumPersonnel(Integer numPersonnel) {
//		this.numPersonnel = numPersonnel;
//	}
//
//	public List<Consultation> getConsultations() {
//		return consultations;
//	}
//
//	public void setConsultations(List<Consultation> consultations) {
//		this.consultations = consultations;
//	}
//
//	@Override
//	public String toString() {
//		return "Doctor [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresseCabinet=" + adresseCabinet
//				+ ", numCabinet=" + numCabinet + ", numPersonnel=" + numPersonnel + ", consultations=" +
//				"]";
//	}
//	
//
//	public Doctor(Integer id, String nom, String prenom, String adresseCabinet, Integer numCabinet,
//			Integer numPersonnel, List<Consultation> consultations) {
//		super();
//		this.id = id;
//		this.nom = nom;
//		this.prenom = prenom;
//		this.adresseCabinet = adresseCabinet;
//		this.numCabinet = numCabinet;
//		this.numPersonnel = numPersonnel;
//		this.consultations = consultations;
//	}
//	
//	public Doctor() {
//		super();
//	}
//}