package com.viamaica.crud.crud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Rol")
public class RolModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRol;
	
	private String RolName;
}
