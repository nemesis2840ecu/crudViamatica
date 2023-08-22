package com.viamaica.crud.crud.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viamaica.crud.crud.models.SessionsModel;
import com.viamaica.crud.crud.repository.ISessionsRep;

@Service
public class SessionsImp implements ISessionsServices {
	@Autowired
	//@Qualifier("modelsRepository")
	private ISessionsRep _repository; 
	
	@Override
	@Transactional
	public List< SessionsModel> findAll() {
		return (List<SessionsModel>) _repository.findAll();
		
	}
	
	@Override
	@Transactional
	public void save(SessionsModel model) {
		_repository.save(model);
	}

	@Override
	@Transactional(readOnly = true)
	public SessionsModel findById(Long id) {
		return _repository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(SessionsModel model) {
		_repository.delete(model);
		
	}
}
