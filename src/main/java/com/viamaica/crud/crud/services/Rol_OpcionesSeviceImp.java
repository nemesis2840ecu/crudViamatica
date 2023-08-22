package com.viamaica.crud.crud.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viamaica.crud.crud.models.PersonaModel;
import com.viamaica.crud.crud.models.Rol_OpcionesModel;
import com.viamaica.crud.crud.repository.IPersonaRep;
import com.viamaica.crud.crud.repository.IRol_OpcionesRep;

@Service
public class Rol_OpcionesSeviceImp implements IRol_OpcionesServices {
	@Autowired
	//@Qualifier("modelsRepository")
	private IRol_OpcionesRep _repository; 
	
	@Override
	@Transactional
	public List< Rol_OpcionesModel> findAll() {
		return (List<Rol_OpcionesModel>) _repository.findAll();
		
	}
	
	@Override
	@Transactional
	public void save(Rol_OpcionesModel model) {
		_repository.save(model);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol_OpcionesModel findById(Long id) {
		return _repository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Rol_OpcionesModel model) {
		_repository.delete(model);
		
	}
}
