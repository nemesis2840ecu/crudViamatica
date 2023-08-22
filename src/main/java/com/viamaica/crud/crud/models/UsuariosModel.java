package com.viamaica.crud.crud.models;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="Usuarios")
public class UsuariosModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private Long idUsuario;
	private String UserName;
	private String Password;
	private String Mail;
	private String SessionActive;


	
	@JoinColumn(name="idPersona", nullable=false)
	private Long persona_Id_persona2;

	private String Status;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getSessionActive() {
		return SessionActive;
	}

	public void setSessionActive(String sessionActive) {
		SessionActive = sessionActive;
	}

	

	public Long getPersona_IdPersona2() {
		return persona_Id_persona2;
	}

	public void setPersona_IdPersona2(Long persona_IdPersona2) {
		persona_Id_persona2 = persona_IdPersona2;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
}
