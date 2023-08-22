package com.viamaica.crud.crud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Rol_Usuarios")
public class Rol_UsuariosModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Rol_Idusuario;
	
	private Long usuarios_IdUsuario;
	
}
