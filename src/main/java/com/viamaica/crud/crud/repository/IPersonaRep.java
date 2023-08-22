package com.viamaica.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viamaica.crud.crud.models.PersonaModel;

@Repository
public interface IPersonaRep extends JpaRepository< PersonaModel,  Long>{

}
