package com.viamaica.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viamaica.crud.crud.models.UsuariosModel;

public interface IUsuariosRep extends JpaRepository< UsuariosModel,  Long> {

}
