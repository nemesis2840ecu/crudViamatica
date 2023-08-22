package com.viamaica.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viamaica.crud.crud.models.Rol_UsuariosModel;

public interface IRol_UsuariosRep extends JpaRepository< Rol_UsuariosModel,  Long> {
	
}
