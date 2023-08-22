package com.viamaica.crud.crud.services;

import java.util.List;
import com.viamaica.crud.crud.models.RolModel;


public interface IRolServices {

	public List<RolModel> findAll();

	public void save(RolModel model);
	
	public RolModel findById(Long id);
	
	public void delete(RolModel model);
}
