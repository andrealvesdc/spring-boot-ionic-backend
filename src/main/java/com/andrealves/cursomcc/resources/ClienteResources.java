package com.andrealves.cursomcc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andrealves.cursomcc.domain.Cliente;
import com.andrealves.cursomcc.services.ClienteService;

@SuppressWarnings("unused")
@RestController
@RequestMapping(value = "/clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> fing(@PathVariable Integer id) throws Exception {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
			
	}
}
