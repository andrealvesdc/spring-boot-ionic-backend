package com.andrealves.cursomcc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andrealves.cursomcc.domain.Pedido;
import com.andrealves.cursomcc.services.PedidoService;

@SuppressWarnings("unused")
@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResources {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Pedido> fing(@PathVariable Integer id) throws Exception {
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
			
	}
}
