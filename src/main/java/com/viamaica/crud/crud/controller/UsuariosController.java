package com.viamaica.crud.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;

import com.viamaica.crud.crud.models.UsuariosModel;
import com.viamaica.crud.crud.services.IUsuariosServices;

@RestController
@RequestMapping("/Usuarios")
@CrossOrigin( origins = "http://localhost:4200")
public class UsuariosController{
	
	//@Qualifier("ClienteService")
	@Autowired
	private IUsuariosServices _Service;
	
	
	@GetMapping("/show")
	//@RequestMapping(value = "user/{id}")
	public ResponseEntity<?> getList() {
		return new ResponseEntity<>(_Service.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/show/{id}")
	public  UsuariosModel show(@PathVariable Long id) {
		
		return this._Service.findById(id);
	}

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuariosModel create(@RequestBody UsuariosModel model) {
		//model.setFechaNacimiento(new Date());
		this._Service.save(model);
	
		return model;
	}

	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuariosModel update(@RequestBody UsuariosModel model, @PathVariable Long id) {
		
		UsuariosModel currentPersona = this._Service.findById(id);
		//currentPersona.setNombres(model.getNombres());
		//currentPersona.setApellidos(model.getApellidos());
		//currentPersona.setIdentificaciopn(model.getIdentificaciopn());
		this._Service.save(currentPersona);
		
		return currentPersona;
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<?> delete(@PathVariable Long id) {
		
		UsuariosModel currentPersona = this._Service.findById(id);
		if(currentPersona == null) {
			return new ResponseEntity<>(_Service.findAll(),HttpStatus.NOT_FOUND);
		}
		this._Service.delete(currentPersona);
		return new ResponseEntity<>("Eliminado" ,HttpStatus.OK);	
		
		
	}
	
}
