package com.capgemini.wsb.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "id")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 19)
	private Long id;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "TIME", nullable = false)
	private LocalDateTime time;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private DoctorEntity doctor;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;

	@OneToMany(mappedBy = "visit")
	private List<MedicalTreatmentEntity> medicalTreatmentEntityList;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setMedicalTreatmentEntityList(List<MedicalTreatmentEntity> medicalTreatmentEntityList) {
		this.medicalTreatmentEntityList = medicalTreatmentEntityList;
	}

	public List<MedicalTreatmentEntity> getMedicalTreatmentEntityList() {
		return medicalTreatmentEntityList;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public PatientEntity getPatient() {
		return patient;
	}
}
