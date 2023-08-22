package com.viamaica.crud.crud.services;

import java.util.List;

import com.viamaica.crud.crud.models.UsuariosModel;

public interface IUsuariosServices {
	
	public List<UsuariosModel> findAll();

	public void save(UsuariosModel model);
	
	public UsuariosModel findById(Long id);
	
	public void delete(UsuariosModel model);
}
