package com.viamaica.crud.crud.services;

import java.util.List;
import com.viamaica.crud.crud.models.Rol_UsuariosModel;


public interface IRol_UsuariosServices {

	public List<Rol_UsuariosModel> findAll();

	public void save(Rol_UsuariosModel model);
	
	public Rol_UsuariosModel findById(Long id);
	
	public void delete(Rol_UsuariosModel model);
}
