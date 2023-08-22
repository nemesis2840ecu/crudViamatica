package com.viamaica.crud.crud.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viamaica.crud.crud.models.RolModel;
import com.viamaica.crud.crud.repository.IRolRep;

@Service
public class RolSeviceImp implements IRolServices {
	@Autowired
	//@Qualifier("modelsRepository")
	private IRolRep _repository; 
	
	@Override
	@Transactional
	public List< RolModel> findAll() {
		return (List<RolModel>) _repository.findAll();
		
	}
	
	@Override
	@Transactional
	public void save(RolModel model) {
		_repository.save(model);
	}

	@Override
	@Transactional(readOnly = true)
	public RolModel findById(Long id) {
		return _repository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(RolModel model) {
		_repository.delete(model);
		
	}
}
