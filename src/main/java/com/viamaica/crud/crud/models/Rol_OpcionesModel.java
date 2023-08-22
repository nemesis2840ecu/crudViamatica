package com.viamaica.crud.crud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Rol_Opciones")
public class Rol_OpcionesModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdOpcion;
	
	private Long NombreOpcion;

	public Long getIdOpcion() {
		return IdOpcion;
	}

	public void setIdOpcion(Long idOpcion) {
		IdOpcion = idOpcion;
	}

	public Long getNombreOpcion() {
		return NombreOpcion;
	}

	public void setNombreOpcion(Long nombeOpcion) {
		NombreOpcion = nombeOpcion;
	}
	
	
}
