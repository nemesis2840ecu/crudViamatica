package com.viamaica.crud.crud.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viamaica.crud.crud.models.PersonaModel;
import com.viamaica.crud.crud.models.UsuariosModel;
import com.viamaica.crud.crud.repository.IPersonaRep;

@Service
public class PersonaSeviceImp implements IPersonaService {
	@Autowired
	//@Qualifier("modelsRepository")
	private IPersonaRep _personaResp; 
	
	@Override
	@Transactional
	public List< PersonaModel> findAll() {
		return (List<PersonaModel>) _personaResp.findAll();
		
	}
	
	@Override
	@Transactional
	public void save(PersonaModel model) {
		
		//GENERACION CORREO
		/*
		String correotemp = "";
		correotemp += model.getNombres().charAt(0);
		correotemp += model.getApellidos().split(" ")[0];
		correotemp += model.getApellidos().split(" ")[1].charAt(0);
		
		UsuariosModel user = new UsuariosModel();
		user.setIdUsuario(null);
		user.setMail(correotemp);
		user.setPassword(correotemp);
		
		model.setPassword( );
		*/
		
		_personaResp.save(model);
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaModel findById(Long id) {
		return _personaResp.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(PersonaModel model) {
		_personaResp.delete(model);
		
	}
}
