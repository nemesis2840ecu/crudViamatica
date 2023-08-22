package com.viamaica.crud.crud.models;


import java.io.Serializable;
import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Persona")
public class PersonaModel implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPersona")
	private Long idPersona;
	private String Nombres;
	private String Apellidos;
	private String Identificacion;
	
	@Column(name="FechaNacimiento")
	@Temporal(TemporalType.DATE)
	private Date FechaNacimiento;
	

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona_Id_persona2")
	private List<UsuariosModel> usuarios = new ArrayList<>();
	
	/*
	
	@JoinColumn(name="Pesona_IdPersona2", nullable=false)	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Pesona_IdPersona2")
	private List<UsuariosModel> usuarios = new ArrayList<>();
	
	
	@ManyToAny
	@JoinColumn(name="Persona_IdPersona2", nullable=false)	
	private List<UsuariosModel>  usuarios;
	
	
    
	*/
	
	
	public List<UsuariosModel> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuariosModel> usuarios) {
		this.usuarios = usuarios;
	}

	public String getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
	}

	

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date createAt) {
		this.FechaNacimiento = createAt;
	}
	
	
	
	private static final long serialVersionUID = 1L;
}
