package com.viamaica.crud.crud.services;

import java.util.List;
import com.viamaica.crud.crud.models.PersonaModel;

public interface IPersonaService {
	
	
	public List<PersonaModel> findAll();
	
	public void save(PersonaModel model);
	
	public PersonaModel findById(Long id);
	
	public void delete(PersonaModel model);
}	
