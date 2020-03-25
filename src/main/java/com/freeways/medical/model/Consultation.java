package com.freeways.medical.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Consultation")
public class Consultation {
	@Id
    @GeneratedValue
	private Integer id;
	@Column(name="date_consultation", nullable = false)
	private Date date;
	@Column(name="ordonnance", nullable = false)
	private String ordonnance; //(médicament, bilan, IRM, صورة أشعة)

//    @ManyToOne
//    @JoinColumn
//    private Patient patient;
//	
//    
//    @ManyToOne
//    @JoinColumn
//    private Doctor doctor;

	  @ManyToOne
	  @JoinColumn
	  private User user;

    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}

//	public Patient getPatient() {
//		return patient;
//	}
//
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
//
//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}

	public Consultation(Integer id, Date date, String ordonnance) {
		super();
		this.id = id;
		this.date = date;
		this.ordonnance = ordonnance;
		//this.patient = patient;
		//this.doctor = doctor;
	}
	public Consultation() {
		super();
	}

//	@Override
//	public String toString() {
//		return "Consultation [id=" + id + ", date=" + date + ", ordonnance=" + ordonnance + ", patient=" 
//				+ ", doctor="  + "]";
//	}   
}