package com.viamaica.crud.crud.services;

import java.util.List;
import com.viamaica.crud.crud.models.Rol_Rol_OpcionesModel;


public interface IRol_Rol_OpcionesServices {

	public List<Rol_Rol_OpcionesModel> findAll();

	public void save(Rol_Rol_OpcionesModel cliente);
	
	public Rol_Rol_OpcionesModel findById(Long id);
	
	public void delete(Rol_Rol_OpcionesModel cliente);
}
