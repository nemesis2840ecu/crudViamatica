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
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;

import com.viamaica.crud.crud.models.PersonaModel;
import com.viamaica.crud.crud.services.IPersonaService;

@RestController
@RequestMapping("/api")
@CrossOrigin( origins = "http://localhost:4200")
public class PersonaController {
	
	//@Qualifier("ClienteService")
	@Autowired
	private IPersonaService personaService;
	
	PersonaModel _persona;
	
	@GetMapping("/personas")
	//@RequestMapping(value = "user/{id}")
	public ResponseEntity<?> getList() {
		return new ResponseEntity<>(personaService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/personas/{id}")
	public PersonaModel show(@PathVariable Long id) {
		return _persona;
		//return this.clienteService.findById(id);
	}

	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaModel create(@RequestBody PersonaModel persona) {
		persona.setFechaNacimiento(new Date());
		this.personaService.save(persona);
	
		return persona;
	}

	@PutMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaModel update(@RequestBody PersonaModel persona, @PathVariable Long id) {
		
		PersonaModel currentPersona = this.personaService.findById(id);
		currentPersona.setNombres(persona.getNombres());
		currentPersona.setApellidos(persona.getApellidos());
		currentPersona.setIdentificacion(persona.getIdentificacion());
		this.personaService.save(currentPersona);
		
		return currentPersona;
	}

	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<?> delete(@PathVariable Long id) {
		
		PersonaModel currentPersona = this.personaService.findById(id);
		if(currentPersona == null) {
			return new ResponseEntity<>(personaService.findAll(),HttpStatus.NOT_FOUND);
		}
		this.personaService.delete(currentPersona);
		return new ResponseEntity<>("Eliminado" ,HttpStatus.OK);	
		
		
	}
	
}
