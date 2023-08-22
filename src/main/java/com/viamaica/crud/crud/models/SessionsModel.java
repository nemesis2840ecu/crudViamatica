package com.viamaica.crud.crud.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Sessions")
public class SessionsModel  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdSessions;
	
	@Column(name="FechaIngreso")
	@Temporal(TemporalType.DATE)
	private Date FechaIngreso;
	
	@Column(name="FechaCierre")
	@Temporal(TemporalType.DATE)
	private Date FechaCierre;


	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public Date getFechaCierre() {
		return FechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		FechaCierre = fechaCierre;
	}
	
	
}
