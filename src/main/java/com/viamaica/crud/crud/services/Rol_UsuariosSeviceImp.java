package com.viamaica.crud.crud.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viamaica.crud.crud.models.Rol_UsuariosModel;
import com.viamaica.crud.crud.repository.IRol_UsuariosRep;

@Service
public class Rol_UsuariosSeviceImp implements IRol_UsuariosServices {
	@Autowired
	//@Qualifier("ClientesRepository")
	private IRol_UsuariosRep _repository; 
	
	@Override
	@Transactional
	public List< Rol_UsuariosModel> findAll() {
		return (List<Rol_UsuariosModel>) _repository.findAll();
		
	}
	
	@Override
	@Transactional
	public void save(Rol_UsuariosModel cliente) {
		_repository.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol_UsuariosModel findById(Long id) {
		return _repository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Rol_UsuariosModel cliente) {
		_repository.delete(cliente);
		
	}
}
