package com.viamaica.crud.crud.services;

import java.util.List;
import com.viamaica.crud.crud.models.SessionsModel;


public interface ISessionsServices {

	public List<SessionsModel> findAll();

	public void save(SessionsModel model);
	
	public SessionsModel findById(Long id);
	
	public void delete(SessionsModel model);
}
