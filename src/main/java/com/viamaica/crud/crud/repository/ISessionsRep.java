package com.viamaica.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viamaica.crud.crud.models.SessionsModel;

public interface ISessionsRep extends JpaRepository< SessionsModel ,  Long>{ 

	
}
