package com.viamaica.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viamaica.crud.crud.models.RolModel;

public interface IRolRep extends JpaRepository< RolModel,  Long> {

}
