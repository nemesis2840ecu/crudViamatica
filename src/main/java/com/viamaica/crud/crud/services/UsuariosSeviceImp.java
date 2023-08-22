package com.viamaica.crud.crud.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viamaica.crud.crud.models.UsuariosModel;
import com.viamaica.crud.crud.repository.IUsuariosRep;

@Service
public class UsuariosSeviceImp implements IUsuariosServices {
	@Autowired
	//@Qualifier("modelsRepository")
	private IUsuariosRep _repository; 
	
	@Override
	@Transactional
	public List< UsuariosModel> findAll() {
		return (List<UsuariosModel>) _repository.findAll();
		
	}
	
	@Override
	@Transactional
	public void save(UsuariosModel model) {
		
		 
		
		_repository.save(model);
	}

	@Override
	@Transactional(readOnly = true)
	public UsuariosModel findById(Long id) {
		return _repository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(UsuariosModel model) {
		_repository.delete(model);
		
	}
}
