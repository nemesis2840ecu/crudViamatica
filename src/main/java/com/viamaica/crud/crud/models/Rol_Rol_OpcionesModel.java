package com.viamaica.crud.crud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Rol_Rol_Opciones")
public class Rol_Rol_OpcionesModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Rol_idRol;
	
	private Long RolOpciones_IdOpcion;
	
	
}
