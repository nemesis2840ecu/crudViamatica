package com.viamaica.crud.crud.services;

import java.util.List;

import com.viamaica.crud.crud.models.PersonaModel;
import com.viamaica.crud.crud.models.Rol_OpcionesModel;

public interface IRol_OpcionesServices {

	public List<Rol_OpcionesModel> findAll();

	public void save(Rol_OpcionesModel model);
	
	public Rol_OpcionesModel findById(Long id);
	
	public void delete(Rol_OpcionesModel model);
}
